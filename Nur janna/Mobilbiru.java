import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mobilbiru here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mobilbiru extends Pendukung
{
    int speed = 3;
    public void act()
    {
        Mobilbiru a = new Mobilbiru();
        Actor i = getOneIntersectingObject(Mobilbiru.class);
        move(speed);
        checkdouble(i);
        end();
    }
}
