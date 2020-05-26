/**
 * 
 * @author chunter1
 *11-19-19
 *Lab_2.3
 */

import java.util.LinkedList;

public class EmployeeDatabase {
	
	static Date dateOfHire =new Date();
	
	static String firstName, lastName, position, department;
	static int access;
	
	//constructors
	public EmployeeDatabase()
	{
		firstName ="Joe";
		lastName ="Doe";
		position ="DEFAULT";
		department ="99th dep.";
		dateOfHire.setDate(1,1,2000);
		
		access =99999;
	}//end of EmployeeDatabase
	
	
	public EmployeeDatabase(String newFirst, String newPos, String newDep, Date newDate)
	{
		firstName =newFirst;
		position =newPos;
		department =newDep;
		dateOfHire.setDate(newDate.getMonth(), newDate.getDay(), newDate.getYear());
	}//end of constructor

	public static String getName() 
	{
		return (firstName);
	}

	public static String getDept() 
	{
		return department;
	}

	public static String getPos() 
	{
		return position;
	}

	public static Date getHire() 
	{
		return dateOfHire;
	}
	
	
	
}
