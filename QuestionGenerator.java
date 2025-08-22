import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class QuestionGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QuestionGenerator extends Actor
{
    private int num1;
    private int num2;
    private String[] operations = {"addition", "subtraction", "multiplication", "division"};
    private String currentText = "";
    public static String answer = "";
    private static QuestionGenerator questionGenerator;
    
    

    
    public QuestionGenerator(){
        questionGenerator = this;
    }
    
    public static QuestionGenerator getQuestionGenerator(){
        return questionGenerator;
    }
    
    public void generateQuestions(){
        num1 = Greenfoot.getRandomNumber(99) + 1;
        num2 = Greenfoot.getRandomNumber(99) + 1;
        int index = Greenfoot.getRandomNumber(operations.length);
        if (operations[index].equals("addition")){
            currentText = num1 + " + " + num2;
            int number = num1+num2;
            answer =  "" + number;
        } else if (operations[index].equals("subtraction")){
            currentText = num1 + " - " + num2;
            int number = num1-num2;
            answer =  "" + number;
        } else if (operations[index].equals("multiplication")){
            currentText = num1/10 + " X " + num2/10;
            int number = (num1/10)*(num2/10);
            answer =  "" + number;
        } else if (operations[index].equals("division")){
            int number;
            if (num2/10 == 0){
                currentText = num1/10 + " / " + 1;
                number = (num1/10)/(1);
            } else{
                currentText = num1/10 + " / " + num2/10;
                number = (num1/10)/(num2/10);
            }
            answer =  "" + number;
        }
    }
    
    public void showQuestion(){
        GreenfootImage image = new GreenfootImage(currentText, 50, Color.WHITE,  Color.BLACK);
        setImage(image);
    }
    public void hideQuestion(){
        setImage(new GreenfootImage("", 50, Color.BLACK,  null));
    }
}
