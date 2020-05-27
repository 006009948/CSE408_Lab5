/*
Justin Waterman
CSE408 Lab 5
p5
 */

//No Inheritance
class footBaller(val name: String="",var age:Int){
    fun talk(){print("My name is $name \n My age is $age \n and I play football\n")}
    fun walk(){print("footballer walking\n")}
    fun playFootball(){print("footballer plays football\n")}
}
class MathTeacher(val name: String="",var age:Int){
    fun talk(){print("My name is $name \n My age is $age \n and I teach math\n")}
    fun walk(){print("teacher walking\n")}
    fun teachMath(){print("teacher teaching\n")}
}
class Businessman(val name: String="",var age:Int){
    fun talk(){print("My name is $name \n My age is $age \n and I do business\n")}
    fun walk(){print("Businessman is walking\n")}
    fun runBusiness(){print("Businessman running business\n")}
}

//Inheritance
class footBaller2:Person("Footballer"){
    fun playFootball(){print("Footballer plays even better\n")}
}
class mathTeacher2:Person("Math Teacher"){
    fun teachMath(){print("Math Teacher teaches even better\n")}
}
class businessman2:Person("Businessman"){
    fun runBusiness(){print("Business man does better business\n")}
}

open class Person(var job:String=""){
    var age: Int=0
    var name: String=""
    fun talk(){print("Person talks\n")}
    fun walk(){print("Person walks\n")}
    fun eat(){print("Person eats\n")}
}


fun main(){
    //No Inheritance
    val guy1=footBaller("Greg",24)
    val guy2=MathTeacher("Drew",35)
    val guy3=Businessman("Reggie",44)
    guy1.talk()
    guy1.walk()
    guy1.playFootball()
    //print("\n")
    guy2.talk()
    guy2.walk()
    guy2.teachMath()
    //print("\n")
    guy3.talk()
    guy3.walk()
    guy3.runBusiness()
    print("\n")
    //Inheritance
    val guy4=footBaller2()
    val guy5=mathTeacher2()
    val guy6=businessman2()
    guy4.name="George"
    guy4.age=32
    guy4.talk()
    guy4.walk()
    guy4.playFootball()
    //print("\n")
    guy5.name="Chuck"
    guy5.age=29
    guy5.talk()
    guy5.walk()
    guy5.teachMath()
    //print("\n")
    guy6.name="Anthony"
    guy6.age=22
    guy6.talk()
    guy6.walk()
    guy6.runBusiness()
    print("\n")
}