import org.junit.Assert.assertEquals
import org.junit.Test

class MoneyTest {
    @Test
    fun testMultiplication() {
        val five: Dollar = Dollar(5)
        var product: Dollar = five.times(2)
        assertEquals(10, product.amount)
        product = five.times(3)
        assertEquals(15, product.amount)
    }
}