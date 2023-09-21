
//Opgave 6

int[][] board = new int [8][8];


void setup()
{
  
  size(320,320);
  
  for(int i = 0; i < board.length; i++)
  {
    for(int a = 0; a < board[i].length; a++)
    {
      
      board[i][a] = (i+a) % 2;
      
    }
  }
}    
    
    
void draw()
{
int sideLength = 40;

for(int i = 0; i < board.length; i++)
  {
    for(int a = 0; a < board[i].length; a++)
    {
     
     if(board[i][a] == 0)
     
       fill(0);
        else 
       fill(255);
     
     
     rect(i * sideLength, a * sideLength, sideLength, sideLength);
      
    }
  }
}




  
  
  
  
  
  
  
  

  
