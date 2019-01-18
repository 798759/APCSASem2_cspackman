
/**
 * Write a description of class Runner here.
 *
 * @author (yoBobby)
 * @version (a version number or a date)
 */
import java.util.*;
public class Runner
{
    static SortMethods ms = new SortMethods();
    static int[]x = {1,4,5,6,8,3};
    static ArrayList<Integer> arr = new ArrayList<Integer>();
    
    public static void MySort(){
        for(int i=0; i<10; i++){
            int n=0;
            n=(int)(Math.random()*10);
            arr.add(n);
           
          
        }
        ArrayList<Integer> sort = new ArrayList<Integer>(ms.My(arr)); 
        System.out.print("MySort: ");
        for(int i=0; i<sort.size(); i++){
            System.out.print(sort.get(i));
        }
    }
    public static void Bubble(){
         for(int i=0; i<10; i++){
            int n=0;
            n=(int)(Math.random()*10);
            arr.add(n);
           
          
        }
        ArrayList<Integer> sort = new ArrayList<Integer>(ms.My(arr)); 
        System.out.print("Bubble: ");
        for(int i=0; i<sort.size(); i++){
            System.out.print(sort.get(i));
        }
    }
    
    public static void Selction(){
         for(int i=0; i<10; i++){
            int n=0;
            n=(int)(Math.random()*10);
            arr.add(n);
           
          
        }
        ArrayList<Integer> sort = new ArrayList<Integer>(ms.My(arr)); 
        System.out.print("Selection: ");
        for(int i=0; i<sort.size(); i++){
            System.out.print(sort.get(i));
        }
    }
      public static void Insertion(){
         for(int i=0; i<10; i++){
            int n=0;
            n=(int)(Math.random()*10);
            arr.add(n);
           
          
        }
        ArrayList<Integer> sort = new ArrayList<Integer>(ms.My(arr)); 
        System.out.print("Insertion: ");
        for(int i=0; i<sort.size(); i++){
            System.out.print(sort.get(i));
        }
    }
}
