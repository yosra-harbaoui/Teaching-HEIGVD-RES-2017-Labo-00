/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

import org.junit.Assert;

/**
 *
 * @author SILVERCORP
 */

public class CelloTest {
     public void aTrumpetShouldMakeBoumBoum() {
    IInstrument trumpet = new Trumpet();
    String sound = trumpet.play();
    Assert.assertEquals("boum boum", sound);
  }
    
}
