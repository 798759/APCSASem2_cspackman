import java.util.ArrayList;
/**
 * Write a description of class Runner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WordPairList
{
    // instance variables - replace the example below with your own
    private int x;
    //private ArrayList<WordPair>allPairs = new ArrayList<WordPair>();

    /**
     * Constructor for objects of class Runner
     */
    public WordPairList(String[] words)
    {
        ArrayList<WordPair>allPairs = new ArrayList<WordPair>();
        for(int i=0; i<words.length; i++){
            for(int j=i+1; j<words.length; j++){
                allPairs.add(new WordPair(words));
            }
            }
        }
        public int num
    }
    

    
    

