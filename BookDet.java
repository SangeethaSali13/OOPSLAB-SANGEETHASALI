import java.util.*;
abstract class Publisher
{
static int pid;
static String name;

void Publisher()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Publisher id");
pid=sc.nextInt();
System.out.println("Enter the Publisher name");
name=sc.next();
}
}

class Book extends Publisher
{
String bname;
int bid;

void Book()
{
super.Publisher();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Book id");
bid=sc.nextInt();
System.out.println("Enter the Book name");
bname=sc.next();
}
}

class Liter extends Book
{
String chapname;
int chapno;

void Liter()
{
super.Book();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Chapter number");
chapno=sc.nextInt();
System.out.println("Enter the Chapter name");
chapname=sc.next();

}
}

class Fiction extends Liter
{
String topic;
Fiction()
{
super.Liter();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Topic");
topic=sc.next();
}
void display()
{

System.out.println("\nBook details are\n");
	System.out.print("\t");
	System.out.print("publisherid = " + pid);
	System.out.print("\t");
	System.out.print("name = " + name);
	System.out.print("\t");
	System.out.print("bookid = " + bid);
	System.out.print("\t");
	System.out.print("bookname = " + bname);
	System.out.print("\t");
	System.out.print("chapterno = " + chapno);
	System.out.print("\t");
	System.out.print("chaptername = " + chapname);
	System.out.print("\t");
	System.out.print("topic = " + topic);
	System.out.print("\t");
}
}

public class BookDet
{

public static void main(String args[])
{
int choice;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of details to be entered");
		int n=sc.nextInt();
		Fiction fn[]=new Fiction[n];
	  
	   	do
	{
		System.out.println("\nBook Details \n\t");
		System.out.print("\nMenu\n1.Insert\n2.Display\n3.Exit\n");
		System.out.print("Enter your choice:");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
				for(int i=0;i<n;i++)
				{
				fn[i]=new Fiction();		
				}
		break;
		case 2:for(int i=0;i<n;i++)
				{
				fn[i].display();
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


*******************************************************************************************************************


OUTPUT


C:\Users\hp\Desktop\program>javac BookDet.java

C:\Users\hp\Desktop\program>java BookDet
Enter the number of details to be entered
2

Book Details


Menu
1.Insert
2.Display
3.Exit
Enter your choice:1
Enter the Publisher id
101
Enter the Publisher name
Dr.Jeena Jose
Enter the Book id
201
Enter the Book name
Data Mining
Enter the Chapter number
173
Enter the Chapter name
Spatial Data Mining
Enter the Topic
Spatial Data Mining
Enter the Publisher id
102
Enter the Publisher name
Binu M B
Enter the Book id
202
Enter the Book name
It & Environment
Enter the Chapter number
52
Enter the Chapter name
It and Society
Enter the Topic
Information technology in the society

Book Details


Menu
1.Insert
2.Display
3.Exit
Enter your choice:2

Book details are

        publisherid = 102       name = Binu     bookid = 201    bookname = Data chapterno = 173 chaptername = Spatial   topic = Spatial
Book details are

        publisherid = 102       name = Binu     bookid = 202    bookname = It   chapterno = 52  chaptername = It        topic = Information
Book Details


Menu
1.Insert
2.Display
3.Exit
Enter your choice:3

