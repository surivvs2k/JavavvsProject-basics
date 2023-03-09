package oops;

public class Employee1 {
	
	int empid;
	String employee;
	int salary;
	int deptno;
	
	/*
	Employee0(int id,String name,int sal, int dno)
	{
		empid=id;
		employee=name;
		salary=sal;
		deptno=dno;
	}
	*/
	
	void setdata(int id,String name,int sal, int dno) 
	{
		empid=id;
		employee=name;
		salary=sal;
		deptno=dno;
	}
	
	void display() 
	{
			
		System.out.println(empid);
		System.out.println(employee);
		System.out.println(salary);
		System.out.println(deptno);
			
	}
	
	public static void main (String arg[]) 
	{
		
		//Assigning Values to class variables using constructor -- First Method
		/*
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
		*/
		
		//Assigning Values to class variables using constructor -- Second Method

		/*
		Employee0 emp1 = new Employee0(101,"krish",22000,11);
		emp1.display();
		
		System.out.println("**********************");

		Employee0 emp2 = new Employee0(202,"shikr",44000,22);
		emp2.display(); */
		
		Employee1 emp1=new Employee1();
		emp1.setdata(101,"Guna",15000,11);
		emp1.display();
		
		System.out.println("**********************");

		Employee1 emp2=new Employee1();
		emp2.setdata(202,"Naga",25000,22);
		emp2.display();


	}




}


/*
Output:
101
Guna
15000
11
**********************
202
Naga
25000
22
*/
