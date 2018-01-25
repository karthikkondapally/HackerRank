package EggDrop;

import java.util.Arrays;

public class EggDrop2 {

    static int n = 2, k = 36;
    static int minimum = Integer.MAX_VALUE;
    static int[][] eggsFloors = null;

    public int drops(int n, int k) {
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= k; j++) {
                for (int x = 1; x <= j; x++) {
                    if (i - 1 < 0 || i > n || x - 1 < 0 || j - x > k) {
                        continue;
                    }
                    minimum = 1 + Math.max(eggsFloors[i - 1][x - 1], eggsFloors[i][j - x]);
                    if (minimum < eggsFloors[i][j]) {
                        eggsFloors[i][j] = minimum;
                    }

                }
            }
        }
        return minimum;
    }

    public static void main(String[] args) {
        long t1 = System.nanoTime();
        EggDrop2 drop = new EggDrop2();
        eggsFloors = new int[n + 1][k + 1];
        fillEggFloors();
        int s = drop.drops(n, k);
        long t2 = System.nanoTime();
        System.out.println("-->" + eggsFloors[n][k] + " " + (t2 - t1));

    }

    private static void fillEggFloors() {
        for (int j = 1; j <= n; j++) {
            Arrays.fill(eggsFloors[j], Integer.MAX_VALUE);
            eggsFloors[j][1] = 1;
            eggsFloors[j][0] = 0;
        }

        for(int j =0 ; j<=k;j++){
            eggsFloors[1][j] = j;
        }

    }

}
