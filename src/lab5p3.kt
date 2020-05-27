/*
Justin Waterman
CSE408 Lab 5
p3
 */

fun main() {
    var cardPoints = 10000
    val cardLevel: String

    when(cardPoints){
        in 0..999 -> cardLevel="pearl"
        in 1000..4999 -> cardLevel="silver"
        in 5000..9999 -> cardLevel="gold"
        else -> cardLevel="platinum"
    }


    /*
    // TODO: replace this if with a when
    // try to use  ranges!

    val cardLevel: String = if (cardPoints >= 0 && cardPoints < 1000) {
        "pearl"
    } else if (cardPoints >= 1000 && cardPoints < 5_000) {
        "silver"
    } else if (cardPoints >= 5_000 && cardPoints < 10_000) {
        "gold"
    } else {
        "platinum"
    }
    */
    val plural = if(cardPoints > 1 || cardPoints == 0) "s" else ""
    println("You have $cardPoints point$plural and are at the $cardLevel level.")
}