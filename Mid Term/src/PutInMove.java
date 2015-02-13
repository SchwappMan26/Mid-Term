import java.util.Scanner;
public class PutInMove
		{
		static Scanner userInput=new Scanner(System.in);
		
			{
				askForMoveX();
				askForMoveO();
			}		
					public static void askForMoveX()
						{
							System.out.println("What Is Your Move?");
							String move= userInput.nextLine();
							if (move.equals("A1")||move.equals("a1"))
								{
									Board.board[0][0]="X";
								}
							else if (move.equals("A2")||move.equals("a2"))
								{
									Board.board[0][1]="X";
								}
							else if (move.equals("A3")||move.equals("a3"))
								{
									Board.board[0][2]="X";
								}
							else if (move.equals("B1")||move.equals("b1"))
								{
									Board.board[1][0]="X";
								}
							else if (move.equals("B2")||move.equals("b2"))
								{
									Board.board[1][1]="X";
								}
							else if (move.equals("B3")||move.equals("b3"))
								{
									Board.board[1][2]="X";
								}
							else if (move.equals("C1")||move.equals("c1"))
								{
									Board.board[2][0]="X";
								}
							else if (move.equals("C2")||move.equals("c2"))
								{
									Board.board[2][1]="X";
								}
							else if (move.equals("C3")||move.equals("c3"))
								{
									Board.board[2][2]="X";
								}						
						}
					public static void askForMoveO()
						{
							System.out.println("What Is Your Move?");
							String move= userInput.nextLine();
							if (move.equals("A1")||move.equals("a1"))
								{
									Board.board[0][0]="O";
								}
							else if (move.equals("A2")||move.equals("a2"))
								{
									Board.board[0][1]="O";
								}
							else if (move.equals("A3")||move.equals("a3"))
								{
									Board.board[0][2]="O";
								}
							else if (move.equals("B1")||move.equals("b1"))
								{
									Board.board[1][0]="O";
								}
							else if (move.equals("B2")||move.equals("b2"))
								{
									Board.board[1][1]="O";
								}
							else if (move.equals("B3")||move.equals("b3"))
								{
									Board.board[1][2]="O";
								}
							else if (move.equals("C1")||move.equals("c1"))
								{
									Board.board[2][0]="O";
								}
							else if (move.equals("C2")||move.equals("c2"))
								{
									Board.board[2][1]="O";
								}
							else if (move.equals("C3")||move.equals("c3"))
								{
									Board.board[2][2]="O";
								}						
						}
			}