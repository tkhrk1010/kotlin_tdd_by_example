class Franc(amount: Int) : Money(amount) {

    // 型は引数のあとに定義
    fun times(multiplier: Int): Franc {
        return Franc(amount * multiplier)
    }

}