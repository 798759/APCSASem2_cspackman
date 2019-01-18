
/**
 * Write a description of class Runner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Runner
{
    static SortMethods ms = new SortMethods();
    static int[]x = {1,4,5,6,8,3};
    public static void MySort(){
        int[] sort = ms.My(x);
        System.out.print("MySort: ");
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
    public static void mergeSort(){
        int n = x.length;
        int[] sort = ms.mergeSort(x,n);
        System.out.print("MergeSort: ");
        for(int i=0; i<sort.length; i++){
            System.out.print(sort[i]);
        }
        
    }
}
