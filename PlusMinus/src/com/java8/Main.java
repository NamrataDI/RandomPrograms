package com.java8;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class Main {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
    List<Float> positive = new ArrayList<>();
    List<Float> negative = new ArrayList<>();
    List<Float> zero = new ArrayList<>();

        for (int arrElement:arr) {
            if (arrElement<0)
            {
                negative.add((float) arrElement);
            }else if (arrElement>0){
                positive.add((float)arrElement);
            }
            else {
                zero.add((float)arrElement);
            }
        }

        System.out.println("positive::"+positive.size()+"negative::"+negative.size()+"zero::"+zero.size()+"arr::"+arr.length);
        double positiveNum = positive.size()/(float)(arr.length);
        double negativeNum = negative.size()/(float)arr.length;
        double zeroNum = zero.size()/(float)arr.length;

        System.out.println(positiveNum);
        System.out.println(negativeNum);
        System.out.println(zeroNum);
    }

//    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        int[] arr = new int[n];
//
//        String[] arrItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            int arrItem = Integer.parseInt(arrItems[i]);
//            arr[i] = arrItem;
//        }
        int[] arr = new int[]{1,5,0,-3,4,-9};
        plusMinus(arr);

//        scanner.close();
    }
}

