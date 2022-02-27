package practice.amazon;

public class MaximizeProfitProblemUsingGreedyApproach {

    public static void main(String[] args) {
        int capacity =3;
        int n =3;

        int[][] memory = new int[capacity][capacity];

        for(int i = 0; i< memory.length;i++){
            for(int j = 0; j< memory[i].length;j++){
                memory[i][j] = -1;
            }
        }
        memory[0][0] = 2;
        int[] passengers = {1, 2, 3};
        int[] start = {1, 2, 3};
        int[] end = {5, 4, 4};
        int[] fare = {2, 4, 2};

        System.out.println(getMaximumFare(memory,capacity-1, n-1, passengers, start, end, fare));
    }

    public static int getMaximumFare(int memory[][],int capacity, int n, int[] passengers, int[] start, int[] end, int[] fare){

        if(n == -1 )
            return 0;

        if(memory[capacity][n] != -1)
            return memory[capacity][n];
        int profitWithSelection = 0, profitWithoutSelection =0;

        if(start[n] >= n-1 && end[n] > n && passengers[n] <= capacity){
            profitWithSelection = (passengers[n] * fare[n]) + getMaximumFare(memory,capacity-passengers[n], n-1, passengers, start, end, fare)	;
        }

        profitWithoutSelection = getMaximumFare(memory, capacity, n-1, passengers, start, end, fare);

        memory[capacity][n] = Math.max(profitWithSelection, profitWithoutSelection);
        return memory[capacity][n];

    }
}
