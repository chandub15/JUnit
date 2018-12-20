package com.stackroute;


public class PalAndSum extends Palindrome{

    public static String palAndSumCheck(Long num) {

        Palindrome p = new Palindrome();
        p.numReverse(num);
        if(num==p.reverse){


            if(p.sum>25){
                return num+" is palindrome and sum of numbers is greater than 25";
            }
            else{
                return num+" is palindrome and sum of numbers is less than 25";
            }
        }
        else {
            return num+" is not a palindrome";
        }

    }
}





