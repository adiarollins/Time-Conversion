import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import java.util.Scanner;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
        boolean morningOrNight = true;
        char arr[] = new char[s.length()];
        if (s.charAt(8) == ('A')) {
            morningOrNight = true;
        } else {
            morningOrNight = false;
        }
        
        for (int i = 0; i < s.length();i++) {
            arr[i] = s.charAt(i);
        }

        // Checks for 12am
        if (morningOrNight == true && arr[0] == ('1') && arr[1] == ('2')) {
            arr[0] = '0';
            arr[1] = '0'; 
        } else if (morningOrNight == false && arr[0] == ('1') && arr[1] == ('2') ) {
        } else if (morningOrNight == false) {
            String hourArr[] = s.split(":");
            String hour = hourArr[0];
            int mTime = Integer.parseInt(hour) + 12;
            hour = Integer.toString(mTime);
            arr[0] = hour.charAt(0);
            arr[1] = hour.charAt(1);
        } 
        
        for (int i = 0; i < arr.length - 2; i++) {
            System.out.print (arr[i]);
        }
        return s;
    }

}