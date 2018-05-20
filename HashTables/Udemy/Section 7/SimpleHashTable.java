public class SimpleHashTable{

    private Employee[] hashtable;

    public SimpleHashTable(){
        hashtable = new Employee[10];
    }

    public void put(String key, Employee employee){
        //map the key provided to an integer
        int hashedKey = hashKey(key);
        //we check that position in the array is empty we assign the employee into that possition
        // otherwise we throw a message saying can't insert etc
        if(hashtable[hashedKey] != null){
            System.out.println("sorry, there's already an employee at position");
        }
        else{
            hashtable[hashedKey] = employee;
        }
    }

    public Employee get(String key){
        int hashedKey = hashKey(key);

        if(hashtable[hashedKey] != null){
          return hashtable[hashedKey];
        }
        else{
            System.out.println("Sorry, couldn't find anything");
            return null;
        }

    }

    //taking a key and hashing it to an int
    private int hashKey(String key){
        return key.length() % hashtable.length;
    }

    public void printHashtable(){
        for(int i = 0; i < hashtable.length;i++){
          System.out.println(hashtable[i]);
        }
    }


}
