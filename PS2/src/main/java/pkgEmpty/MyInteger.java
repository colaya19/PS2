package pkgEmpty;

public class MyInteger {
	private static int iValue;

	public MyInteger(int iValue) 
	{
		super();
		this.iValue = iValue;
		
	}

	public int getiValue() 
	{
		return iValue;
	}

	public void setiValue(int iValue) 
	{
		this.iValue = iValue;
	}
	
	public boolean isEven()
	{
		if(iValue %2 != 0)
			return true;
		else
			return false;
	}
	public boolean isOdd()
	{
		if(iValue %2 != 0)
			return true;
		else
			return false;
	}
	public boolean isPrime()
	{
		for (int x = 0; x <= iValue/2; x++)
		{
			if(iValue%x==0)
				return false;
		}
		return true;
	}
	public static boolean isEven(int a)
	{
		if(a %2 == 0)
			return true;
		else
			return false;
	}
	
	public static boolean isOdd(int a)
	{
		if(a %2 != 0)
			return true;
		else
			return false;
	}
	
	public static boolean isPrime(int a)
	{
		for (int x = 0; x <= a/2; x++)
		{
			if(a%x==0)
				return false;
		}
		return true;
	}
	
	public static boolean isEven(MyInteger obj)
	{
		return obj.isEven();
	}
	public static boolean isOdd(MyInteger obj)
	{
		return obj.isOdd();
	}
	public static boolean isPrime(MyInteger obj)
	{
		return obj.isPrime();	
	}
	public boolean equals(int x)
	{
		if(iValue == x)
			return true;
		else
			return false;
		
	}
	private boolean equals(MyInteger obj)
	{
		return obj.equals(iValue);
	}
}
