
public class Fizzbuzz {

	public static void main(String[] args) {
		int [] numbers = new int[100];
		for (int i = 1; i < 100; i++)
		{
			//System.out.println(i);
			numbers[i] = i;
			if (numbers[i] % 15 == 0)
			{
				//System.out.println(i);
				System.out.println("FizzBuzz");
			}
			else
			{
				if (numbers[i] % 3 == 0)
				{
					System.out.println("Fizz");
				}
				else
				{
					if (numbers[i] % 5 == 0)
					{
						System.out.println("Buzz");
					}
					else
					{
						System.out.println(numbers[i]);
					}
				}
			}
		}
		

	}

}
