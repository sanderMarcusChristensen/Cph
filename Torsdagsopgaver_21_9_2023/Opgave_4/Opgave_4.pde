

Square[] mySqList = new Square[10];

Square mySQ;


void setup()
{
  size(300, 300);
  background(255);

  for (int i = 0; i < mySqList.length; i++)
  {

    mySqList[i] = new Square(random(1, 300), random(1, 300));
  }

  for (Square drawSQ : mySqList)
  {
    drawSQ.display();
  }


  //mySQ = new Square(10,10);
  //mySQ.display();
}
