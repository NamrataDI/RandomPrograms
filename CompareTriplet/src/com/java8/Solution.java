package com.java8;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the compareTriplets function below.
//    public static List<Integer> result = new ArrayList<Integer>(2);
//    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
//        Integer sumAi = 0;
//        Integer sumBi = 0;
//       for (int i=0; i<a.size(); i++){
//           if (a.get(i) > b.get(i)){
//               sumAi = sumAi + 1;
//           }
//           if (a.get(i) < b.get(i)) {
//               sumBi = sumBi + 1;
//           }
//
//       }
//
//        result.add(sumAi);
//        result.add(sumBi);
//        return result;
//    }

        static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        return null;
    }


    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());
//
//        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());
        List<Integer> a = new ArrayList<Integer>() {
            {
                add(5);
                add(3);
                add(2);
            }
        };

        List<Integer> b = new ArrayList<Integer>() {
            {
                add(2);
                add(3);
                add(5);
            }
        };
        List<Integer> result = compareTriplets(a, b);
        System.out.println("***RESULT***"+ result);

//        bufferedWriter.write(
//                result.stream()
//                        .map(Object::toString)
//                        .collect(joining(" "))
//                        + "\n"
//        );
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
    }
}

