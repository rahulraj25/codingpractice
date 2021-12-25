package bnymellon;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

abstract class Employee{
    
    abstract void setSalary(int salary);
    abstract int getSalary();
    abstract void setGrade(String grade);
    abstract String getGrade();
    
    void label(){
        System.out.print("Employee's data:");
        System.out.println();
        System.out.print("GRADE : " + getGrade());
        System.out.println();
        System.out.print("SALARY : " +  getSalary());
        
    }
}
class Engineer extends Employee{
	
	private int salary;
	private String grade;
	
	@Override
	void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	int getSalary() {
		return this.salary;
	}

	@Override
	void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	String getGrade() {
		return this.grade;
	}
    
}
class Manager extends Employee{
	
	private int salary;
	private String grade;
	
	@Override
	void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	int getSalary() {
		return this.salary;
	}

	@Override
	void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	String getGrade() {
		return this.grade;
	}
	
}