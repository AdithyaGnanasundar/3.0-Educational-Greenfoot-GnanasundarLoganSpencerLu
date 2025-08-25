import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TextField here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TextField extends Actor
{
    private boolean focused = false;
    private String currentText = "";
    public static TextField textFieldInstance;
    
    public TextField(){
        hideTextField();
        textFieldInstance = this;
    }
    
    public void act()
    {
        if (Greenfoot.mouseClicked(this) && !focused){
            GreenfootImage image = new GreenfootImage("                 ", 30, Color.BLACK,  Color.WHITE);
            setImage(image);
            focused = true;
        }
        if (focused){
            String newText = Greenfoot.getKey();
            if (newText != null && !newText.equals("w") && !newText.equals("a") && !newText.equals("d")){
                if (newText.toString().equals("space")){
                currentText += " ";
                } else if (newText.equals("backspace")){
                    if (currentText.length()>0){
                        currentText = currentText.substring(0, currentText.length()-1);
                    }
                } else if (newText.toString().equals("enter")){
                    if (currentText.equals(QuestionGenerator.answer)){
                        p1.canMove = true;
                        focused = false;
                        currentText = "";
                        hideTextField();
                        QuestionGenerator.getQuestionGenerator().hideQuestion();
                    }
                }else{
                    currentText += (newText.toString());
                }
            }
            GreenfootImage image = new GreenfootImage(currentText, 30, Color.BLACK,  Color.WHITE);
            setImage(image);
        }
    }
    public void showTextField(){
        focused = true;
        GreenfootImage image = new GreenfootImage("   ", 30, Color.BLACK,  Color.WHITE);
        setImage(image);
    }
    public void hideTextField(){
        setImage(new GreenfootImage("", 50, Color.BLACK,  null));
    }
}
