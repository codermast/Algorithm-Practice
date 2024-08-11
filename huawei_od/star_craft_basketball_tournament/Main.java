package star_craft_basketball_tournament;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int t = scanner.nextInt();
        int[] arr = new int[t];

        for (int i = 0; i < t; i++) {
            arr[i] = scanner.nextInt();
        }

        // 排序
        Arrays.sort(arr);

        // 默认最小MVP得分为得分的最大值
        int minMVP = arr[t - 1];


    }
}
