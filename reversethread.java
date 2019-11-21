class thread1 extends Thread
{
	int num;
	thread1(int a)
	{
		num=a;
		this.start();
	}
	public void run()
	{
		try
		{
			if(num<=5)
			{
				thread1 t1=new thread1(num+1);
				this.sleep(1000/num);
				System.out.println("Hello from Thread"+num+"!");
			}
		}
		catch(Exception ie)
		{
			System.out.println("interrupted");
		}
	}
	
}
class reversethread
{
	public static void main(String args[])
	{
		try
		{
			thread1 t=new thread1(1);
		}
		catch(Exception ie)
		{
			System.out.println("interrupted");
		}
	}
}
		
