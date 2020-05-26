/**
 * 
 * @author chunter1
 *Lab_2.1
 *11-8-19
 */


public class LinkedList1 {
	
	Node1 head;
	
	public LinkedList1()
	{
		head =null;
	}
	
	//adds new head node
	public void addToStart(EmployeeDatabase employee)
	{
		head =new Node1(employee, head);
	}
	
	//deletes head node
	public boolean deleteHeadNode()  
	{  
        if (head != null)  
        { 
            head = head.getLink();  
            return true;  
        }  
        else  
        {
            return false;  
        } 
    }
	
	//finds size of  linkedList
	public int size() 
	{  
        int count = 0;  
        Node1 position = head; 
        while (position != null)  
        {  
            count++;  
            position = position.getLink();  
        }  
        return count; 
    }
	
	 public boolean contains(String item)  
	 {  
	        return (find(item) != null);  
	 } 
	 
	 //finds node in the linked list
	 private Node1 find(String target)  
	 { 
	        Node1 position = head;  
	        String itemAtPosition;  
	        while (position != null)  
	        {  
	            itemAtPosition = position.getItem();  
	            if (itemAtPosition.equals(target)) 
	            {
	                return position;  
	            }
	            position = position.getLink(); 
	        }  
	        return null; //target was not found  
	  }
	 
	 
	 //the method output list outputs the list... wow
	 public void outputList()  
	 {  
	        Node1 position = head;  
	        while (position != null)  
	        {  
	            System.out.println(position.getItem() + " " + position.getPos()+" "+position.getDept()+" "+position.getDate());  
	            position = position.getLink();
	        }  
	 }//end of outputList

}
