public class SimpleHashtable{

    private Employee[] hashtable;

    public SimpleHashtable(){
      hashtable = new Employee[10];
    }
    public void put(String key, Employee employee){
      int hashedKey = hashKey(key);
      if(hashtable[hashedKey] != null)
      {
        System.out.println("Sorry, there is alredy an emloey at the postion" + hashedKey);
      }
      else{
        hashTable[hashedKey] = employee;
      }
    }

    //retrieval is constant time
    public Employee get(String key){
      int hashedKey = hashKey(key);
      return hashtable[hashedKey];
    }

    private int hashKey(String key){
      return key.length() % hashtable.length;
    }

    public void printHashTable(){
      for(int i =0; i < hashtable.length; i++){
        System.out.println(hashTable[i]);
      }
    }
}
