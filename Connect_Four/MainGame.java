import java.io.*;

class GameBoard
{
	public int board[][];
	public int row;
        public int col;
	
	int col_row_ptr[];
	
	GameAgent player[];
	
	GameBoard()
	{
		this.row = 6;
		this.col = 7;
                this.board = new int[this.row][this.col];
		this.board_init();
		
		col_row_ptr = new int[this.col];
		this.col_row_init();
		
		this.player = new GameAgent[2];
		this.player_init();
	}
	
	
		class GameAgent
		{
			int token;
			int turn_count;
			
			GameAgent(int token)
			{
				this.token = token;
				this.turn_count = 0;
			}
			
			int[] v_move(GameBoard obj)
			{
				int var[] = new int[2];
				
				for(int i=0;i<obj.col;i++)
				{
					if(obj.col_row_ptr[i]>=3)
					{
						if(obj.board[obj.col_row_ptr[i] - 1][i] == 0)
						{
							turn_count++;
							obj.board[obj.col_row_ptr[i] - 1][i] = this.token;
							obj.col_row_ptr[i] = obj.col_row_ptr[i] - 1;

							var[0] = obj.col_row_ptr[i]-1;
							var[1] = i;
							break;
						}
					}
				}
				return var;	
			}
			
			int[] ran_move(GameBoard obj)
			{	
				int var[] = new int[2];
				var[0] = (int)(Math.random()*10);
				var[1] = (int)(Math.random()*10);

				if((var[0] < 6) && (var[1] < 7))
				{
					if(obj.board[var[0]][var[1]] == 0)
					{
						obj.board[var[0]][var[1]] = this.token;
						obj.col_row_ptr[var[1]] = obj.col_row_ptr[var[1]] - 1;
						return var;
					}
				}
				return ran_move(obj);
			}
		}

		

	
	void board_init()
	{
		for(int i=0;i<this.row;i++)
		{
			for(int j=0;j<this.col;j++)
			{
				this.board[i][j]=0;
			}
		}
	}

	void board_status()
	{
		System.out.println("\nGame Status:\n");
		for(int i=0;i<this.row;i++)
		{
			for(int j=0;j<this.col;j++)
			{
				System.out.print(this.board[i][j]+",");
			}
			System.out.println();
		}
	}

	void col_row_init()
	{
		for(int i=0;i<this.col;i++)
		{
			this.col_row_ptr[i] = this.row;
		}
	}
	
	void player_init()
	{
		this.player[0] = new GameAgent(1);

		this.player[1] = new GameAgent(2);
	}
}
	

class MainGame
{
	
	public static void main(String args[])
	{
		GameBoard obj = new GameBoard();
		
		obj.board_status();
		
		int turn = 0;
		int var[] = new int[2];
		
		while(turn < 15)
		{
			if(turn%2==0)
			{
				var = obj.player[0].v_move(obj);
			}
			else
			{
				var = obj.player[1].ran_move(obj);
			}
			turn++;
			
			if(obj.player[turn%2].turn_count == 4)
			{
				System.out.println("GG");
				break;
			}
		}

		obj.board_status();
	}
}

	