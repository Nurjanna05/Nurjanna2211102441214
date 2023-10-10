import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1); 
        prepare();
    }
    
    private void prepare()
    {
        Ambulan ambulan = new Ambulan();
        addObject(ambulan,159,545);
    }
    
    public void act()
    {
    if(Greenfoot.getRandomNumber(100)<1){
    addObject(new Mobilbiru(), Greenfoot.getRandomNumber(200) + 30, 0);
    }
    if(Greenfoot.getRandomNumber(200)<1){
    addObject(new bom(), Greenfoot.getRandomNumber(200) + 20, 600);
    }
    if(Greenfoot.getRandomNumber(200)<1){
    addObject(new koin(), Greenfoot.getRandomNumber(200) + 30, 0);
    }
    }
}
