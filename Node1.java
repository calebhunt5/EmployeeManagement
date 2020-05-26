/**
 * 
 * @author chunter1
 *Lab_2.1
 *11-8-19
 */


public class Node1 {

	//variables for holding stuff
	String item, pos, dept;
	Date hire;
	//int count;
	
	Node1 link;
	
	//Constructors
	public Node1()
	{
		link =null;
		item =null;
		pos =null;
		dept =null;
		hire =null;
		//count =0;
	}
	
	public Node1(EmployeeDatabase employee, Node1 linkValue)
	{
		setData(employee);
		link =linkValue;
	}
	
	//mutators
	public void setData(EmployeeDatabase employee)
	{
		item =EmployeeDatabase.getName();
		pos =EmployeeDatabase.getPos();
		dept =EmployeeDatabase.getDept();
		hire = EmployeeDatabase.getHire();
		
	}
	
	public void setLink(Node1 newLink)
	{
		link =newLink;
	}
	
	//Accessory
	public String getItem()  
	{  
        return item;  
    }  
	
	public String getPos()
	{
		return pos;
	}
	
	public String getDept()
	{
		return dept;
	}
	
	public Date getDate()
	{
		return hire;
	}
     
    
    public Node1 getLink()  
    {  
        return link;  
    }  
	
}
