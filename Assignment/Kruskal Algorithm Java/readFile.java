import java.io.*;
import java.util.*;

public class readfile{

    private Scanner scan;

    public void openFile(){
      try{
            scan = new Scanner(newFile("chinese.txt"));
      }
      catch(Exception e)
      {
        System.out.println("couldn't find file");
      }
    }

    public void readFile(){
        while(x.hasNext()){
            String u = x.next();
            String v = x.next();
            String weight = x.next();
        }
    }



}
