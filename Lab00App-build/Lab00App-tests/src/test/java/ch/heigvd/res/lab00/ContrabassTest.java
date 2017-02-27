/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author nathalie
 */
public class ContrabassTest {
      @Test
  public void aContrabassShouldMakeDzing() {
    IInstrument contrabass = new Contrabass();
    String sound = contrabass.play();
    Assert.assertEquals("dzing", sound);
  }
}
