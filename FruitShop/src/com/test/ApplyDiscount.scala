package com.test

/*
 * This class applies some discount on 
 * depending on the offer
 * apple----> buy one get one
 * oranges----> 3 for the price of 2
 */

class ApplyDiscount(var apples:Int,var oranges:Int) {
  
  def price:Double={
    
    var sum:Double=0;
    if(oranges==1 || oranges==2){
      
      sum+=oranges*0.25
    }
    
    else if(oranges>2){
      
      sum+=(oranges/3)*0.25+(oranges%3)*0.25
   
      
    }
    
    if(apples>=2){
      
      if(apples%2==0)
        sum+=0.50*apples*0.60
      else 
        sum+=0.50*apples*0.60+0.60   // add an extra apple if odd number 
    }
     
      
      
    
    0.0
    
  } 
  
}