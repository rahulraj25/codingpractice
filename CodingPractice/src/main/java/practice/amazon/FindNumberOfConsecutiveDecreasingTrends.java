package practice.amazon;

import java.util.ArrayList;
import java.util.List;
// input 4 3 5 4 3 -> No of consecutive decreasing trends are : {4} , {3} , {5} , {4} , {3} + {4,3} ,{5,4}, {4,3}, {5,4,3} : 9
// input 2 1 3 -> No of consecutive decreasing trends are : {2} , {1} , {3} , {2, 1} : 4
public class FindNumberOfConsecutiveDecreasingTrends {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
         list.add(2); list.add(1); list.add(3); list.add(1); list.add(1);
        //list.add(4); list.add(3); list.add(5); list.add(4); list.add(3);
        //System.out.println(countDecreasingRatings(list) + list.size());
        //list.add(3); list.add(2);  list.add(1); list.add(0); list.add(0);  list.add(1); list.add(2);  list.add(3);
        System.out.println(countDecreasingRatings(list));

    }

    public static int countDecreasingRatings(List<Integer> ratings) {
        List<Boolean> decreaseTrend = new ArrayList<>(ratings.size());

        decreaseTrend.add(false);
        for (int i = 1; i < ratings.size(); i++) {
            if(ratings.get(i-1)- ratings.get(i)  == 1){
                decreaseTrend.add(true);
            }else{
                decreaseTrend.add(false);
            }
        }
        int counter ,result =0;
        for (int i = 0; i < decreaseTrend.size(); i++) {
            counter=0;
            if(decreaseTrend.get(i)){
                while(i<ratings.size() && decreaseTrend.get(i)){
                    counter++;
                    i++;
                }
                result += getPossibleDecreasingTrends(counter);
            }
        }
        return result + ratings.size();
    }

    public static int getPossibleDecreasingTrends(int n){
        return (n * (n+1)) / 2;
    }
}
