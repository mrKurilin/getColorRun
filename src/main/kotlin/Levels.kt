class Levels {

    private val flasks = mutableListOf<Flask>()

    fun getTestFlasks(): List<Flask> {
        flasks.clear()

        flasks.add(
            Flask(
                liquids = mutableListOf(
                    Liquid(
                        volume = 2,
                        color = LiquidColor.BLUE
                    ),
                    Liquid(
                        volume = 2,
                        color = LiquidColor.GREEN
                    )
                )
            )
        )

        flasks.add(
            Flask(
                liquids = mutableListOf(
                    Liquid(
                        volume = 2,
                        color = LiquidColor.GREEN
                    ),
                    Liquid(
                        volume = 2,
                        color = LiquidColor.BLUE
                    )
                )
            )
        )

        flasks.add(Flask())

        return flasks
    }

    fun get181lvl(): List<Flask> {
        flasks.clear()

//        1
        flasks.add(
            Flask(
                mutableListOf(
                    Liquid(1, LiquidColor.YELLOW),
                    Liquid(1, LiquidColor.BROWN),
                    Liquid(1, LiquidColor.SALAD),
                    Liquid(1, LiquidColor.ORANGE),
                )
            )
        )
//        2
        flasks.add(
            Flask(
                mutableListOf(
                    Liquid(3, LiquidColor.BURGUNDY),
                    Liquid(1, LiquidColor.PINK),
                )
            )
        )

//        3
        flasks.add(
            Flask(
                mutableListOf(
                    Liquid(1, LiquidColor.WHITE),
                    Liquid(1, LiquidColor.VIOLET),
                    Liquid(1, LiquidColor.SALAD),
                    Liquid(1, LiquidColor.LIGHTRED),
                )
            )
        )

//        4
        flasks.add(
            Flask(
                mutableListOf(
                    Liquid(1, LiquidColor.PINK),
                    Liquid(1, LiquidColor.VIOLET),
                    Liquid(1, LiquidColor.BLUE),
                    Liquid(1, LiquidColor.SALAD),
                )
            )
        )

//        5
        flasks.add(
            Flask(
                mutableListOf(
                    Liquid(1, LiquidColor.LIGHTRED),
                    Liquid(1, LiquidColor.DARKGREEN),
                    Liquid(1, LiquidColor.LIGHTBLUE),
                    Liquid(1, LiquidColor.PINK),
                )
            )
        )

//        6
        flasks.add(
            Flask(
                mutableListOf(
                    Liquid(1, LiquidColor.WHITE),
                    Liquid(1, LiquidColor.LIGHTBLUE),
                    Liquid(1, LiquidColor.SALAD),
                    Liquid(1, LiquidColor.DARKGREEN),
                )
            )
        )

//        7
        flasks.add(
            Flask(
                mutableListOf(
                    Liquid(1, LiquidColor.BROWN),
                    Liquid(1, LiquidColor.DARKGREEN),
                    Liquid(1, LiquidColor.YELLOW),
                    Liquid(1, LiquidColor.LIGHTRED),
                )
            )
        )

//        8
        flasks.add(
            Flask(
                mutableListOf(
                    Liquid(1, LiquidColor.BROWN),
                    Liquid(2, LiquidColor.ORANGE),
                    Liquid(1, LiquidColor.YELLOW),
                )
            )
        )

//        9
        flasks.add(
            Flask(
                mutableListOf(
                    Liquid(1, LiquidColor.BLUE),
                    Liquid(1, LiquidColor.BURGUNDY),
                    Liquid(1, LiquidColor.ORANGE),
                    Liquid(1, LiquidColor.BLUE),
                )
            )
        )

//        10
        flasks.add(
            Flask(
                mutableListOf(
                    Liquid(1, LiquidColor.PINK),
                    Liquid(1, LiquidColor.WHITE),
                    Liquid(1, LiquidColor.BLUE),
                    Liquid(1, LiquidColor.DARKGREEN),
                )
            )
        )

//        11
        flasks.add(
            Flask(
                mutableListOf(
                    Liquid(1, LiquidColor.VIOLET),
                    Liquid(1, LiquidColor.WHITE),
                    Liquid(2, LiquidColor.LIGHTBLUE),
                )
            )
        )

//        12
        flasks.add(
            Flask(
                mutableListOf(
                    Liquid(1, LiquidColor.LIGHTRED),
                    Liquid(1, LiquidColor.YELLOW),
                    Liquid(1, LiquidColor.VIOLET),
                    Liquid(1, LiquidColor.BROWN),
                )
            )
        )

        flasks.add(
            Flask(
                mutableListOf()
            )
        )

        flasks.add(
            Flask(
                mutableListOf()
            )
        )

        return flasks
    }

    fun get182lvl(): List<Flask> {
        flasks.clear()

//        1
        flasks.add(
            Flask(
                mutableListOf(
                    Liquid(1, LiquidColor.BURGUNDY),
                    Liquid(1, LiquidColor.PINK),
                    Liquid(2, LiquidColor.LIGHTBLUE),
                )
            )
        )
//        2
        flasks.add(
            Flask(
                mutableListOf(
                    Liquid(1, LiquidColor.ORANGE),
                    Liquid(1, LiquidColor.WHITE),
                    Liquid(1, LiquidColor.LIGHTBLUE),
                    Liquid(1, LiquidColor.WHITE),
                )
            )
        )

//        3
        flasks.add(
            Flask(
                mutableListOf(
                    Liquid(1, LiquidColor.SALAD),
                    Liquid(1, LiquidColor.WHITE),
                    Liquid(1, LiquidColor.YELLOW),
                    Liquid(1, LiquidColor.BURGUNDY),
                )
            )
        )

//        4
        flasks.add(
            Flask(
                mutableListOf(
                    Liquid(1, LiquidColor.YELLOW),
                    Liquid(1, LiquidColor.ORANGE),
                    Liquid(1, LiquidColor.SALAD),
                    Liquid(1, LiquidColor.YELLOW),
                )
            )
        )

//        5
        flasks.add(
            Flask(
                mutableListOf(
                    Liquid(1, LiquidColor.YELLOW),
                    Liquid(1, LiquidColor.LIGHTBLUE),
                    Liquid(1, LiquidColor.ORANGE),
                    Liquid(1, LiquidColor.BURGUNDY),
                )
            )
        )

//        6
        flasks.add(
            Flask(
                mutableListOf(
                    Liquid(3, LiquidColor.PINK),
                    Liquid(1, LiquidColor.ORANGE),
                )
            )
        )

//        7
        flasks.add(
            Flask(
                mutableListOf(
                    Liquid(1, LiquidColor.WHITE),
                    Liquid(1, LiquidColor.SALAD),
                    Liquid(1, LiquidColor.BURGUNDY),
                    Liquid(1, LiquidColor.SALAD),
                )
            )
        )

//        8
        flasks.add(Flask(mutableListOf()))

        return flasks
    }
}