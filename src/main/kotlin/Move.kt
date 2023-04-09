data class Move(
    val fromIndex: Int,
    val toIndex: Int,
    val movedLiquid: Liquid
) {
    override fun toString(): String {
        return "from ${fromIndex + 1} to ${toIndex + 1}"
    }
}