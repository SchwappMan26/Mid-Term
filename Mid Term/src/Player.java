import java.util.Scanner;
public class Player
	{
		static Scanner userInput = new Scanner(System.in);
		static int difficulty;
		static String XO;
			{
				askPlayerName();
				askDifficulty();
				askXO();
			}
				public static void askPlayerName()
					{
						System.out.println("Dear User, what is your name?");
						String name = userInput.nextLine();
						System.out.println("Hello," + name+".");
					}
				public static void askDifficulty()
					{
						System.out.println("Please select your difficulty");
						System.out.println("(1) for easy (2) for hard");
						difficulty=userInput.nextInt();		
					}	
				public static String askXO()
					{
						Scanner userInput = new Scanner(System.in);
						System.out.println("Please select if you will be X or O");
						XO=userInput.nextLine();
						return XO;
					}
			}