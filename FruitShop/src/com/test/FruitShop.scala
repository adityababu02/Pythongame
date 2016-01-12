package com.test

/*
 * Simple Checkout System 
 * Pre assumptions :
 * 1.items fixed
 * 2.items cost fixed
 * 3.items checked out cart list is available in List of strings
 * 4.items case mismatch is handled
 */

import scala.util._
import scala.collection.mutable._


object FruitShop {
  
  
 
   
  def  main(args:Array[String]){
                               
     /*case class items(var apple:String,var price:Double)*/
    
     println("..............Welcome to FruitShop.................")
     println("---------------------------------------------------") 
     println("----------------ItemsAvailableInStore---------------\n")
     println("item\t\t"+"cost:\t")
     printf("1.Apple:(one each)\t"+":60p\n") 
     printf("2.Orange:(one each)\t"+":25p\n")
    
     var l= List("apple","apple","orange","2","orange","apple","apple")
     var invalid_items=List(null)

     //assuming the list is readily available 
     var apple_Count=0;
     var orange_Count=0;
     var invalid_Items=0;
     var sum=0.0;
    if(l.length<0)
      printf("sorry your cart is... empty try again::")
      else{
      l.foreach(
          
      x=>if (x.equalsIgnoreCase("Apple")) {
        apple_Count+=1
      }else if(x.equalsIgnoreCase("Orange")){
      
        orange_Count+=1
      }
      else{
        invalid_Items+=1
        println("Invalid items found.......:"+x+"\n")
        
      }
      )
     
      }
    
    
  println("Thanks for confirming the shopping cart.........\n")
  
  println(" --------you have bought ----------")
  
  println("Apples :"+apple_Count+"\t:"+"Oranges:"+orange_Count+"\n")
  
  println("invalid items:"+invalid_Items)
  
   println("Price before Discount :"+ showPrice(apple_Count)(orange_Count)+"pp")
  
  println(" ----applying discount------------")
  
  println("Please pay price (after discount):"+new ApplyDiscount(apple_Count,orange_Count).price+"pp")
  
  }
 
  def showPrice(i1:Int)(i2:Int):Double={
    
    i1*0.60+i2*0.25
   
  }
 
  
}