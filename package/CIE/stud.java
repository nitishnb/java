package CIE;

public class stud
{
	public String usn;
	public String name;
	public int sem;
	public stud(String a,String b,int c)
	{
		usn=a;
		name=b;
		sem=c;
	}
	public void data()
	{
		System.out.println("Student information:\nUSN:"+usn+"\nName:"+name+"\nSem"+sem);
	}
		
}

