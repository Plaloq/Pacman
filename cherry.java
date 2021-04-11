import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cherry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cherry extends Fruit
{
    /**
     * Act - do whatever the cherry wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public cherry(){
        Score=30;
    }  
    
    public void act(){
        getPoints();
    }
    
    
}
