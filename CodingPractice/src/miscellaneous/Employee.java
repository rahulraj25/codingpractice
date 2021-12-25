package miscellaneous;

import java.util.Date;

public class Employee {
	
	int id;
	String name;
	Date dateOfJoining;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	
	public int hashCode(){
		return id + name.hashCode() + dateOfJoining.hashCode();
		
		
	}
	
	/*ID, NAME, SALARY, DEPT_ID
	 * 
	 * 1 -> 2 empl
	 * 2 -> 3 employees 
	 * 
	 *  
	 *  SELECT SUM(SALARY), DEPT_ID from EMPLOYEE e
	 *  GROUP BY DEPT_ID
	 *  HAVING SUM(SALARY) >= 1000000;
	 * 
	 */
	
	
}

