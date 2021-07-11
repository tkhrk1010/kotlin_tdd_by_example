class Dollar(amount: Int) : Money(amount) {

    // 型は引数のあとに定義
    fun times(multiplier: Int): Money {
        return Dollar(amount * multiplier)
    }
}
