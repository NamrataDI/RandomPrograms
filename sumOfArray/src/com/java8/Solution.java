package com.java8;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Arrays.*;

public class Solution {

    /*
     * Complete the simpleArraySum function below.
     */
//    private static int sum = 0;
//    static int simpleArraySum(int[] ar) {
//        for (int i = 0; i < ar.length; i++) {
//            sum = sum + ar[i];
//        }
//        return sum;
//    }

    /*
     * Complete the simpleArraySum function below.
     */
    private static int sum = 0;
    static int simpleArraySum(int[] ar) {
        List<Integer> intList = IntStream.range(0, ar.length).mapToObj((int i) -> ar[i]).collect(Collectors.toList());
        /**
         * Stream.reduce()
         */
//        Integer sum = intList.stream().reduce(0, (integer, integer2) -> (integer+integer2));
        /**
         * IntStream.sum()
         */
//        Integer sum = intList.stream().reduce(0, Integer::sum);
//        Integer sum = intList.stream().mapToInt(Integer::intValue).sum();
        /**
         * Stream.collect()
         */
        Integer sum = intList.stream()
                .collect(Collectors.summingInt(Integer::intValue));
        return sum;
    }



//    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int arCount = Integer.parseInt(scanner.nextLine().trim());
//
//        int[] ar = new int[arCount];
//
//        String[] arItems = scanner.nextLine().split(" ");
//
//        for (int arItr = 0; arItr < arCount; arItr++) {
//            int arItem = Integer.parseInt(arItems[arItr].trim());
//            ar[arItr] = arItem;
//        }
        int[] ar = {1,2,3,4};
        int result = simpleArraySum(ar);
        System.out.println("***SUM****"+ result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
    }
}
