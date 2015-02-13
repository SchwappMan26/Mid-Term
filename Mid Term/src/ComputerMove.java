import java.util.Scanner;
public class ComputerMove
	{
		static Scanner userInput=new Scanner(System.in);		
			{
				easycomputerMoveO();
				easycomputerMoveX();
				hardComputerMoveO();
				hardComputerMoveX();
			}
				public static void easycomputerMoveO()
					{
						int computerMove=(int) (Math.random() * 9) + 1;
						if(computerMove==1)
							{
								if(Board.board[0][0].equals(" "))
									{
										Board.board[0][0]="O";
									}
								else easycomputerMoveO();
							}
						else if(computerMove==2)
							{
								if(Board.board[0][1].equals(" "))
									{
										Board.board[0][1]="O";
									}
								else easycomputerMoveO();
							}
						else if(computerMove==3)
							{
								if(Board.board[0][2].equals(" "))
									{
										Board.board[0][2]="O";
									}
								else easycomputerMoveO();
							}
						else if(computerMove==4)
							{
								if(Board.board[1][0].equals(" "))
									{
										Board.board[1][0]="O";
									}
								else easycomputerMoveO();
							}
						else if(computerMove==5)
							{
								if(Board.board[1][1].equals(" "))
									{
										Board.board[1][1]="O";
									}
								else easycomputerMoveO();
							}
						else if(computerMove==6)
							{
								if(Board.board[1][2].equals(" "))
									{
										Board.board[1][2]="O";
									}
								else easycomputerMoveO();
							}
						else if(computerMove==7)
							{
								if(Board.board[2][0].equals(" "))
									{
										Board.board[2][0]="O";
									}
								else easycomputerMoveO();
							}
						else if(computerMove==8)
							{
								if(Board.board[2][1].equals(" "))
									{
										Board.board[2][1]="O";
									}
								else easycomputerMoveO();
							}
						else if(computerMove==9)
							{
								if(Board.board[2][2].equals(" "))
									{
										Board.board[2][2]="O";
									}
								else easycomputerMoveO();
							}	
					}
				public static void easycomputerMoveX()
					{
						int computerMove=(int) (Math.random() * 9) + 1;
						if(computerMove==1)
							{
								if(Board.board[0][0].equals(" "))
									{
										Board.board[0][0]="X";
									}
								else easycomputerMoveX();
							}
						else if(computerMove==2)
							{
								if(Board.board[0][1].equals(" "))
									{
										Board.board[0][1]="X";
									}
								else easycomputerMoveX();
							}
						else if(computerMove==3)
							{
								if(Board.board[0][2].equals(" "))
									{
										Board.board[0][2]="X";
									}
								else easycomputerMoveX();
							}
						else if(computerMove==4)
							{
								if(Board.board[1][0].equals(" "))
									{
										Board.board[1][0]="X";
									}
								else easycomputerMoveX();
							}
						else if(computerMove==5)
							{
								if(Board.board[1][1].equals(" "))
									{
										Board.board[1][1]="X";
									}
								else easycomputerMoveX();
							}
						else if(computerMove==6)
							{
								if(Board.board[1][2].equals(" "))
									{
										Board.board[1][2]="X";
									}
								else easycomputerMoveX();
							}
						else if(computerMove==7)
							{
								if(Board.board[2][0].equals(" "))
									{
										Board.board[2][0]="X";
									}
								else easycomputerMoveX();
							}
						else if(computerMove==8)
							{
								if(Board.board[2][1].equals(" "))
									{
										Board.board[2][1]="X";
									}
								else easycomputerMoveX();
							}
						else if(computerMove==9)
							{
								if(Board.board[2][2].equals(" "))
									{
										Board.board[2][2]="X";
									}
								else easycomputerMoveX();
							}			
					}	
			public static void hardComputerMoveO()
				{
					if(Board.board[1][1].equals(" "))
						{
							Board.board[1][1]="O";
						}
					else easycomputerMoveO();				
				}
			public static void hardComputerMoveX()
				{
					if(Board.board[1][1].equals(" "))
						{
							Board.board[1][1]="X";
						}
					else easycomputerMoveX();				
				}
	}