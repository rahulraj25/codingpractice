package practice.amazon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class HackerEarthShortestPathQuestion {
	
		    public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        PrintWriter wr = new PrintWriter(System.out);
	        int T = Integer.parseInt(br.readLine().trim());
	        for(int t_i = 0; t_i < T; t_i++)
	        {
	            int N = Integer.parseInt(br.readLine().trim());
	            int[][] edges = new int[N-1][2];
	            for(int i_edges = 0; i_edges < N-1; i_edges++)
	            {
	            	String[] arr_edges = br.readLine().split(" ");
	            	for(int j_edges = 0; j_edges < arr_edges.length; j_edges++)
	            	{
	            		edges[i_edges][j_edges] = Integer.parseInt(arr_edges[j_edges]);
	            	}
	            }
	            int Q = Integer.parseInt(br.readLine().trim());
	            String[] arr_queries = br.readLine().split(" ");
	            int[] queries = new int[Q];
	            for(int i_queries = 0; i_queries < arr_queries.length; i_queries++)
	            {
	            	queries[i_queries] = Integer.parseInt(arr_queries[i_queries]);
	            }

	            String[] out_ = dist_queries(N, edges, Q, queries);
	            System.out.print(out_[0]);
	            for(int i_out_ = 1; i_out_ < out_.length; i_out_++)
	            {
	            	System.out.print(" " + out_[i_out_]);
	            }
	            
	            System.out.println();
	            
	         }

	         wr.close();
	         br.close();
	    }
	    static String[] dist_queries(int N, int[][] edges, int Q, int[] queries){

	        String[] result = new String[Q];

	        int[][] adj0 = new int[N][N];
	        int currMax = Integer.MIN_VALUE;

	        for(int i = 0; i < edges.length; i++) {
	            adj0[(edges[i][0])-1][(edges[i][1])-1] = 1;
	            adj0[(edges[i][1])-1][(edges[i][0])-1] = 1;
	        }

	        for (int i = 0; i < adj0.length; i++) {
	            for (int j = 0; j < adj0[i].length; j++) {
	                if(i!=j && adj0[i][j]!=1)
	                    adj0[i][j] = Integer.MAX_VALUE;
	            }
	        }

	        for (int k = 0; k < N; k++) {    
	            for (int i = 0; i < adj0.length; i++) {
	                for (int j = 0; j < adj0[i].length; j++) {
	                    if(adj0[i][k] == Integer.MAX_VALUE || adj0[k][j] == Integer.MAX_VALUE){
	                    adj0[i][j] = Math.min(adj0[i][j],Integer.MAX_VALUE);
	                }else{
	                    adj0[i][j] = Math.min(adj0[i][j],adj0[i][k]+adj0[k][j]);
	                }

	                if(adj0[i][j] != Integer.MAX_VALUE && currMax < adj0[i][j]){
	                    currMax = adj0[i][j];
	                }
	                }
	            }
	        }

	       
	        for (int i = 0; i < queries.length; i++) {
	            if(queries[i] <= currMax+1)
	                result[i] = "YES";
	            else
	                result[i] = "NO";
	        }   

	        return result;
	    
	    }
    
}
