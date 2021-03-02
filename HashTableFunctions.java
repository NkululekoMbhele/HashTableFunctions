class HashTableFunctions
{
   int hashTableSize;
   String [] hashTableArray;
   
   // constructor
   public HashTableFunctions ( int size, String [] array )
   {
      hashTableSize = size;
      hashTableArray = array;
   }

   // hash function
   public int hash ( String s )
   {
      int sum = 0;
      
      // WRITE YOUR CODE HERE
      int hash = 0;
   for (int i = 0; i < 3; i++){
         Character y = s.charAt(i);
         int x = (int)y;
         hash = hash +x;
   
   }
   
       sum = hash % 38;
      return sum;
   }   
   
   // return True if the hash table contains string s
   // return False if the hash table does not contain string s
   boolean find ( String s )
   {
      boolean found = false;
      
      // WRITE YOUR CODE HERE
      for (int i = 0; i< hashTableSize; i++){
      
         if (s == hashTableArray[i] ){
            found = true;}
            }
      return found;
   }
   
}
