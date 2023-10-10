import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class koin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class koin extends Pendukung
{
    int speed = 3;
    public void act()
    {
        koin a = new koin();
        Actor i = getOneIntersectingObject(koin.class);
        move(speed);
        checkdouble(i);
        end();
    }
}
