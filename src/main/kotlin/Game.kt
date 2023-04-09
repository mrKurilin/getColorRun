import kotlinx.coroutines.*

class Game(private val flasks: List<Flask>) {

    @OptIn(DelicateCoroutinesApi::class)
    fun start() = runBlocking {
        lateinit var job: Job

        for (i in flasks.indices) {
            job = GlobalScope.launch {
                Transfusing(
                    flasks = flasks.map { it.copy() },
                    firstFlaskIndex = i
                ).transfuse()
            }
        }

        job.join()
    }

    companion object {
        @Volatile
        var winMoves: List<Move> = listOf()
    }
}