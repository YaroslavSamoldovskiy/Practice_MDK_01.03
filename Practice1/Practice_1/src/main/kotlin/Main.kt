import java.lang.Math.pow
import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {

    //number 1..5
    val exercises = 13
    val age:Int = 18
    val testNumber:Int = 24
    val evenOdd = testNumber/2

    val str:String = "Finish result: "

    var answer:Int = 0
    var exercisesSolved = 0
    var dontAge:Double = age.toDouble()
    dontAge = (18 +30.0)/2
    print(str)
    println((((answer+1)+10)*10) shr 3 )
    println("/*-------------------------------------------------------------------*/")

    /*-------------------------------------------------------------------*/
    //number 6-7
    var age1 = 16
    println(age1)
    age1 = 30
    println(age1)


    val a: Int = 46
    val b: Int = 10

    // 1
    val answer1: Int = (a * 100) + b

    //2
    val answer2: Int = (a * 100) + (b * 100)

    //3
    val answer3: Int = (a * 100) + (b / 10)

    println ("Answer 1 : $answer1 \nAnswer 2 : $answer2 \nAnswer 3 : $answer3")
    println("/*-------------------------------------------------------------------*/")

    /*-------------------------------------------------------------------*/
    //number8
    var firstValue = 5*3-4/2*2
    var secondValue = ((5*3)-((4/2)*2))
    println("firstValue: $firstValue \nsecondValue: $secondValue")
    println("/*-------------------------------------------------------------------*/")
    /*-------------------------------------------------------------------*/
    //number9
    val a1:Double = 56.2
    val b1:Double = 96.7
    val average = (a1+b1)/2
    println("average: $average")
    println("/*-------------------------------------------------------------------*/")
    /*-------------------------------------------------------------------*/
    //number10
    val fahrenheit:Double = 451.0
    val celcius = fahrenheit/1.8-32
    println("result: $celcius")
    println("/*-------------------------------------------------------------------*/")
    /*-------------------------------------------------------------------*/
    //number11
    val position: Int=23
    var iter: Int=0
    var row: Int=0
    var column: Int=0
    for (i in 0..7){
        for (j in 0..7)
        {
            iter++
            if(position == iter)
                row=i+1
                column=j+1
            break
        }
    }
    println(row)
    println(column)
    println()

    //number12

    val Pi:Double=3.14
    val degrees:Double=265.0
    val radians:Double=degrees*Pi/180
    println(radians)
    println("/*-------------------------------------------------------------------*/")


    //number13
    val x1:Double=32.1
    val y1:Double=10.8
    val x2:Double=13.2
    val y2:Double=-16.6
    val distance:Double= sqrt((x2-x1).pow(2)+(y2-y1).pow(2))
    println("Distance beetwen points: $distance")

}