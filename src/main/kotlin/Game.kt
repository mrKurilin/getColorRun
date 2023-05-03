import kotlinx.coroutines.*

class Game(private val flasks: List<Flask>) {

    fun start() = runBlocking {
        val scope = CoroutineScope(Job() + Dispatchers.Default)

        val jobs = mutableListOf<Job>()

        for (i in flasks.indices) {
            jobs += scope.launch {
                Transfusing(
                    flasks = flasks.map { it.copy() },
                    firstFlaskIndex = i
                ).transfuse()
            }
        }
        jobs.joinAll()
    }

    companion object {

        @Volatile
        var winMoves: List<Move> = listOf()

        @Synchronized
        fun checkWinMoves(moves: List<Move>) {
            if (winMoves.isEmpty() || winMoves.size > moves.size) {
                winMoves = moves.map { it.copy() }
                println("${winMoves.size} moves:")
                println(winMoves.joinToString())
            }
        }
    }
}