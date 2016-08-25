import java.util.Scanner;
public class Fizzbuzz
	{

		public static void main(String[] args)
			{
				for (int i = 1; i <= 100; i++)
					{
						if (i % 15 == 0)
							{
								System.out.println("FizzBuzz");
							}
						else if (i % 3 == 0)
							{
								System.out.println("Fizz");
							}
						else if (i % 5 == 0)
							{
								System.out.println("Buzz");
							}
						else
							{
								System.out.println(i);
							}
					}
				System.out.println("Put a number.");
				Scanner userInput = new Scanner(System.in);
				int put = userInput.nextInt();
				if (put % 2 == 0)
					{
						System.out.println("Even");
					}
				else
					{
						System.out.println("Odd");
					}
				System.out.println("Input a year");
				int year = userInput.nextInt();
				if (year % 4 == 0 && (year/100) % 4 == 0)
					{
						System.out.println("Leap");
					}
				else
					{
						System.out.println("Not leap");
					}
				int list[] = { 2, 5, -7, 1, 3, 12, 19, -16, 4 , 20};
				for (int i = 0; i < list.length; i++)
					{
						if ((i+1) % 3 == 0)
							{
								System.out.println(list[i]);
							}
					}
			}

	}
