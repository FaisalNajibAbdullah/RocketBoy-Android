package com.najib.rocketboy;

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lubang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lubang extends Actor
{
    /**
     * Act - do whatever the lubang wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public lubang(){
        setImage("imag.png");
    }
    public void act() 
    {
        setLocation(getX()+Greenfoot.getRandomNumber(7),getY());
        if(getX()>=(getWorld().getWidth()-10))
        {
            setLocation( 0, getY());
        }
        {
            Actor lubang;
            lubang = getOneObjectAtOffset(0, 0, Roket.class);
                if(lubang != null)
                {
                    World world = getWorld();
                    world.removeObject(lubang);
                    world.stopped();
                    Greenfoot.setWorld(new play2());
                }
        }   
    }    
}
