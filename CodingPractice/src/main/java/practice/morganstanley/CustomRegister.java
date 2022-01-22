package practice.morganstanley;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CustomRegister implements Register {
	
	Map<Integer,Integer> register ;
	
	CustomRegister(){
		register = new HashMap<Integer,Integer>();
	}
	
	@Override
	public void addAttendance(int[] a) {
		for (int i = 0; i < a.length; i++) {
			Integer value = register.get(a[i]);
			if(value == null){
				register.put(a[i], 1);
			}else{
				register.put(a[i], ++value);
			}
		}

	}

	@Override
	public void changeAttendance(int id, char c) {
		int attendance = register.get(id);
		if(c == 'A'){
			register.put(id, --attendance);
			System.out.println("The attendance of student with id: "+ id +" has been reduced by one");
		}else if (c == 'P'){
			register.put(id, ++attendance);
			System.out.println("The attendance of student with id: "+ id +" has been increased by one");
		}
			
	}

	@Override
	public void reduceRegister(int l) {
		System.out.println("Removing students with less attendance");
		
		Iterator<Map.Entry<Integer, Integer> > iterator = register.entrySet().iterator();
		
		while(iterator.hasNext()){
			Map.Entry<Integer, Integer> entry  = iterator.next();
			
			if(entry.getValue() < l)
				iterator.remove();
		}
	}

	@Override
	public int maxAttendance() {
		
		int maxValue = -1;
		List<Integer> values = register.values().stream().collect(Collectors.toList());
		for (Integer integer : values) {
			
			if(integer > maxValue){
				maxValue = integer;
			}
		}
		
		return maxValue;
	}

	public void personalAttendance(int id) {
		Integer attendance = register.get(id);
		if(attendance!=null){
			System.out.println("The Attendance of the student with id: "+id+" is: " + attendance.intValue());
		}else{
			System.out.println("The student with id: "+id+" has been removed due to low attendance");
		}
	}
	
	

}
