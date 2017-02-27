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
 * @author Chaymae
 */
public class ClavichordTest {
    
      @Test
  public void aClavichordShouldMakeTing() {
    IInstrument harmonica = new Harmonica();
    String sound = harmonica.play();
    Assert.assertEquals("ting", sound);
  }
  
}
