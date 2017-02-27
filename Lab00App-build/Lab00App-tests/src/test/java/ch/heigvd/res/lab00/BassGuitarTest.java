/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

import org.junit.Test;
import org.junit.Assert;

/**
 *
 * @author Gallouche
 */
public class BassGuitarTest {
   @Test
  public void bassGuitarShouldDoAWalk(){
    IInstrument BassGuitar = new BassGuitar();
    String sound = BassGuitar.sound();
    Assert.assertEquals("Dum Tudum Tudum Tudum Dum Dum !",sound);
  }
}
