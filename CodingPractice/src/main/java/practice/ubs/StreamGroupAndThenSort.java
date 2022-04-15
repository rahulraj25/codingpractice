package practice.ubs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class StreamGroupAndThenSort {
	public static List<List<Integer>> groupSort(List<Integer> arr) {
	    
	     Map<Integer, Long> collect = arr.stream().collect(Collectors.groupingBy(a -> a.intValue(),Collectors.counting()));
	     Comparator<Entry<Integer,Long>> valueComparator = Entry.comparingByValue(Comparator.reverseOrder());
	     
	     List<Entry<Integer, Long>> list = collect.entrySet().stream().sorted(valueComparator).collect(Collectors.toList());
	      
	     List<List<Integer>> resultList = new ArrayList<>() ;
	     
	     for (Entry<Integer, Long> element : list) {
	    	 List<Integer> integers = new ArrayList<>();
	    	 integers.add(element.getKey());
	    	 integers.add(element.getValue().intValue());
	    	 resultList.add(integers);
	     }
	
	return resultList;
	}
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(3);
		list.add(2);
		list.add(4);
		list.add(2);
		list.add(1);
		list.add(4);
		list.add(1);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(4);
		
		System.out.println(groupSort(list));
		
	}
}

