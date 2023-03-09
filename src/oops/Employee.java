package oops;

public class Employee {
	
	int empid;
	String employee;
	int salary;
	int deptno;
	
	
	
	void display() 
	{
			
		System.out.println(empid);
		System.out.println(employee);
		System.out.println(salary);
		System.out.println(deptno);
			
	}
	
	public static void main (String arg[]) 
	{
				
		Employee emp1 = new Employee(); // First Employee
		emp1.empid = 10;
		emp1.employee = "Pavan";
		emp1.salary = 10000;
		emp1.deptno = 200;
		emp1.display();

		
		System.out.println("**********************");
		
		Employee emp2 = new Employee(); // Second Employee
		emp2.empid = 20;
		emp2.employee = "Bala";
		emp2.salary = 15000;
		emp2.deptno = 300;
		emp2.display();
		
	}

}


/*
Output:
10
Pavan
10000
200
**********************
20
Bala
15000
300
*/
