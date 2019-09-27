package com.loveablejerk;

public class Eligibility {

    public void isEligible(String name , int fatherIncome,int isEnrolled, int isHafiz, int isPositionHolder ){

   if (fatherIncome > 10000 & isEnrolled == 1){

   if(isHafiz == 1)
   { System.out.println("Congratulations! "+ name +" You're Eligible for need based scholarship and Hafiz-e-Quran Scholarship");
   }
   else { System.out.println("Congratulations! "+ name +" You're Eligible for need based scholarship");
   } }

   else if (isEnrolled ==1 & isPositionHolder ==1 ){
       System.out.println("Congratulations! "+ name +" You're Eligible for Position Holder's Scholarship");
   }

   else {
       System.out.println("Sorry" +name +" You're Not Eligible for any Scholarship");
   }

    }

}
