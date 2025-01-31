package encrypt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	static Integer[][] dp;
	static int n, k;
	static int max = Integer.MIN_VALUE;
	static int[][] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		arr = new int[n][2];
		dp = new Integer[n][k+1];
		
		for(int i = 0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		System.out.println(dfs(n-1, k));
	}
	
	static int dfs(int a, int w) {
		if(a<0) return 0;
		if(dp[a][w] == null) {
			if(arr[a][0] > w) {
				dp[a][w] = dfs(a-1, w);
			}else if(arr[a][0] <= w) {
				dp[a][w] = Math.max(dfs(a-1, w), dfs(a-1, w - arr[a][0]) + arr[a][1]);
			}
		}
		
		return dp[a][w];
	}
}