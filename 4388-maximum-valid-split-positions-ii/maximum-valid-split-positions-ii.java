class Solution {
    public int solve(int[] pre, int[] suff, int skip, int[] a) {
        int n = a.length;
        for (int i = 1; i <= n; i++) {
            if (i - 1 == skip) {
                pre[i] = pre[i - 1];
                continue;
            }
            pre[i] = gcd(pre[i - 1], a[i - 1]);
        }
        for (int i = n - 1; i >= 0; i--) {
            if (i == skip) {
                suff[i] = suff[i + 1];
                continue;
            }
            suff[i] = gcd(suff[i + 1], a[i]);
        }
        int curr = 0;
        for (int i = 0; i < n - 1; i++) {
            if (i == skip) continue;
            if (pre[i + 1] == suff[i + 1]) curr++;
        }
        return curr;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public int maxValidSplits(int[] a) {
        int n = a.length, ans = 0;
        int[] premain = new int[n + 1];
        for (int i = 1; i <= n; i++)
            premain[i] = gcd(premain[i - 1], a[i - 1]);
        for (int i = 0; i <= n; i++) {
            if (i > 0 && premain[i] == premain[i - 1]) continue;
            int skip = i - 1;
            int[] pre = new int[n + 1];
            int[] suff = new int[n + 1];
            ans = Math.max(ans, solve(pre, suff, i - 1, a));
        }
        return ans;
    }
}