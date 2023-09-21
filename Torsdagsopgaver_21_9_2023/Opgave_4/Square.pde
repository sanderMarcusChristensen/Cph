
class Square
{
  
  float xpos;
  float ypos;
  
  Square(float xpos, float ypos)
  {
    this.xpos = xpos;
    this.ypos = ypos;
    
  }
  
  
  void display()
  {
    fill(0);
    rect(xpos,ypos,50,50);
    
  }
  
  
}
    
  
