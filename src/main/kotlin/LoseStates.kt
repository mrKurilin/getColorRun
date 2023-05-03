class LoseStates {

    private val states = mutableListOf<HashSet<Flask>>()

    fun add(flasks: HashSet<Flask>) {
        states.add(flasks)
    }

    fun contains(flasksToCheck: HashSet<Flask>): Boolean {
        states.forEach { flasks ->
            if (flasks.containsAll(flasksToCheck)) {
                return true
            }
        }
        return false
    }
}