package org.example

import java.util

object ScalaFunctions {
  def main(args:Array[String]): Unit ={
    val input_map=Map("key1"->30,"key2"->40)

    // Creating an Empty List.
    val emptyList:List[Nothing]=List()
    //Map
    val collection = List(1, 3, 2, 5, 4, 7, 6)
    print(collection.filter(_>5))
    print(collection.map(x=>x*x))

    val portal = Seq("Geeks", "for", "Geeks")
    print(portal.flatMap(_.toUpperCase()))

    val devide=new PartialFunction[Int,Int] {
      def isDefinedAt(x: Int) = x!=0

      def apply(v1: Int)= 42/v1
    }

    println(devide.isDefinedAt(0))
    //println(devide.isDefinedAt(0))

    //closures => the result of fucntions will depend on another variable which declare outside of the method
    //Partial functions => partial function will not all the variable and provide the result, it uses subset of the variables and sends the result
    //Currying => process of transaforming the functions
    //def add(a:Int)=(b:int)=>a+b
    //add((6)(7))
    //Using partial functins
    //val sum = add2(29);
    //println(sum(5));

  }


}
