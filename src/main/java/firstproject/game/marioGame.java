package firstproject.game;

public class marioGame implements GamingConsole{
    public void up(){
        System.out.println("Jump");
    }
    public void down(){
        System.out.println("Go to Hole");
    }
    public void left(){
        System.out.println("Go Back");
    }
    public void right(){
        System.out.println("Accelerate");
    }
}
