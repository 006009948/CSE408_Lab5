/*
Justin Waterman
CSE408 Lab5
p4
 */

import java.io.File
import java.io.InputStream

fun main(){
    val inputStream: InputStream=File("test.txt").inputStream()
    val content= mutableListOf<String>()
    inputStream.bufferedReader().useLines {
        lines -> lines.forEach { content.add(it) }
        content.forEach { print("\n"+it) }
    }
    print("\n")
}