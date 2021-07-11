class Dollar(var amount: Int) {

    // 型は引数のあとに定義
    fun times(multiplier: Int): Dollar {
        return Dollar(amount * multiplier)
    }

}
