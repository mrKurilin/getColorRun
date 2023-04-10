data class Flask(
    private val liquids: MutableList<Liquid> = mutableListOf()
) {

    fun isEmpty(): Boolean = liquids.isEmpty()

    fun topLiquid(): Liquid = liquids.last()

    fun addLiquid(liquid: Liquid) {
        if (isFull()) {
            throw IllegalStateException("Trying to fill full flask")
        }

        if (freeSpace() < liquid.volume) {
            throw IllegalStateException("Trying to fill low free space flask")
        }

        if (this.isEmpty()) {
            liquids.add(liquid)
            return
        }

        if (topLiquid().color == liquid.color) {
            val newVolume = topLiquid().volume + liquid.volume
            liquids[liquids.lastIndex] = liquids.last().copy(volume = newVolume)
        } else {
            liquids.add(liquid)
        }
    }

    private fun freeSpace(): Int {
        return 4 - liquids.sumOf { liquid -> liquid.volume }
    }

    fun isOneColor(): Boolean {
        return liquids.map { it.color }.toSet().size == 1
    }

    fun isOneColorFull(): Boolean {
        return isFull() && isOneColor()
    }

    fun isNotSingleColor(): Boolean = !isOneColor()

    private fun isFull(): Boolean = freeSpace() == 0

    fun isNotFull(): Boolean = !isFull()

    fun canAccept(liquidToMove: Liquid): Boolean {
        return when {
            this.isEmpty() -> true
            this.topColor() != liquidToMove.color -> false
            this.topLiquid() === liquidToMove -> false
            this.freeSpace() < liquidToMove.volume -> false
            else -> true
        }
    }

    private fun topColor(): LiquidColor {
        return topLiquid().color
    }

    fun removeLiquid(volume: Int) {
        val topLiquidVolume = topLiquid().volume

        if (topLiquidVolume < volume) {
            throw IllegalStateException("Trying remove more liquid than flask's top liquid")
        }

        if (topLiquidVolume == volume) {
            liquids.removeLast()
        } else {
            val newVolume = topLiquid().volume - volume
            liquids[liquids.lastIndex] = liquids.last().copy(volume = newVolume)
        }
    }

    fun copy(): Flask {
        return Flask(this.liquids.map { it.copy() }.toMutableList())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || javaClass != other.javaClass) return false

        other as Flask

        if (liquids.size != other.liquids.size) return false
        for (i in liquids.indices) {
            if (liquids[i] != other.liquids[i]) return false
        }

        return true
    }

    override fun hashCode(): Int {
        return liquids.hashCode()
    }
}