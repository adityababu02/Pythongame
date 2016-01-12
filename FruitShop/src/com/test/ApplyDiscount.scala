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
    
    if(oranges>0){
      
      if(oranges>=3)
      sum+=0.66*oranges*0.25
      else 
        sum+=0.25*oranges
    }
    0.0
  } 
  
}