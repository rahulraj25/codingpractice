package msci;

import java.util.*;
import java.util.stream.Collectors;

public class CollectAllStringsGroupingByCount {

    public static void main(String[] args) {

        String statement = "Hello World My name is Jane and I hate Mango Fruit ";

        //Stream Approach
        Map<Integer, List<String>> integerListMap = Arrays.stream(statement.split(" ")).collect(Collectors.groupingBy(String::length));
        TreeMap<Integer, List<String>> integerListMap2 = new TreeMap<>((a,b)->b.compareTo(a));

        integerListMap2.putAll(integerListMap);
        System.out.println(integerListMap2);

        //Manual Approach
        TreeMap<Integer, List<String>> integerListTreeMap = new TreeMap<>();

        StringTokenizer stringTokenizer = new StringTokenizer(statement, " ");
        while (stringTokenizer.hasMoreTokens()){
            String s = stringTokenizer.nextToken();
            if(integerListTreeMap.containsKey(s.length())){
                integerListTreeMap.get(s.length()).add(s);
            }else{
                List<String> strings = new ArrayList<>();
                strings.add(s);
                integerListTreeMap.put(s.length(),strings);
            }
        }

        System.out.println(integerListTreeMap.descendingMap());

    }
}
