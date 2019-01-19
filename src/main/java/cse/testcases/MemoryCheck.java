package cse.testcases;

public class MemoryCheck {
	
	
	public static void main(String args[])
	{
		
		int i=0;
		for(;i<1000000000;i++)
		{
			Student s=new Student();
			System.out.println("Hello am at    =>"+i);
		}
	}

}
