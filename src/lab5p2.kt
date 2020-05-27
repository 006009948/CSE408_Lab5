/*
Justin Waterman
CSE408 Lab 5
p2
 */
fun main(){
    print("Enter an age: ")
    val age=Integer.valueOf(readLine())
    agerange(age)
}

fun agerange(x:Int){
    when(x){
        in 0..20 -> print("Family")
        in 21..59 -> print("Normal")
        in 60..100 -> print("Senior")
        else -> print("Invalid age")
    }
}