package Dynamic_Programming_Part5;

public class Q_Wild_Card_Matching {
    // TC = O(n*m)
    public static boolean isMatch(String s, String p){
        int n = s.length();
        int m = p.length();
        boolean dp[][] = new boolean[n+1][m+1];

        // Initialize
        dp[0][0] = true;
        for(int i=1; i<n+1; i++){
            dp[i][0] = false;
        }
        for(int j=1; j<m+1; j++){
            if(p.charAt(j-1) == '*'){
                dp[0][j] = dp[0][j-1];
            }
        }

        // Filling
        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                // Case 1
                if(s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '?'){
                    dp[i][j] = dp[i-1][j-1];
                }
                // Case 2
                else if(p.charAt(j-1) == '*'){
                    dp[i][j] = dp[i][j-1] || dp[i-1][j];
                }
                // Case 3
                else{
                    dp[i][j] = false;
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String args[]){
        String s = "baaabab";
        String p = "*****ba*****ab";
        System.out.println(isMatch(s, p));
    }
}
