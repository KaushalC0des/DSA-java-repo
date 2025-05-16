public class climbStairs {
    public static void main(String[] args) {
        int n = 5;  // Change this value to test different inputs
        int result = climbstairs(n);
        System.out.println("Number of ways to climb " + n + " stairs: " + result);
    }

    public static int climbstairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}

