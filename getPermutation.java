public class Solution {
    private boolean[] used;
    private int[] factorial;
    private int n;
    private int k;

    public String getPermutation(int n, int k) {
        this.n = n;
        this.k = k;
        //calculateFactorial(n);

        used = new boolean[n + 1];//为了要按照数字索取，所以要n+1
        Arrays.fill(used, false);

        StringBuilder path = new StringBuilder();
        dfs(0, path);
        return path.toString();
    }

    private void dfs(int index, StringBuilder path) {
        if (index == n) {
            return;
        }

        // 计算还未确定的数字的全排列的个数，第 1 次进入的时候是 n - 1
        int cnt = calculateFactorial(n - 1 - index); //第一次n=4-1=3,cnt=6
        for (int i = 1; i <= n; i++) {
            if (used[i]) {
                continue;
            }
            if (cnt < k) { 
                k -= cnt;
                continue;
            }
            path.append(i);
            used[i] = true;
            dfs(index + 1, path);
            return;
        }
    }


    //计算阶乘数组
    private int calculateFactorial(int n) {
        int[] factorial = new int[n + 1];
        factorial[0] = 1;
        int i = 1;
        for (; i <= n; i++) {
            factorial[i] = factorial[i - 1] * i;
        }
        return factorial[i-1];
    }
}