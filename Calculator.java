package week5.day1;

public class Calculator {
public void add(int x, int y)
{
	int sum=x+y;
	System.out.println("sum:"+sum);
}
	public void add(float x, float y)
	{
		float sum=x+y;
		System.out.println("sum:"+sum);
	}
	public void add(long a, long b)
	{
		long sum=a+b;
		System.out.println("sum:"+sum);
	}
	public void add(short c,short d)
	{
		int sum=c+d;
		System.out.println("sum:"+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Calculator c=new Calculator();	
c.add(5,6);
c.add(50f, 60f);
c.add(5000,6000);
c.add(52, 67);
	}

}
