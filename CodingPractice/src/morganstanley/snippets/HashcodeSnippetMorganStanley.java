package morganstanley.snippets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import miscellaneous.Employee;

public class HashcodeSnippetMorganStanley {
	//Employee age,sal,gender ,... equals and hashcode not implemented
	//list of employees -> duplicates across attributes
	
	private static int getModifiedHAshcode(Employee e1){
		//return e1.hashCode() + sal.
		return 0;
	}
	
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>();
		//Duplicate objects
		
		//
		List<Employee> newlist = new ArrayList<Employee>();
		
		Set<Integer> hashCodesInserted  = new HashSet<>(); 
		
		//Iterate throught 1st list and getModifiedhashcode,
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			if(!hashCodesInserted.contains(getModifiedHAshcode(employee))){
				newlist.add(employee);
				hashCodesInserted.add(getModifiedHAshcode(employee));
				
			}
		}
		
	}
	
	
}
