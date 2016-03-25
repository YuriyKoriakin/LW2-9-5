package com.brainacad.oop.testsregexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Yuriy on 25.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        String[] arr = {"VOVA", "Ivan", "R2d2", "ZX", "Anna", "12345", "ToAd", "TomCat", " "};
        for (String element : arr) {
            System.out.println(checkPersonWithRegExp(element));
        }
    }
    //This method must return true only if argument string value begin from Uppercase, then other
    // chars in Lowercase and contains only letters.
    public static boolean checkPersonWithRegExp(String userNameString){
        Pattern p = Pattern.compile("^[A-Z]{1}[a-z]*");
        Matcher m = p.matcher(userNameString);
        return m.matches();
    }
}
