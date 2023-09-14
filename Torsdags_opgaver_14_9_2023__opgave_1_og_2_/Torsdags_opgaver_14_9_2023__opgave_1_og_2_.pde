
//Opagve 1

void setup()
{
  
  taskB();
  taskC("Wazzup");
  taskD("Sander", 21);
  
  
  //Opgave 2.B
  int answer = returnSum(6,4);
  println(answer);
  
  
  //Opgave 2.C
  println(OpgaveTooC("hav sker der"));
  
  //Opgave 2.D
  println(OpgaveTooD("Ja tak")); 
   
  
  
  
     
}


void taskB()
{
  println("Hello from the function");
  
}


void taskC(String texst) 
{
   println(texst);
  
}
  

void taskD(String name, int age)
{
  
  println( "My name is " + name + " I am " + age + " years old "); 
  
}






//Opgave 2.A


boolean happy = false;

 void setup() {
   if (iAmHappy())
   {
     println("I clap my hands");
   }
   else
   {
     println("I don't clap my hands"); 
   }
}

boolean iAmHappy(){
  if(happy == true) 
  {
    return true;
  } 
    return false;
}




//Opgave 2.B


int returnSum( int a, int b) 
{ 
    return a + b;
}





//Opgave 2.C

String OpgaveTooC(String txt)
{
  return txt.toUpperCase();
}





//Opgave 2.D

boolean OpgaveTooD(String txt) 
{
  
  //char firstLetter = txt.charAt(0);
  
  //boolean result = Character.isUpperCase(firstLetter);
  
  //return result;
  
  if(Character.isUpperCase(txt.charAt(0))){
    return true;  
  }
  return false;
  
  //return Character.isUpperCase(txt.charAt(0));
}
    
