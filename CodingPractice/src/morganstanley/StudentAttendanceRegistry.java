package morganstanley;

import java.util.Random;
import java.util.Scanner;

public class StudentAttendanceRegistry {
	public static void main(String[] args){
		  
		  Scanner sc = new Scanner(System.in);
		  Random rand = new Random(0);

		  int n = Integer.parseInt(sc.nextLine());
		  int[] a = new int[n];
		  for(int i = 0; i < n; i++)
		   a[i] = Integer.parseInt(sc.nextLine());

		  CustomRegister cr = new CustomRegister();
		  cr.addAttendance(a);
		  
		  int m = Integer.parseInt(sc.nextLine());
		   for(int i = 0; i < m; i++){
		   String[] s = sc.nextLine().split(" ");
		   int id = Integer.parseInt(s[0]);
		   char c = s[1].charAt(0);
		   cr.changeAttendance(id,c);
		  }

		  int l = Integer.parseInt(sc.nextLine());
		  cr.reduceRegister(l);

		  int id = Integer.parseInt(sc.nextLine());
		  cr.personalAttendance(id);

		  System.out.println("The maximum attendance is: "+cr.maxAttendance());
		 }
}
