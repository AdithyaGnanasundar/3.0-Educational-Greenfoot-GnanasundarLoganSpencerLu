import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class p1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class p1 extends car
{
    /**
     * Act - do whatever the p1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */;
    private int direction = 270;
    private int speed = 0;
    private int effect = 1;
    public int lap = 0;
    public static boolean canMove = true;
    public p1(){
        canMove = true;
    }
    public void act() 
    {
        setRotation(direction);
        moveByWASD();
        if (speedByRange() == 1) {
           move(speed / 3);
       } else if (speedByRange() == 0) {
           move(speed / 16);
           
       }  else {
           map raceMap = (map) getWorld();
           p2Delete delete2 = raceMap.del2;
           delete2.endP2();
           Greenfoot.stop();
        }
       }
    public void moveByWASD()
    {
        if (canMove){
            if (Greenfoot.isKeyDown("d")) {
            direction = direction + 2;
            }
            if (Greenfoot.isKeyDown("a")) {
                direction = direction - 2;
            }
            if (Greenfoot.isKeyDown("w") && speed <= 19) {
                speed = speed + 1;
            } else if (speed > 0) {
                speed = speed - 1;
            }
            if (Greenfoot.isKeyDown("s") && speed >= -4) {
                speed = speed - 1;
            } else if (speed < 0) {
                speed = speed + 1;
            }
        } else{
            speed = 0;
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
        p1Laps myLaps = raceMap.laps1;
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
    private void addLaps()
    {
        QuestionGenerator questions = QuestionGenerator.getQuestionGenerator();
        TextField textField = TextField.textFieldInstance;
        if (questions != null){
            questions.generateQuestions();
            questions.showQuestion();
            textField.showTextField();
        }
        canMove = false;
        setLocation(126,420);
        direction = 270;
        map raceMap = (map) getWorld();
        p1Laps myLaps = raceMap.laps1;
        myLaps.addLap();
    }
}
