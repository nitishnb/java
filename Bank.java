import java.util.*;
import java.lang.Math;

public class Bank
{
 public static void main(String[] args)
{
 Scanner s=new Scanner(System.in);
 System.out.println("Kind of account for customers"); 
 System.out.println("1)savings account\n2)current account");
 int c=s.nextInt();
 System.out.print("  Enter the principal amount:");
 double p=s.nextDouble();
  switch(c)
{
 case 1:System.out.print("\n  Enter time of period:");
        double t=s.nextDouble();
        Current c1=new Current(p,t);
        c1.sbank();
        break;
 case 2:Current c2=new Current(p);
       c2.cbank();
       break;
 default:System.out.println("  Invalid option");
}
}
}



class Saving
{
 
 double p;
 double r;
 double a;
 double t;

 void sbank()
{
    int ch;
 r=3.000;
 Scanner s=new Scanner(System.in);

	double a = p*(Math.pow((1 + r / 100), t));
	 
do
{
 System.out.println("\n\n***MENU***\n1.check balance\n2.withdrawl\n3.Exit");
 ch=s.nextInt();
 switch(ch)
{
 case 1:System.out.print("  Balance:"+a);
        break;
 case 2:System.out.print("\n  Enter withdrawl amount:");
        double w=s.nextDouble();
        if(a<w)
       {
        System.out.println("  NO SUFFICIENT BALANCE");
       }
       else
       { 
        a=a-w;
       System.out.print("\n  "+w+" withrawed succesfully");
       }
       break;
 case 3:System.exit(0);
default:System.out.println("  Enter valid option");
}
}while(ch!=4); 
}    
}

class Current extends Saving
{
Current(double prin,double time)
{
 p=prin;
 t=time;
}
Current(double prin)
{
  p=prin;
}
  int ch;
 void cbank()
{a=p;
  System.out.println("\n\n---Cheque Book is provided---");
 Scanner s=new Scanner(System.in);
        if (a<5000)
      {
           System.out.print("\nNOTE:  Maintain a minimum balance(atleast 5000 Rs)\n       Service charge(Rs.200) is imposed");
           a=a-200;
      }
 do
{
 System.out.println("\n\n***MENU***\n1.check balance\n2.withdrawl\n3.Exit");
 ch=s.nextInt();
 
 switch(ch)
{
 case 1:System.out.print("  Balance:"+a);
        break;
 case 2:System.out.print("\n  Enter withdrawl amount:");
        double w=s.nextDouble();
        if(a<w)
       {
        System.out.println("  NO SUFFICIENT BALANCE");
       }
       else
       { 
        a=a-w;
       System.out.print("\n  "+w+" withrawed succesfully");
       }
       break;
 case 3:System.exit(0);
default:System.out.print("\n  Enter valid option");
}
}while(ch!=4); 
}
}
