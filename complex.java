import java.util.*;
class complex{
	double r,i;
public static void main(String a[])
{
	Scanner sc=new Scanner(System.in);
	complex c1=new complex();
	complex c2=new complex();
	System.out.println("Enter the complex number:");
	c1.r=sc.nextDouble();
	c1.i=sc.nextDouble();
	System.out.println("Enter the complex number:");
	c2.r=sc.nextDouble();
	c2.i=sc.nextDouble();
	double smr=c2.r+c1.r;
	double smi=c2.i+c1.i;
	System.out.println("Sum:"+smr+"+"+smi+"i");
}
}

******************************************************************************************************

OUTPUT


C:\Users\hp\Desktop\program>javac complex.java

C:\Users\hp\Desktop\program>java complex
Enter the complex number:
5.4
10.5
Enter the complex number:
4.6
9.5
Sum:10.0+20.0i

