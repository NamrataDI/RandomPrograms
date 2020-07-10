package com.java8;

import java.io.IOException;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {
        List<Long> longList = IntStream.range(0, ar.length).mapToObj((int i) -> ar[i]).collect(Collectors.toList());
        LongSummaryStatistics longSummaryStatistics = longList.stream().mapToLong(number -> number).summaryStatistics();
        return longSummaryStatistics.getSum();

    }

//    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int arCount = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        long[] ar = new long[arCount];
//
//        String[] arItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < arCount; i++) {
//            long arItem = Long.parseLong(arItems[i]);
//            ar[i] = arItem;
//        }
        long ar[]={10000001, 20000002, 30000003};
        long result = aVeryBigSum(ar);
        System.out.println("*********RESUT*********" + result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
    }

}
