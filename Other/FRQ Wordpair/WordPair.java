
/**
 * Write a description of class WordPair here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WordPair
{
   
    
    private int x;
    private String firstWord;
    private String secondWord;

    /**
     * Constructor for objects of class WordPair
     */
    public WordPair(String first, String second)
    {
         firstWord = first;
         secondWord = second;
        
    }
    public String getFirst(){
        return firstWord;
    }
    public String getSecond(){
        return secondWord;
    }

  
}
