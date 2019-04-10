
/**
 * Write a description of class ClimbInfo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ClimbInfo
{
    // instance variables - replace the example below with your own
    private int x;
    private String PeakName;
    private int ClimbTime;

    /**
     * Constructor for objects of class ClimbInfo
     */
    public ClimbInfo(String peakName, int climbTime)
    {
        peakName=PeakName;
        climbTime=ClimbTime;
        
    }
    public String getName(){
        return PeakName;
    }
    public int getTime(){
        return ClimbTime;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
