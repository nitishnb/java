import java.util.*;
class Book_Demo
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number of books:");
    int n=s.nextInt();
     for(int i=0;i<n;i++)
    {
     System.out.println("Enter the name, author, price and number of pages of the book:");
     String a=s.nextline();
     String b=s.nextline();
     int c=s.nextInt();
     int d=s.nextInt();
      
     Book B[]=new Book[n];
     B[i]=new Book();
     B[i].getdata(a,b,c,d);
     B[i].toString(B[i]);
    }
  }
}
class Book
{
 public String name;
 public String author;
 public int price;
 public int num_pages;
 Book()
 {
 
 }
 public void getdata(String x,String y,int z,int v)
 {
  name=x;
  author=y;
  price=z;
  num_pages=v;
 }
 public void toString(Book t)
 {
  System.out.println("       BOOK DETAILS    ");
  System.out.println("Name            :"+t.name);
  System.out.println("Author          :"+t.author);
  System.out.println("Price           :"+t.price);
  System.out.println("Number of Pages :"+t.num_pages);
 }
}