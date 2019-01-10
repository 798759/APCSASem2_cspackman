
/**
 * Write a description of class Mysort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mysort
{
    public int[] My(int[] y)
    {
        for(int i=0; i<y.length; i++){
            for(int s=0; s<y.length-1; i++)    
            if(y[s]>y[s+1]){
                    swap(s,s+1,y);
                }
        }
        return  y;
    }
    public static void swap(int a, int b, int[] array){
        int temp=0;
        temp =array[a]; 
        array[a] =array[b];
        array[b] = temp;
    }
}
