/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Eddie
 */
public class PipaTest {
    
  @Test
  public void aPipaShouldMakeAyy() {
    IInstrument pipa = new Pipa();
    String sound = pipa.play();
    Assert.assertEquals("ayy", sound);
  }
}
