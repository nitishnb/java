package SEE;

public class exter extends stud
{
	public int s[]=new int[5];
	public exter(int m[])
	{
		s=m;
	}
	public void data()
	{
		super.data();
		System.out.println("\nMarks scored in Externals are:");
		for(int i=0;i<5;i++)
		System.out.println(s[i]);
	}
	
}
