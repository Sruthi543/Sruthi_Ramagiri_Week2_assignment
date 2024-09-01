class constructorpractice
{
	int i;
	public static void main(String[] args)
	{
		constructorpractice cp = new constructorpractice();
		System.out.println(cp.i);
	}
	public constructorpractice()
	{
		i=20;
	}
	public void add(int a,int b)
	{
	}
	public void add(int i, int a,int c)
	{
	}
		constructorpractice cp = new constructorpractice();
		cp.add(2,3);
		cp.add(2,3,4);
		System.out.println(false);
	}
}