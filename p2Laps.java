import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class p2Laps here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class p2Laps extends p2
{
    /**
     * Act - do whatever the p2Laps wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int lap = 0;
    public void act() 
    {
       
       if (lap == 0) {
            setImage("p2lap1.bmp");
       } else if (lap == 1) { 
            setImage("p2lap2.bmp");
       } else if (lap == 2) {
            setImage("p2lap3.bmp");
       } else if (lap == 3) {
            setImage("p2lap4.bmp");
       } else if (lap == 4) {
            setImage("p2lap5.bmp");
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

