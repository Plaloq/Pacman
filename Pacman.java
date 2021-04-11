 import greenfoot.*; 

/**
 * Write a description of class Pacman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pacman extends Actor
{
    private static final int OFFSET = 5;
    private int currentImage;
    private int counter;
    PacmanLevel1 thisGame;
    Fruit points;
    
    public Pacman(){
        setImage("images/pacman.png");
    }
    
    /**
     * Act - do whatever the Pacman wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveMouth();
        
        handleDirection();
        Fruit fruit1= new Fruit();
    
        Actor ball1 = getOneIntersectingObject(Ball.class);
        if(ball1 !=null){
            getWorld().removeObject(ball1);
            thisGame.score=thisGame.score+10; 
        }
        
        Actor ball2 = getOneIntersectingObject(BallB.class);
        if(ball2 !=null){
            getWorld().removeObject(ball2);
            thisGame.score = thisGame.score + 50;
        }
        
    }
    
    public void handleDirection(){
        int x= getX();
        int y = getY();
        if(Greenfoot.isKeyDown("right")){
            setLocation(x + OFFSET, y);
        }
        else if(Greenfoot.isKeyDown("left")){
            setLocation(x - OFFSET, y);
        }
        else if(Greenfoot.isKeyDown("down")){
            setLocation(x , y + OFFSET);
        }
        else if(Greenfoot.isKeyDown("up")){
            setLocation(x , y - OFFSET);
        }
        
        if(isTouching(Wall.class)){
            if(Greenfoot.isKeyDown("right")){
                setLocation(x-5, y);
            }
            if(Greenfoot.isKeyDown("left")){
                setLocation(x+5, y);
            }
            if(Greenfoot.isKeyDown("down")){
                setLocation(x, y-5);
            }
            if(Greenfoot.isKeyDown("up")){
                setLocation(x, y+5);
            }
        }
        
        if(isAtEdge()){
            if(Greenfoot.isKeyDown("right")){
                setLocation(50, 350);
            }
            if(Greenfoot.isKeyDown("left")){
                setLocation(1150, 350);
            }
        }   
    }
    
    public void moveMouth(){
        if(counter == 0){
            if(currentImage == 0){
                setImage("images/pacman.png");
            }else if(currentImage == 1){
                setImage("images/pacman2.png");
            }
            
            currentImage = (currentImage + 1) % 2;
        }
        counter = (counter+1)%10;
    }
}
