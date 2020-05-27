/*
Justin Waterman
CSE408 Lab 5
p1
 */
fun main() {
    val x:Int
    val y:Int
    print("First Number: ")
    x= Integer.valueOf(readLine())
    print("Second Number: ")
    y= Integer.valueOf(readLine())
    println(comparison(x,y))
}

fun comparison(x:Int,y:Int): Int {
    var ans:Int
    if(x<y) {ans=1}
    else {ans=0}
    return ans
}