import greenfoot.Actor;
import greenfoot.Greenfoot;

public class Crab extends Actor {
    public Crab() {
        setImage("crab.png");
    }

    public void act() {
        move(1);
        Greenfoot.playSound("click.wav");
    }
}
