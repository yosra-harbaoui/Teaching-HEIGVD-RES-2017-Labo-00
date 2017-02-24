/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author fidimala
 */
public class Trumpet implements IInstrument{
    private String color = "golden";
    private int volume = 9;
    private String sound = "pouet";
    
    public Trumpet(){};
   
    public String play(){
    return sound;
    } 
    
    public int getSoundVolume(){
        return volume;
    }
    
    public String getColor(){
        return color;
    }
}
