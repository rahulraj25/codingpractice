package practice.amazon;

import java.util.ArrayList;
import java.util.List;

public class FindNumberOfConsecutiveDecreasingTrendsBadAttempt {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
       // list.add(2); list.add(1); list.add(3); //list.add(1); list.add(1);
        //list.add(4); list.add(3); list.add(5); list.add(4); list.add(3);
        //System.out.println(countDecreasingRatings(list) + list.size());
        list.add(3); list.add(2);  list.add(1); list.add(0); list.add(0);  list.add(1); list.add(2);  list.add(3);
        System.out.println(countDecreasingRatings(list));

    }

    public static long countDecreasingRatings(List<Integer> ratings) {
        int tempResult =0, result =0;
        for (int i = 1; i <= ratings.size(); i++) {

            tempResult = countDecreasingRatingsWithSpan(i,ratings);

            if(tempResult == 0)
                return result;
            else
                result += tempResult;

        }
        return result;
    }

    private static int countDecreasingRatingsWithSpan(int i, List<Integer> ratings) {
        int counter =0, result = 0;
        if(i==1)
            return ratings.size();
        else {
            int  k=0;
            for (int j = i-1; j < ratings.size(); j++) {
                    if(isConstantlyDecreasing(ratings.subList(k,j+1)) > 0){
                        result++;
                    }
                    k++;
            }
        }

        return result;
    }

    private static int isConstantlyDecreasing(List<Integer> subList) {
    int counter =0;
        if(subList.size() == 1 )
            return 1;
        else {
            for (int i = 1; i < subList.size(); i++) {
                if (subList.get(i -1) - subList.get(i) == 1)
                    counter++;
                else
                    break;
            }

            return counter > 0 ? 1 :0;
        }
    }
}
