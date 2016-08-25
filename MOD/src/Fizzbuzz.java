import java.util.Scanner;
public class Fizzbuzz
	{
		static Scanner userInput = new Scanner(System.in);

		public static void main(String[] args)
			{
			while (true)
				{
				System.out.println("Type 1, 2, 3, or 4.");
				int choice = userInput.nextInt();
				if (choice > 4 || choice < 1)
					{
						System.out.println("1, 2, 3, and 4, you idiot!");
					}
				else if (choice == 1)
					{
						fibu();
					}
				else if (choice == 2)
					{
						tryNumber();
					}
				else if (choice == 3)
					{
						leapYear();
					}
				else
					{
						list();
					}
				}
			}
		public static void fibu()
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
			}
		public static void tryNumber()
			{
				System.out.println("Put a number.");
				int put = userInput.nextInt();
				if (put % 2 == 0)
					{
						System.out.println("Even");
					}
				else
					{
						System.out.println("Odd");
					}
			}
		public static void leapYear()
			{
				System.out.println("Input a year");
				int year = userInput.nextInt();
				if (year % 4 == 0 && ((year/100) % 4 == 0 || year % 100 != 0))
					{
						System.out.println("Leap");
					}
				else
					{
						System.out.println("Not leap");
					}
			}
		public static void list()
			{
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
