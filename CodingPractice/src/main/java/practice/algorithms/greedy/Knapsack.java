package practice.algorithms.greedy;

//simple KnapSackProgram Using Recursion Greedy approach
//Better way to do is using Dynamic Programming where we don't solve already solved subproblems
class KnapsackUsingRecursion {

  public int solveKnapsack(int[] profits, int[] weights, int capacity) {
    return solveKnapsackRecursion(profits, weights, capacity, 0);
  }

  public int solveKnapsackRecursion(int[] profits, int[] weights, int capacity, int index) {

      //Base Case
      if(capacity < 0 || index >= weights.length)
        return 0;

      int profitIncludingIndexItem = 0;

      if(weights[index] <= capacity){
        profitIncludingIndexItem = profits[index] + solveKnapsackRecursion(profits, weights, capacity - weights[index] , index + 1);
      }
      int profitExcludingIndexItem = solveKnapsackRecursion(profits, weights, capacity, index + 1);

      return Math.max(profitIncludingIndexItem, profitExcludingIndexItem);
}

  public static void main(String[] args) {
	KnapsackUsingRecursion ks = new KnapsackUsingRecursion();
    int[] profits = {1, 6, 10, 16};
    int[] weights = {1, 2, 3, 5};
    int maxProfit = ks.solveKnapsack(profits, weights, 7);
    System.out.println("Total knapsack profit ---> " + maxProfit);
    maxProfit = ks.solveKnapsack(profits, weights, 6);
    System.out.println("Total knapsack profit ---> " + maxProfit);
  }
}