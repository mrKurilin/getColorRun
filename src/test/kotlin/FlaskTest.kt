import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class FlaskTest {

    @Test
    fun `init with wrong filling`() {
        assertThrows<IllegalStateException> {
            Flask(
                mutableListOf(Liquid(2, LiquidColor.BLUE))
            )
        }
    }

    @Test
    fun `norm init`(){
        Flask(
            mutableListOf(Liquid(4, LiquidColor.BLUE))
        )
    }


}