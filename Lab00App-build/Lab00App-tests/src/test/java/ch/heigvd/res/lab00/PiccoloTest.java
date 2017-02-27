/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 *
 * @author fidimala
 */
public class PiccoloTest {
      @Test
  public void aPiccoloShouldMakeFufu() {
    IInstrument piccolo = new Piccolo();
    String sound = piccolo.play();
    Assert.assertEquals("fufu", sound);
  }
}
