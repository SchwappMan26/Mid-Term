public class TicTacToe
	{
		static int counter=0;
		public static boolean gameContinues=true;
		public static void main(String[] args)
			{			
				Board.setup();
				Board.board();
				Player.askPlayerName();
				Player.askDifficulty();
				Player.askXO();			
				while(gameContinues)
					{
						if(Player.XO.equals("X")||Player.XO.equals("x"))
							{
								PutInMove.askForMoveX();
								counter++;
									if (counter==9)
										{
											System.out.println("Tie Game");
										}
								System.out.println("Computer Move: ");
									if (Player.difficulty==1)
										{
											ComputerMove.easycomputerMoveO();
											counter++;
												if (counter==9)
													{
														System.out.println("Tie Game");
													}
										}
									else if (Player.difficulty==2)
										{
											ComputerMove.hardComputerMoveO();
											counter++;
												if (counter==9)
													{
														System.out.println("Tie Game");
													}
										}
								Board.board();
								Board.gamewon();
							}
						else if(Player.XO.equals("O")||Player.XO.equals("o"))
							{
								System.out.println("Computer Move: ");
									if (Player.difficulty==1)
										{
											ComputerMove.easycomputerMoveX();
											counter++;
												if (counter==9)
													{
														System.out.println("Tie Game");
													}
										}
									else if (Player.difficulty==2)
										{
											ComputerMove.hardComputerMoveX();
											counter++;
												if (counter==9)
													{
														System.out.println("Tie Game");
													}
										}
								Board.board();
								PutInMove.askForMoveO();
								counter++;
								Board.board();
									if (counter==9)
										{
											System.out.println("Tie Game");
										}
								Board.gamewon();
							}						
					}			
			}
	}