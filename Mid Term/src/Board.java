import java.util.Scanner;
public class Board
	{
		static String board[][]=new String[3][3];
					{
						setup();
						board();
						gamewon();
					}
					public static void setup()
						{
							for(int row=0;row<board.length;row++)
								{
									for(int col=0; col<board[0].length;col++)
										{
											board[row][col]=" ";
										}
								}					
						}
					public static void board()
						{
							System.out.println("   1   2   3");
							System.out.println("A: "+ board[0][0]+" | "+board[0][1]+" | "+board[0][2]);
							System.out.println("  -----------");
							System.out.println("B: "+ board[1][0]+" | "+board[1][1]+" | "+board[1][2]);
							System.out.println("  -----------");
							System.out.println("C: "+ board[2][0]+" | "+board[2][1]+" | "+board[2][2]);
						}
					public static boolean gamewon()
						{
							if ((board[0][0].equals(board[0][1]) && board[0][1].equals(board[0][2]) && !board[0][0].equals(" ")) ||//A1-A3
								(board[1][0].equals(board[1][1]) && board[1][1].equals(board[1][2]) && !board[1][0].equals(" ")) ||//B1-B3
								(board[2][0].equals(board[2][1]) && board[2][1].equals(board[2][2]) && !board[2][0].equals(" ")) ||//C1-C3
								(board[0][0].equals(board[1][0]) && board[1][0].equals(board[2][0]) && !board[0][0].equals(" ")) ||//A1-C1
								(board[0][1].equals(board[1][1]) && board[1][1].equals(board[2][1]) && !board[0][1].equals(" ")) ||//A2-C2
								(board[0][2].equals(board[1][2]) && board[1][2].equals(board[2][2]) && !board[0][2].equals(" ")) ||//A3-C3
								(board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]) && !board[0][0].equals(" ")) ||//A1-C3
								(board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]) && !board[0][2].equals(" ")))//A3-C1
									{
										System.out.println("Game is over");
										System.exit(0);
									}
							return false;
						}
			}