import java.util.*;
import java.io.*;
class Student 
{ 
    public String s_usn; 
    public String s_name;
    public int[] arr_credits;
    public int[] arr_marks;
    public void assign(int m[], String name,String usn)
   {  
    s_name=name;
    s_usn=usn;
    for(int j=0;j<5;j++)
    {
     arr_marks[j]=m[j];
    }
    for(int j=0;j<5;j++)
    arr_credits[j]=4;
   }
   public void display()
  {
      int sgpa=0;
    System.out.println("Name:"+s_name);
    System.out.println("Usn:"+s_usn);
    int n[] = new int[5];
    for(int k=0;k<5;k++)
     {
       n[k]=(arr_marks[k]/10);
       n[k]=n[k]+1;
     }
   int sum;
   sum=0;
    for(int x=0;x<5;x++)
   {
     sum=sum+n[x]*arr_credits[x];
   }
   float s_sgpa=(float)sum/20;
   System.out.println("Sgpa is "+sgpa);
}
} 

public class Main
{
 public static void main(String[] args)
 {
  Scanner s=new Scanner(System.in);
  System.out.println("Enter student name");
  String name=s.nextLine();
  System.out.println("Enter usn");
  String usn=s.nextLine();
  int m[] = new int[5];
  System.out.println("Enter the marks in 1.java 2.DS 3.MP 4.DM 5.LD");
  for(int i=0;i<5;i++)
  {
    m[i]=s.nextInt();
  }
  Student s1=new Student();
  s1.assign( m, name, usn);
  s1.display();
}
}