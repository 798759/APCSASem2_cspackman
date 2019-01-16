
/**
 * Write a description of class Mysort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class SortMethods
{
    public ArrayList<Integer> My(ArrayList<Integer> arr )
    {
        for(int i = arr.size(); i>=0; i--){
            for(int j=1; j<=i; j++)    
            if(arr.get(j-1)>arr.get(j)){
                    int temp = arr.get(j-1);
                    arr.set(j-1,arr.get(j));
                    arr.set(j,temp);
                }
        }
        return  arr;
    }
     public int[] Bubble(int[] y)
    {
        for(int i = y.length; i>0; i--){
            for(int j=1; j<i; j++)    
            if(y[j-1]>y[j]){
                    int temp = y[j-1];
                    y[j-1]=y[j];
                    y[j]=temp;
                }
        }
        return  y;
    }
    public int[] Selection(int [] arr){
        for(int i=0; i<arr.length-1; i++){
            int index =i;
            for(int j=i+1; j<arr.length; j++){
                if (arr[j]<arr[index]){
                int temp = arr[j];
                arr[j]=arr[index];
                arr[index]=temp;
                }
            }
        }
        return arr;
    }
    public int[] Insertion(int[] arr){
        int temp;
        for(int  i=1; i<arr.length; i++){
            for(int j=i; j>0; j--){
                if(arr[j]<arr[j-1]){
                    temp = arr[j];
                    arr[j] =arr[j-1];
                    arr[j-1] = temp;
                }
            }
            
        }
        return arr;
    }
}
