import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo
/**
 * Write a description of class Fruit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fruit extends Actor
{
    protected int Score;
    
    public void act() 
    {
    }
    
    void getPoints(){
        if(isTouching(Pacman.class)){
            PacmanLevel1.score += Score;
            getWorld().removeObject(this);
        }
    }
    
}
