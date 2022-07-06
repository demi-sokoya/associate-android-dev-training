fun main() {
    val myFirstDice = Dice(6)
    println("Your ${myFirstDice.numSides} sided ${myFirstDice.diceColor()} dice rolled a ${myFirstDice.roll()}!")
    
    val mySecondDice = Dice(20)
    println("Your ${mySecondDice.numSides} sided dice rolled a ${mySecondDice.roll()}!")
    
    val my5CentCoin = Coin(5)
    println("Your ${my5CentCoin.cent} cent coin was a ${my5CentCoin.flip()}")
    
    val my10CentCoin = Coin(10)
    println("Your ${my10CentCoin.cent} cent coin was a ${my10CentCoin.flip()}")
    
    val my25CentCoin = Coin(25)
    println("Your ${my25CentCoin.cent} cent coin was a ${my25CentCoin.flip()}")
}

class Dice (val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
    
    fun diceColor(): String {
        return listOf("Blue", "Red", "Yellow").random()
    }
}

class Coin (val cent: Int) {
    fun flip(): String {
        return listOf("Heads", "Tails").random()
    }
}
