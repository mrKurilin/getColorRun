class Game(private val flasks: List<Flask>) {

    fun start() {
        for (i in flasks.indices) {
            Transfusing(
                flasks = flasks.map { it.copy() },
                firstFlaskIndex = i
            ).transfuse()
        }
    }

    companion object {
        var winMoves: List<Move> = listOf()
    }
}