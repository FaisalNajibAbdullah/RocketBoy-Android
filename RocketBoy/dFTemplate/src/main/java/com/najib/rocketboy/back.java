package com.najib.rocketboy;

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class back here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class back extends Actor
{
    /**
     * Act - do whatever the back wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public back(){
        setImage("back.png");
    }
    boolean mouseDown;
    public void act() 
    {
        if(Greenfoot.mousePressed(this)){
            mouseDown = true;  
            World world = getWorld();
            world.stopped();
            Greenfoot.setWorld(new mulai());
        }else if(Greenfoot.mouseClicked(this)){ 
            mouseDown = false; 
        }
    }     
}
