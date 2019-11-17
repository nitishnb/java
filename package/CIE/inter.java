package CIE;

public class inter
{
	public int a[]=new int[6];
	public inter(int m[])
	{
		a=m;
	}
	public void print()
	{
		System.out.println("Marks scored in internals:");
		for(int i=0;i<5;i++)
		System.out.println(a[i]);		
	}
}
