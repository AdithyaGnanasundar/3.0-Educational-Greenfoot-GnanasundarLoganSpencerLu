import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class p1Laps here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class p1Laps extends p1
{
    /**
     * Act - do whatever the p1Laps wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int lap = 0;
    public void act() 
    {
       setImage("p1lap1.bmp");
        if (lap == 0) {
            setImage("p1lap1.bmp");
       } else if (lap == 1) { 
            setImage("p1lap2.bmp");
       } else if (lap == 2) {
            setImage("p1lap3.bmp");
       } else if (lap == 3) {
            setImage("p1lap4.bmp");
       } else if (lap == 4) {
            setImage("p1lap5.bmp");
       }
    }
    public int getLap()
    {
        return lap;
    }
    public void addLap()
    {
        lap ++;
    }
}    

