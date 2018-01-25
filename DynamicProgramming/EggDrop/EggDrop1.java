package EggDrop;

public class EggDrop1 {

    static int minimum = Integer.MAX_VALUE;
    public int drops(int n, int k) {
        if (n == 1 || k == 0 || k == 1) {
            return k;
        }
        for (int i = 1; i <= k; i++) {
            minimum = Math.min(minimum, 1 + Math.max(drops(n - 1, i - 1), drops(n, k - i)));
        }
        return minimum;
    }

    public static void main(String[] args) {
        EggDrop1 drop = new EggDrop1();
        int s = drop.drops(2, 36);
        System.out.println("-->" + s);
    }
}
