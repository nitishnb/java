import CIE.*;
import SEE.*;
import java.util.*;

public class Main
{
public static void main(String args[])
{	
        Scanner s = new Scanner(System.in);
	System.out.println("Enter the no. of students:");
	int n=s.nextInt();
	stud st[]=new stud[n];
	inter in[]=new inter[n];
	exter ex[]=new exter[n];
	for(int i=0;i<n;i++)
	{
		System.out.println("Enter USN, Name and SEM of the student:");
    	        String usn=s.next();
		String name=s.next();
		int sem=s.nextInt();
		int imark[]=new int[5];
		System.out.println("Enter Internals marks:");
		for(int j=0;j<5;j++)
      			 imark[i]=s.nextInt();
		int emark[]=new int[5];
		System.out.println("Enter Externals marks:");
		for(int j=0;j<5;j++)
      		         emark[i]=s.nextInt();
		st[i]=new stud(usn,name,sem);
		in[i]=new inter(imark);
		ex[i]=new exter(emark);
	}
	for(int i=0;i<n;i++)
	{
		ex[i].data();
		in[i].print();
	}
}
}
