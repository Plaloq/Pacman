import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (Eduardo Velazquez Flores) 
 * @version (a version number or a date)
 */
public class PacmanLevel1 extends World
{
    public static int score = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public PacmanLevel1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 700, 1);
        for(int x = 50; x < 1200; x+=100){
            this.addObject(new Wall(), x, 50);
        }
        
        for(int x = 50; x < 1200; x+=100){
            this.addObject(new Wall(), x, 650);
        }
        
        for(int y = 50; y < 300; y+=100){
            this.addObject(new Wall(), 50, y);
        }
        
        for(int y = 450; y < 700; y+=100){
            this.addObject(new Wall(), 50, y);
        }
        
        for(int y = 50; y < 300; y+=100){
            this.addObject(new Wall(), 1150, y);
        }
        
        for(int y = 450; y < 700; y+=100){
            this.addObject(new Wall(), 1150, y);
        }
        
        for(int x = 350; x < 900; x+=100){
            this.addObject(new Wall(), x, 450);
        }
        
        for(int y = 250; y < 450; y+=100){
            this.addObject(new Wall(), 350, y);
        }
        
        for(int y = 250; y < 450; y+=100){
            this.addObject(new Wall(), 850, y);
        }
        
        this.addObject(new Wall(), 450, 250);
        this.addObject(new Wall(), 750, 250);
        
        addObject(new Pacman(), 150, 150);
        
        for(int x = 250; x < 1050; x+= 100){
            this.addObject(new Ball(), x, 150);
        }
        
        for(int x = 250; x < 1050; x+= 100){
            this.addObject(new Ball(), x, 550);
        }
        
        addObject(new BallB(), 250, 350);
        addObject(new BallB(), 950, 350);
        
        addObject(new banana(), 450, 350);
        addObject(new cherry(), 750, 350);
        
        //addObject(count, 50, 50);
        
       
    }
    
    public void act(){
         showText("Score: " + score,50,50);
        }
    
}
