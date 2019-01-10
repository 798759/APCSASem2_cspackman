
/**
 * Write a description of class Runner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Runner
{
    static Mysort ms = new Mysort();
    static int[]x = {1,4,5,6,8,3};
    public static void main(){
        int[] sort = ms.My(x);
        for(int i=0; i<sort.length; i++){
            System.out.print(sort[i]);
        }
        
    }
}
