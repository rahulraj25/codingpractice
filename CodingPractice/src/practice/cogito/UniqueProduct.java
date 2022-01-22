package cogito;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class UniqueProduct {
    public static String firstUniqueProduct(String[] products) {
    	
        Map<String, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < products.length; i++) {
        	if(map.containsKey(products[i])){
        		map.replace(products[i], map.get(products[i])+1);
        	}else{
        		map.put(products[i], 1);
        	}
		}
        
       for (Entry<String, Integer> productMap : map.entrySet()) {
		
    	   if(productMap.getValue().intValue() == 1){
    		   return productMap.getKey();
    	   }
       }
       
       return null;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqueProduct(new String[] { "Apple", "Computer", "Apple", "Computer", "Bag"  }));
    }
}