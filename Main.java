/**
 * 
 * @author chunter1
 *11-20-19
 *Lab_2.3
 */


public class Main {

	public static void main(String[] args) {
		
		//creation of one linked list 
		LinkedList1 workers =new LinkedList1();
		
		//creation of dates of hire
		Date kirkDate =new Date(2, 5, 1987);
		Date samDate =new Date(2, 5, 1992);
		Date AliciaDate =new Date(12, 4, 1999);
		Date BandonDate =new Date(2, 5, 1987);
		Date LexiDate =new Date(11, 15, 2007);
		Date BritneyDate =new Date(5, 14, 1995);
		
		//creation of employees
		EmployeeDatabase kirk = new EmployeeDatabase("Kirk Russell", "General Manager", "Management", new Date(2, 5, 1987));
		workers.addToStart(kirk);
		EmployeeDatabase sam = new EmployeeDatabase("Sam Roswell", "Assistant Manager", "Management", samDate);
		workers.addToStart(sam);
		EmployeeDatabase alicia = new EmployeeDatabase("Alicia Flora", "Representative", "Sales", AliciaDate);
		workers.addToStart(alicia);
		EmployeeDatabase bandon = new EmployeeDatabase("Bandon Lorrie", "Representative", "Sales", BandonDate);
		workers.addToStart(bandon);
		EmployeeDatabase lexi = new EmployeeDatabase("Lexi Harfoot", "Representative", "Sales", LexiDate);
		workers.addToStart(lexi);
		EmployeeDatabase brit = new EmployeeDatabase("Britney Smith", "Payroll Officer", "Finance", BritneyDate);
		workers.addToStart(brit);
		
		workers.outputList();
		
		//output of new hire
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		System.out.println("A position has opened and a new crew member has been brought on.");
		System.out.println("However, they need to be trained for two weeks before they are officially hired full-time.");
		
		
		Date benDate =new Date(6, 25, 2012);
		EmployeeDatabase ben =new EmployeeDatabase("Ben Harwell", "Trainee", "Sales", benDate);
		workers.addToStart(ben);
		
		workers.outputList();
		
		//output of new fire
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		System.out.println("The new hire isn't working out as they have been skipping work or leaving early without leave.");
		System.out.println("Please schedule a termination.");
		
		workers.deleteHeadNode();
		workers.outputList();

	}

}
