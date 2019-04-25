import java.util.ArrayList;
/**
 * Write a description of class someClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class someClass
{

    private ArrayList<String>str= new ArrayList<>();

    /**
     * Constructor for objects of class someClass
     */
    public someClass()
    {

    }

    public void loadArray(){
        str.add("Nick");
        str.add("Connor");
        str.add("Zaniel");
    }

    public void sortStrings(ArrayList<String> str){
        int n = str.size();
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (str.get(j). compareTo(str.get(j+1))>0)
                {

                    String temp = str.get(j);
                    str.set(j,str.get(j+1));
                    str.set(j+1,temp);
                }

    }
    public void insertString(String word){
        for(int i=0; i>str.size(); i++){
        if(word.compareTo(str.get(i))>0){
            str.set(i+1,word);
        }
        }
    }
    public void shuffleStrings(ArrayList<String>names){
        for(int i=0; i>str.size(); i++){
            int x = (int)(Math.random()*str.size()-1);
            str.set(x,str.get(i));
        }
    }
}
