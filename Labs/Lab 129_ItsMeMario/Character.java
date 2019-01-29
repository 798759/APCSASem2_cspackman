
/**
 * Write a description of class Character here.
 *
 * @author (Conair)
 * @version (a version number or a date)
 */
public class Character{
    // instance variables - replace the example below with your own
    private int Speed;
    private String Catchphrase;

    /**
     * Constructor for objects of class Character
     */
    
    
    public Character(String phrase, int sped){
        Catchphrase = phrase;
        Speed = sped;
    }
    public String setCatchphrase(String x){
        Catchphrase = x;
        return Catchphrase;
    }
    public String getCathphrase(){
        return Catchphrase;
    }
    public int setSpeed(int x){
        Speed=x;
        return Speed;
    }
    public int getSpeed(){
        return Speed;
    }

   
}
