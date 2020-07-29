fun main(args: Array<String>){
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)
    println("I picked $gameChoice")
    println("You picked $userChoice")
    printResult(gameChoice, userChoice)

}

fun printResult(gameChoice: String, userChoice: String) {
    if (gameChoice == userChoice) println("We both chose $gameChoice! No winner, No Vanquished.")
    if (gameChoice == "Rock" && userChoice == "Scissors") println("I won! My $gameChoice will dull your $userChoice")
    if (gameChoice == "Scissors" && userChoice == "Rock") println("You won! Your $userChoice will dull my $gameChoice")
    if (gameChoice == "Scissors" && userChoice == "Paper") println("I won! My $gameChoice will cut your $userChoice")
    if (gameChoice == "Paper" && userChoice == "Scissors") println("You won! Your $userChoice will cut my $gameChoice")
    if (gameChoice == "Paper" && userChoice == "Rock") println("I won! My $gameChoice will cover your $userChoice")
    if (gameChoice == "Rock" && userChoice == "Paper") println("You won! Your $userChoice will cover my $gameChoice")
}

fun getUserChoice(optionsForUser: Array<String>): String {
    var isValidChoice = false
    var userChoice = ""

    while (!isValidChoice) {
        println("Please enter one of the following:")
        for (i in optionsForUser) print("$i ")
        println(":")
        val inputByUser = readLine()
        if (inputByUser != null && inputByUser in optionsForUser){
            isValidChoice = true
            userChoice = inputByUser
        }

        if (!isValidChoice) println("You must enter a valid option")
    }
    return userChoice
}

fun getGameChoice(optionsParams: Array<String> ): String {
     return optionsParams[(Math.random() * optionsParams.size).toInt()]
}
//
//fun playAgain(){
//    var rePlay = false
//    println("Do you want to play again? Yes or No:")
//    val enteredVal = readLine()
//
//    if (enteredVal == "Yes")
//}