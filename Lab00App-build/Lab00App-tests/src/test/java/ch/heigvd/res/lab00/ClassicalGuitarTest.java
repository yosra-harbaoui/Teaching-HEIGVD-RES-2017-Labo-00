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
 * @author Gabriel Luthier
 */
public class ClassicalGuitarTest {
      
  @Test
  public void aClassicalGuitarShouldMakeDwing() {
    IInstrument classicalGuitar = new ClassicalGuitar();
    String sound = classicalGuitar.play();
    Assert.assertEquals("dwing", sound);
  }
}
