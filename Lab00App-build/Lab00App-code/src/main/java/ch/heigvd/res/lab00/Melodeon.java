/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author Aurelie Levy
 */
public class Melodeon implements IInstrument {
    public String play() {
        return "Tralala";
    }

    public int getSoundVolume() {
        return 5;
    }
    public String getColor(){
        return "white";
    }
}
