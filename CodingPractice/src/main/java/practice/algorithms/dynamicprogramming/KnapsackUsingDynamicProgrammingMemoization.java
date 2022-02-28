package practice.algorithms.dynamicprogramming;

//simple KnapSackProgram Using Recursion Greedy approach
//Better way to do is using Dynamic Programming where we don't solve already solved subproblems
class KnapsackUsingDynamicProgrammingMemoization {

  public int solveKnapsack(int[] profits, int[] weights, int capacity) {
	 int[][] memory = new int[profits.length][capacity+1];
    return solveKnapsack(memory, profits, weights, capacity, 0);
  }

  public int solveKnapsack(int[][] memory, int[] profits, int[] weights, int capacity, int index) {

      //Base Case
      if(capacity < 0 || index >= weights.length)
        return 0;

      int profitIncludingIndexItem = 0;
      
      //Compute  only if not already computed
      if(memory[index][capacity] == 0){
    	  if(weights[index] <= capacity){
    	        profitIncludingIndexItem = profits[index] + solveKnapsack(memory, profits, weights, capacity - weights[index], index + 1);
    	      }
    	      int profitExcludingIndexItem = solveKnapsack(memory, profits, weights, capacity, index + 1);

    	      int max = Math.max(profitIncludingIndexItem, profitExcludingIndexItem);
    	      memory[index][capacity] = max;
    	      
			return max;  
      }
      
      return memory[index][capacity];
      }

  public static void main(String[] args) {
	KnapsackUsingDynamicProgrammingMemoization ks = new KnapsackUsingDynamicProgrammingMemoization();
    int[] profits = {1, 6, 10, 16};
    int[] weights = {1, 2, 3, 5};
    int maxProfit = ks.solveKnapsack(profits, weights, 7);
    System.out.println("Total knapsack profit ---> " + maxProfit);
    maxProfit = ks.solveKnapsack(profits, weights, 6);
    System.out.println("Total knapsack profit ---> " + maxProfit);
  }
}