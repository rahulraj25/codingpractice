package practice.goldman;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class FindClosestSumPairInArray {

  public static void main(String[] args) {
    List<Integer> nums = new ArrayList<>();
    nums.add(2);
    nums.add(7);
    nums.add(12);
    nums.add(1);
    nums.add(11);
    nums.add(6);
    List<Integer> result = new ArrayList<>();
    Collections.sort(nums);
    System.out.println(nums);

    int tempClosest = 0, closest = Integer.MAX_VALUE;
    int middleindex = (nums.size()%2 ==0) ? nums.size()/2 -1 : nums.size();
    int frontIndex = middleindex, endIndex = middleindex + 1, num = 15;

    boolean endIndexIncremented= true, frontIndexDecremented= true;

    while ((endIndexIncremented || frontIndexDecremented) && frontIndex > -1 && endIndex < nums.size()) {//closest condition
      endIndexIncremented = false;
      frontIndexDecremented = false;
      tempClosest = nums.get(frontIndex) + nums.get(endIndex);

      if (Math.abs(num - tempClosest) < Math.abs(num - closest)) {
        closest = tempClosest;
        result.clear();
        result.add(nums.get(frontIndex));
        result.add(nums.get(endIndex));
      }

      if (endIndex< nums.size() -2 && (nums.get(frontIndex) + nums.get(endIndex + 1)) < closest) {
        endIndex++;
        endIndexIncremented = true;
      }

      if (frontIndex >= 1 && (nums.get(frontIndex - 1) + nums.get(endIndex)) < closest) {
        frontIndex--;
        frontIndexDecremented = true;
      }
    }
    System.out.println(result);

  }
}