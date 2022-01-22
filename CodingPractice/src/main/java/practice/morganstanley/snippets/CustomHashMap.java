package practice.morganstanley.snippets;

import java.util.ArrayList;
import java.util.List;

public class CustomHashMap<K,V>{
	
	private List<KeyValuePair<K,V>> list ;
	
	public CustomHashMap() {
		list = new ArrayList<>();
	}
	
	public boolean put(Object newObject){
		if(!list.contains(newObject)){
			//list.add(newObject);
			return true;
		}
		
		return false;
	}
	
	public Object get(K key){
		for(KeyValuePair<K, V> listObjects : list){
			if(listObjects.getKey().equals(key)){
				return listObjects;
			}
		}
		
		return null;
	}
	
}
