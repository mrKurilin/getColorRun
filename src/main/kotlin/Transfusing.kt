import Game.Companion.winMoves

class Transfusing(
    private val flasks: List<Flask>,
    private val firstFlaskIndex: Int
) {

    private val moves = mutableListOf<Move>()
    private var backedMove: Move? = null

    fun transfuse() {
        if (flasks[firstFlaskIndex].isEmpty()) {
            return
        }

        makeFirstMove()

        while (moves.isNotEmpty()) {
            val move = findMove()

            if (move != null) {
                makeMove(move)
            } else {
                moveBack()
            }
        }

        println("Done from $firstFlaskIndex")
    }

    private fun makeFirstMove() {
        val firstEmptyFlaskIndex = flasks.indexOfFirst { it.isEmpty() }
        val move = Move(
            fromIndex = firstFlaskIndex,
            toIndex = firstEmptyFlaskIndex,
            movedLiquid = flasks[firstFlaskIndex].topLiquid().copy()
        )
        makeMove(move)
    }

    private fun makeMove(move: Move) {
        val liquid = move.movedLiquid

        flasks[move.fromIndex].removeLiquid(liquid.volume)
        flasks[move.toIndex].addLiquid(liquid)

        moves.add(move)
        checkForWin()
    }

    private fun checkForWin() {
        if (isWin() && (winMoves.isEmpty() || winMoves.size > moves.size)) {
            winMoves = moves.map { it.copy() }
            println("${winMoves.size} moves:")
            println(winMoves.joinToString())
        }
    }

    private fun findMove(): Move? {
        if (winMoves.isNotEmpty() && moves.size > winMoves.size) {
            return null
        }

        val fromStartIndex = (backedMove?.fromIndex?.plus(1)) ?: 0
        var toStartIndex = (backedMove?.toIndex?.plus(1)) ?: 0

        backedMove = null

        for (fromIndex in fromStartIndex..flasks.lastIndex) {
            val fromFlask = flasks[fromIndex]

            val toIndex = findIndexTransfuseTo(fromFlask, toStartIndex)

            if (toIndex != null) {
                return Move(
                    fromIndex = fromIndex,
                    toIndex = toIndex,
                    movedLiquid = fromFlask.topLiquid().copy()
                )
            }

            toStartIndex = 0
        }

        return null
    }

    private fun findIndexTransfuseTo(
        flaskFromTransfuse: Flask,
        toStart: Int = 0
    ): Int? {

        if (flaskFromTransfuse.isEmpty() || flaskFromTransfuse.isOneColorFull()) {
            return null
        }

        val liquidToMove = flaskFromTransfuse.topLiquid()

        for (i in toStart..flasks.lastIndex) {
            val flaskToTransfuse = flasks[i]

            if (flaskFromTransfuse.isOneColor() && flaskToTransfuse.isEmpty()) {
                continue
            }

            if (flaskToTransfuse.canAccept(liquidToMove)) {
                return i
            }
        }
        return null
    }

    private fun moveBack() {
        val backedMove = moves.removeLast()

        val liquidToBack = backedMove.movedLiquid

        flasks[backedMove.toIndex].removeLiquid(liquidToBack.volume)
        flasks[backedMove.fromIndex].addLiquid(liquidToBack)

        this.backedMove = backedMove
    }

    private fun isWin(): Boolean {
        for (flask in flasks) {
            if (flask.isEmpty()) {
                continue
            }

            if (flask.isNotSingleColor()) {
                return false
            }

            if (flask.isOneColor() && flask.isNotFull()) {
                return false
            }
        }
        return true
    }
}