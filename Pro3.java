// Checking prime or not

class Prime
{
	public static void main(String[] args) 
	{
		int x = Integer.parseInt(args[0]);
		for (int i = 2 ; i < x ; i++ ) 
		{
			if(x%i == 0)
			{
				System.out.println("The number is not prime");
				break;
			}
			else
			if(i == x-1 && x%i != 0)
			{
				System.out.println("The number is prime");
				break;
			}
		}
	}
}

