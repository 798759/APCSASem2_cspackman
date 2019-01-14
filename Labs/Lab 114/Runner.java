
/**
 * Write a description of class Runner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Runner
{
    static SortMethods ms = new SortMethods();
    static int[]x = {1,4,5,6,8,3};
    static ArrayList<Integer> arr = new ArrayList<Integer>(1);
    
    public static void MySort(){
         ms.My(arr);
        System.out.print("MySort: ");
        for(int i=0; i<100; i++){
            int n=0;
            n=(int)(Math.random()*100);
            arr.add(n);
        }
        for(int i=0; i<sort.length; i++){
            System.out.print(sort[i]);
        }
        
    }
    public static void Bubble(){
        int[] sort = ms.Bubble(x);
        System.out.print("Bubble: ");
        for(int i=0; i<sort.length; i++){
            System.out.print(sort[i]);
        }
        
    }
     public static void Selection(){
        int[] sort = ms.Selection(x);
        System.out.print("Selection: ");
        for(int i=0; i<sort.length; i++){
            System.out.print(sort[i]);
        }
        
    }
      public static void Insertion(){
        int[] sort = ms.Selection(x);
        System.out.print("Insertion: ");
        for(int i=0; i<sort.length; i++){
            System.out.print(sort[i]);
        }
        
    }
}
