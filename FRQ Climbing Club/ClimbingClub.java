import java.util.ArrayList;
/**
 * Write a description of class ClimbingClub here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ClimbingClub
{
   private ArrayList<ClimbInfo> climbList;
   
    /**
     * Constructor for objects of class ClimbingClub
     */
    public ClimbingClub()
    {
        climbList= new ArrayList<ClimbInfo>();
    }

    public void addClimb(String peakName, int climbTime){
        ClimbInfo info= new ClimbInfo(peakName,climbTime);
        climbList.add(info);
        for(int x =0; x>climbList.size(); x++)
        if(info.getName().compareTo(peakName)>0){
        climbList.add(info);}
    }
}
