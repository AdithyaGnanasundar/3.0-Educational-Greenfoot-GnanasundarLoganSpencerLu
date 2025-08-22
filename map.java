import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class map here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class map extends World
{

    /**
     * Constructor for objects of class map.
     * 
     */
    public p1Laps laps1;
    public p2Laps laps2;
    public p1 P1;
    public p2 P2;
    public p1Delete del1;
    public p2Delete del2;
    public winner winner;
    private TextField mathInput;
    public map()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 500, 1); 
        P1 = new p1();
        addObject(P1,126,420);
        P2 = new p2();
        addObject(P2,179,420);
        laps1 = new p1Laps();
        addObject(laps1,300,250);
        laps2 = new p2Laps();
        addObject(laps2,400,250);
        del1 = new p1Delete();
        addObject(del1,0,0);
        del2 = new p2Delete();
        addObject(del2,0,0);
        winner = new winner();
        addObject(winner,0,0);
        mathInput = new TextField();
        addObject(mathInput, 350, 340);
        QuestionGenerator questionGenerator = new QuestionGenerator();
        addObject(questionGenerator, 350, 280);
    }
    public p1 p1Laps() {
        return  laps1;
    }
}
