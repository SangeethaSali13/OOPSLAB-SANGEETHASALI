

import java.util.*;

interface student {
    Scanner sc = new Scanner(System.in);
    int roll =6, mark = 70;
    String name = "Arun", classname = "MCA";

}
class sports{
    Scanner sc = new Scanner(System.in);
    int marks;
    void get()
    {
        System.out.println("Enter marks out of 20:");
        marks=sc.nextInt();
    }
}

class result extends sports implements student
{
    void display()
    {
        System.out.println("Details of students are:");
        System.out.println("Name:"+name);
        System.out.println("Roll number:"+roll);
        System.out.println("Class Name:"+classname);
        System.out.println("Academic Mark:"+mark);
        System.out.println("Sports Mark:"+marks);
    }
}
public class studentdet {
    public static void main(String args[])
    {
        result res = new result();
        res.get();
        res.display();
    }
}



****************************************************************************************


OUTPUT


C:\Users\hp\Desktop\program>javac studentdet.java

C:\Users\hp\Desktop\program>java studentdet
Enter marks out of 20:
15
Details of students are:
Name:Arun
Roll number:6
Class Name:MCA
Academic Mark:70
Sports Mark:15