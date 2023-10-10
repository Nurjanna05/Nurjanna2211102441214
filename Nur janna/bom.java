import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bom extends Pendukung
{
    int speed = -20;
    public void act()
    {
        bom a = new bom();
        Actor i = getOneIntersectingObject(bom.class);
        move(speed);
        checkdouble(i);
        end();
    }
}
