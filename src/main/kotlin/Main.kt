private fun Int.coinProblem(list: List<Int>) : Int {

    val coinList = list.sortedDescending()

    var coinCount = 0
    var money = this
    var coinNum: Int

    for(coin in coinList) {
        coinNum = money / coin
        coinCount += coinNum

        money -= coinNum * coin
    }
    return coinCount

}

fun main(args: Array<String>) {
    val coinList = listOf(1,100,50,500)
    println(4720.coinProblem(coinList))
}