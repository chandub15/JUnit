package com.stackroute;
import java.lang.*;

public class CharOut {

    public static String charCheck(char ch) {

        String str="";
        if(java.lang.Character.isUpperCase(ch)){
            str="Capital";
            return str;

        }
        else if(java.lang.Character.isLowerCase(ch)){
            str="LowerCase";
            return str;
        }
        else if(java.lang.Character.isDigit(ch)){
            str="Digit";
            return str;
        }
        else{
            str="Special Symbol";
            return str;
        }


    }
}
