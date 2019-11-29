import java.util.*;

class BMS extends Thread
{
 public void run()
 {
     Thread t = Thread.currentThread();
    System.out.println("Current thread: " + t);
     try
     {
  for(int i=0;i<5;i++)
  {
        System.out.println("BMS College of Engineering");
   
       Thread.sleep(10000);
      }
     
 }catch(Exception e){
         System.out.println("BMS interrupted");   
 };
  
 }
}

class CSE extends Thread
{
 public void run()
 {
     Thread t = Thread.currentThread();
System.out.println("Current thread: " + t);
        try{
  for(int i=0;i<5;i++)
  {
   
   System.out.println("Computer Science and Engineering");
       Thread.sleep(2000);
      }}catch(Exception e){
             System.out.println("CSE interrupted");  
      };
           System.out.println("CSE exiting");  
 }
}

public class Threaddemo
{
 public static void main(String args[])
 {
  BMS a1=new BMS();
  CSE a2=new CSE();

  a1.start();
  a2.start();
 }
}
