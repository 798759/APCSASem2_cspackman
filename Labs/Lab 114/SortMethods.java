
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
        for(int i = arr.size(); i>0; i--){
            for(int j=1; j<i; j++)    
            if(arr.get(j-1)>arr.get(j)){
                    int temp = arr.get(j-1);
                    arr.set(j-1,arr.get(j));
                    arr.set(j,temp);
                }
        }
        return  arr;
    }
     public ArrayList<Integer> Bubble(ArrayList<Integer> y )
    {
        for(int i = y.size(); i>0; i--){
            for(int j=1; j<i; j++)    
            if(y.get(j-1)>y.get(j)){
                    int temp = y.get(j-1);
                    y.set(j-1,y.get(j));
                    y.set(j,temp);
                }
        }
        return  y;
    }
    public ArrayList<Integer> Selection(ArrayList<Integer> arr){
        for(int i=0; i<arr.size()-1; i++){
            int index =i;
            for(int j=i+1; j<arr.size(); j++){
                if (arr.get(j)<arr.get(index)){
                int temp = arr.get(j);
                arr.set(j,arr.get(index));
                arr.set(index,temp);
                }
            }
        }
        return arr;
    }
    public ArrayList<Integer> Insertion(ArrayList<Integer> arr){
        int temp;
        for(int  i=1; i<arr.size(); i++){
            for(int j=i; j>0; j--){
                if(arr.get(j)<arr.get(j-1)){
                    temp = arr.get(j);
                    arr.set(j,arr.get(j-1));
                    arr.set(j-1,temp);
                }
            }
            
        }
        return arr;
    }
}
