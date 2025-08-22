import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class p2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class p2 extends car
{
    /**
     * Act - do whatever the p2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int direction = 270;
    private int speed = 0;
    public int lap = 0;
    private boolean madeFirstTurn = false;
    private boolean madeLastTurn = false;
    public void act() 
    {
       setRotation(direction);
       map raceMap = (map) getWorld();
       p2Delete myEnd = raceMap.del2;
       if (!myEnd.deleted) {
          moveByArrows();
        }
        if (speedByRange() == 1) {
           move(speed / 3);
       } else if (speedByRange() == 0) {
           move(speed / 16);
           
       }  else {
           raceMap = (map) getWorld();
           p1Delete delete1 = raceMap.del1;
           delete1.endP1();
           Greenfoot.stop();
        }
       }
    public int speedByRange()
    {
        //95 left edge of right
        //151 bottom of top
        //40 top of top
        //216 right edge of right
        //469 bottom of right
        //629 right of top
        //506 left of left
        //461 bottom of left
        
        map raceMap = (map) getWorld();
        p2Laps myLaps = raceMap.laps2;
        if (((getX()>95 && getX()<216) && (getY()<469 && getY()>151)) || ((getX()>95 && getX()<629) && (getY()<151 && getY()>40)) || ((getX()>506 && getX()<629) && (getY()<441 && getY()>151))) {
            return 1;
        } else if ((getX()>506 && getX()<629) && (getY()<500 && getY()>441)) {
            if (myLaps.getLap() < 4) {
                addLaps();
                return 1;
            } else {
                return 2;
            }
        } else {
            return 0;
        }
    }
    public void moveByArrows()
    {
        
        if (getY()<120 && !madeFirstTurn) {
            speed = 0;
            direction = direction + 2;
            if (direction >= 360){
                madeFirstTurn = true;
            }
        }
        else if (madeFirstTurn && !madeLastTurn && getX()>550){
            speed = 0;
            direction = direction + 2;
            if (direction >= 450){
                madeLastTurn = true;
            }
        }
        else if (Greenfoot.getRandomNumber(2) == 1) {
            speed = 6;
        }
    }
    private void addLaps()
    {
        setLocation(179,420);
        direction = 270;
        madeFirstTurn = false;
        madeLastTurn = false;
        map raceMap2 = (map) getWorld();
        p2Laps myLaps2 = raceMap2.laps2;
        myLaps2.addLap();
    }
}
