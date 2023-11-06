package AdditionalAsssignments;
import java.util.ArrayList;
public class Employeemain {

	public static void main(String[] args) {
		ArrayList<Employee> emp=new ArrayList<>();
		emp.add(new Employee(101,"Anuj",new Department(1,"HR")));
		emp.add(new Employee(102,"Akshay",new Department(2,"Developer")));
		
		for(Employee e:emp)
		{
			
			System.out.println(e);
		}
		
		
		
		
		
		
		
		
	}

}
