import java.util.*;
class Employee
{
int empid;
String name,address;
float salary;

void Employee()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Employee id");
	empid=sc.nextInt();
	System.out.println("Enter the Employee name");
	name=sc.next();
	System.out.println("Enter the Employee address");
	address=sc.next();
	System.out.println("Enter the Employee salary");
	salary=sc.nextFloat();
}

}

class Teacher extends Employee
{
String dept,sub;

Teacher()
{
	super.Employee();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the department");
	dept=sc.next();
	System.out.println("Enter the subject");
	sub=sc.next();
}
void display()
{
	System.out.println("\nEmployee details are\n");
	System.out.print(empid);
	System.out.print("\t");
	System.out.print(name);
	System.out.print("\t");
	System.out.print(address);
	System.out.print("\t");
	System.out.print(salary);
	System.out.print("\t");
	System.out.print(dept);
	System.out.print("\t");
	System.out.print(sub);
	
}
}
class Main
{
	public static void main(String args[])
	{
		int choice;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of details to be entered");
		int n=sc.nextInt();
		Teacher tr[]=new Teacher[n];
	  
	   	do
	{
		System.out.println("\nEmployee Details\n");
		System.out.print("\nMenu\n1.Insert\n2.Display\n3.Exit\n");
		System.out.print("Enter your choice:");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
				for(int i=0;i<n;i++)
				{
				tr[i]=new Teacher();		
				}
		break;
		case 2:for(int i=0;i<n;i++)
				{
				tr[i].display();
				}		
		break;
		case 3:System.exit(0);
		break;
		default:System.out.println("Invalid Choice");
		}
	}
	while(choice!=4);
	}
		
}


******************************************************************************************************************************

OUTPUT


C:\Users\hp\Desktop\program>javac Employee.java

C:\Users\hp\Desktop\program>java Main
Enter the number of details to be entered
2

Employee Details


Menu
1.Insert
2.Display
3.Exit
Enter your choice:1
Enter the Employee id
101
Enter the Employee name
arun
Enter the Employee address
mattathil(h)
Enter the Employee salary
30000
Enter the department
mca
Enter the subject
ADBMS
Enter the Employee id
102
Enter the Employee name
manju
Enter the Employee address
thottathil(h)
Enter the Employee salary
35000
Enter the department
maths
Enter the subject
statistics

Employee Details


Menu
1.Insert
2.Display
3.Exit
Enter your choice:2

Employee details are

101     arun    mattathil(h)    30000.0 mca     ADBMS
Employee details are

102     manju   thottathil(h)   35000.0 maths   statistics
Employee Details


Menu
1.Insert
2.Display
3.Exit
Enter your choice:3
	

