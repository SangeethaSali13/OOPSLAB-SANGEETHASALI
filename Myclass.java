  import java.util.*;
class Person
{
String name,gender,address;
int age;

void Person()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Name");
name=sc.next();
System.out.println("Enter the Gender");
gender=sc.next();
System.out.println("Enter the Age");
age=sc.nextInt();
System.out.println("Enter the Address");
address=sc.next();
}
}
class Employee extends Person
{
int empid;
String company_name,qualification;
float salary;

void Employee()
{
super.Person();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Company Name");
company_name=sc.next();
System.out.println("Enter the Qualification");
qualification=sc.next();
System.out.println("Enter the Salary");
salary=sc.nextFloat();
}
}
class Teacher extends Employee
{
String sub,dept;
int teacherid;

Teacher()
{
super.Employee();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Teacher id");
teacherid=sc.nextInt();
System.out.println("Enter the Department");
dept=sc.next();
System.out.println("Enter the Subject");
sub=sc.next();
}

void display()
{
System.out.println("\nDetails are\n");
	System.out.print("name = " + name);
	System.out.print("\t");
	System.out.print("gender = " + gender);
	System.out.print("\t");
	System.out.print("age = " + age);
	System.out.print("\t");
	System.out.print("address = " + address);
	System.out.print("\t");
	System.out.print("company_name = " + company_name);
	System.out.print("\t");
	System.out.print("qualification = " + qualification);
	System.out.print("\t");
	System.out.print("salary = " + salary);
	System.out.print("\t");
	System.out.print("teacherid = " + teacherid);
	System.out.print("\t");
	System.out.print("department = " + dept);
	System.out.print("\t");
	System.out.print("subject = " + sub);
}
}


public class Myclass
{
public static void main(String args[])
{
int choice;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of details to be entered");
int n=sc.nextInt();
Teacher t[]=new Teacher[n];
	  
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
				t[i]=new Teacher();		
				}
		break;
		case 2:for(int i=0;i<n;i++)
				{
				t[i].display();
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





C:\Users\hp\Desktop\program>javac Myclass.java

C:\Users\hp\Desktop\program>java Myclass
Enter the number of details to be entered
2

Employee Details


Menu
1.Insert
2.Display
3.Exit
Enter your choice:1
Enter the Name
manu
Enter the Gender
28
Enter the Age
khjgc
Exception in thread "main" java.util.InputMismatchException
        at java.base/java.util.Scanner.throwFor(Scanner.java:939)
        at java.base/java.util.Scanner.next(Scanner.java:1594)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
        at Person.Person(Myclass.java:15)
        at Employee.Employee(Myclass.java:28)
        at Teacher.<init>(Myclass.java:45)
        at Myclass.main(Myclass.java:102)

C:\Users\hp\Desktop\program>javac Myclass.java

C:\Users\hp\Desktop\program>java Myclass
Enter the number of details to be entered
2

Employee Details


Menu
1.Insert
2.Display
3.Exit
Enter your choice:1
Enter the Name
manu
Enter the Gender
male
Enter the Age
28
Enter the Address
Ernakulam
Enter the Company Name
google
Enter the Qualification
mca
Enter the Salary
48000
Enter the Teacher id
121
Enter the Department
computer science
Enter the Subject
maths
Enter the Name
kiran
Enter the Gender
male
Enter the Age
30
Enter the Address
kozhikode
Enter the Company Name
apple
Enter the Qualification
BTech
Enter the Salary
50000
Enter the Teacher id
321
Enter the Department
Mechanical
Enter the Subject
Engineering physics

Employee Details


Menu
1.Insert
2.Display
3.Exit
Enter your choice:2

Details are

name = manu     gender = male   age = 28        address = Ernakulam     company_name = google   qualification = mca     salary = 48000.0        teacherid = 121 department = computer   subject = maths
Details are

name = kiran    gender = male   age = 30        address = kozhikode     company_name = apple    qualification = BTech   salary = 50000.0        teacherid = 321 department = Mechanical subject = Engineering
Employee Details


Menu
1.Insert
2.Display
3.Exit
Enter your choice:3
