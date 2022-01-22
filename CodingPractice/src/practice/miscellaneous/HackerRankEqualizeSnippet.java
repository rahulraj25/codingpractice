package miscellaneous;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



class Result {

    /*
     * Complete the 'equalize' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER_ARRAY power as parameter.
     */

    public static long equalize(List<Long> power) {
        
        Collections.sort(power);
        //find median of numners
        
        int size = power.size();
        long median;
		if(size %2 == 0){
        	median = (power.get(size/2) + power.get((size-1)/2))/2; 
        }else{
        	median = power.get(size/2);
        }
		System.out.println(median);
		long diff = 0L;
		for (Long num : power) {
			diff += ((num >= median) ? (num -median) : (median - num));
		}
		return diff;
    }

}

public class HackerRankEqualizeSnippet {
    public static void main(String[] args) throws IOException {
        /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int powerCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Long> power = IntStream.range(0, powerCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Long::parseLong)
            .collect(toList());
*/
        ArrayList<Long> power = new ArrayList<Long>();
        /*power.add(2L);
        power.add(5L);
        power.add(3L);
        power.add(6L);
        power.add(7L);
        power.add(1L);*/
        /*power.add(10L);
        power.add(20L);
        power.add(30L);
        power.add(40L);
        power.add(50L);
        power.add(51L);
        power.add(52L);
        power.add(53L);
        power.add(54L);
        power.add(55L);*/
        power.add(1L);  power.add(2L); power.add(3L); power.add(4L); power.add(5L);
		System.out.println(Result.equalize(power));

        /*bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
*/    }
}
