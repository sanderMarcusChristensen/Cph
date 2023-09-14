Teacher myTeacher1;
Teacher myTeacher2;
Student myStudent1;
Student myStudent2;



void setup()
{
  myTeacher1 = new Teacher("Anne",51,true);
  myTeacher2 = new Teacher("Otto",45,false);
  
  println(myTeacher1.name + " " +  myTeacher1.age +  " " + myTeacher1.isFemale);
  
  myStudent1 = new Student("Sander",21,false, "datamatiker B");
  myStudent2 = new Student("Marcus", 48, false, "datamatiker B"); 
  
  println(myStudent1.name + " " + myStudent1.age + " " + myStudent1.isFemale + " " + myStudent1.datamatikerTeam);
  println(myStudent2.name + " " + myStudent2.age + " " + myStudent2.isFemale + " " + myStudent2.datamatikerTeam);
    
  
  //Opgave 4
  myTeacher1.changeName("Peter");
  println(myTeacher1.name); 
  
  
  
  
  //Opgave 5.
  boolean total = isClassmates( myStudent1, myStudent2);
  
  if(total == true)
  {
    println(myStudent1.name + " and " + myStudent2.name + " and are classmates");
  }
  else
  {
    println( myStudent1.name + " and " + myStudent2.name + " and " + "are not classmates" );
  }
  
  
  
}




//Opgave 5. 

boolean isClassmates( Student a , Student b)
{
  if( a.datamatikerTeam == b.datamatikerTeam)
  {
    return true; 
  }
    return false;
}
  
