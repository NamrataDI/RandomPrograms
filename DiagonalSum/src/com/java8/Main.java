package com.java8;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here,
        System.out.println("List"+arr);

        Integer firstNumber = 0;
        Integer secondNumber = 0;
        for (int i=0; i < arr.size(); i++)
        {
            System.out.println("loop i"+i);
            for (int j=0; j < arr.get(i).size();j++ )
            {
                System.out.println("loop j1::"+j);
                if (i==j){
                    firstNumber =firstNumber +arr.get(i).get(j);
                    System.out.println("firtNumber"+firstNumber);
                    break;
                }
            }

        }
        System.out.println("*******************************************************");
        for (int i=0; i < arr.size(); i++) {
            System.out.println("loop i"+i);
            System.out.println("arr "+i+" : "+arr.get(i));
            for (int j = (arr.get(i)).size()-1; j >= 0; j--) {
                System.out.println("loop j2::" + j);
                if (i==arr.size() - j - 1) {
                    secondNumber = secondNumber + arr.get(i).get(j);
                    System.out.println("secondNumber" + secondNumber);
                    break;
                }
            }
        }
        System.out.println("****firstNumber*****"+firstNumber);
        int diff = Math.abs(firstNumber -secondNumber);
        return diff;

    }




    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<List<Integer>> arr = new ArrayList<>();
//
//        IntStream.range(0, n).forEach(i -> {
//            try {
//                arr.add(
//                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                                .map(Integer::parseInt)
//                                .collect(toList())
//                );
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        });
        Integer arr[][] = {
                {11, 2, 4},
                {4, 5, 6},
                {10, 8, -12}
        };
        /**
         * converts arrays to list
         */
        List<Integer> listArray = Arrays.stream(arr).flatMap(Arrays::stream).collect(Collectors.toList());

        List<List<Integer>> listOfLists = Arrays.stream(Objects.requireNonNull(arr)).map(row -> {
            return Arrays.asList(Objects.nonNull(row) ? row : new Integer[0]);
        }).collect(Collectors.toList());

        int result = Main.diagonalDifference(listOfLists);
        int a = 100;
        System.out.println("******Result********" + (++a));
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();

    }
}
