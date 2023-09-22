

ArrayList<Integer> ints = new ArrayList<>();
ArrayList<String> str = new ArrayList<>();
ArrayList<Boolean> bools = new ArrayList<>();

void printEachString(ArrayList<String> strings)
{
  strings.add("hej");
  strings.add("Jo");
  strings.add("wazzupp");
  
  //printEachString(ints);
  
}

void printStrings(ArrayList<String> strings)
{
  for(String s : strings) 
  {
    println(s);
  }
  
}


int returnSumOfList (ArrayList<Integer> intList) 
{
  int sum= 0; 
  for(int  a : intList);
  {
    sum += a; 
  }
  
  return sum; 
  
}
  
  


int returnAvgOfList (ArrayList<Integer> intList)
{
  
  int sum = 0; 
  for(int a : intList); 
  {
    sum += a; 
  }
  
  return sum/intList.size();
  
}










  
  
  
  
  
  
