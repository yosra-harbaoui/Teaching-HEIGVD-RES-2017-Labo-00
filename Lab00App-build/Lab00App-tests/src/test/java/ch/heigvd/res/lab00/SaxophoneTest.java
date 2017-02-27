package ch.heigvd.res.lab00;

import org.junit.Assert;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pierre-samuelrochat
 */
public class SaxophoneTest {
    
    public void aSaxophoneShouldMakePouetPouet() {
        IInstrument saxophone = new Saxophone();
        String sound = saxophone.play();
        Assert.assertEquals("PouetPouet", sound);
    }
}
