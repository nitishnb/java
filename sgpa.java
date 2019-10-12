import java.util.*;
import java.io.*;
public class sgpa
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the no. of students:");
   int n=s.nextInt(); 
  Student ss[] = new Student[n] ;
  for(int i=0;i<n;i++)
    ss[i]=new Student(); 
 for(int i=0;i<n;i++)
    ss[i].input();
  for(int i=0;i<n;i++)
    ss[i].display();
}
}

class Student 
{ 
    public String s_usn; 
    public String s_name;
    public int[] arr_credits={5,4,4,5,3,4};
    public int[] arr_marks=new int[6];
    public void input()
    {
         Scanner s=new Scanner(System.in);
         System.out.println("Enter student name:");
         s_name=s.nextLine();
         System.out.println("Enter usn:");
         s_usn=s.nextLine();
         System.out.println("Enter the marks in 1.java 2.DS 3.MP 4.DM 5.LD 6.COA:");
          for(int i=0;i<6;i++)
           {
               arr_marks[i]=s.nextInt();
           }
    }
   public void display()
   {
    int n[] = new int[6];
    for(int k=0;k<6;k++)
     {
       n[k]=(arr_marks[k]/10);
       if(n[k]!=10 || n[k]!=9 ||n[k]!=8 ||n[k]!=7 ||n[k]!=6 ||n[k]!=5 ||n[k]!=4 )
       {
       n[k]=n[k]+1;
       }
     }
   int sum;
   sum=0;
    for(int x=0;x<6;x++)
   {
     sum=sum+n[x]*arr_credits[x];
   }
   float sgpa=(float)sum/25;
    System.out.println();
    System.out.println("Name   :"+s_name);
    System.out.println("Usn    :"+s_usn);
    System.out.println("Sgpa   :"+sgpa);
}
} 
