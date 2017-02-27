/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author annie
 */
public class BaritoneHornTest {
   
   @Test
  public void aBaritoneHornShouldMakePouet() {
    IInstrument baritoneHorn = new BaritoneHorn();
    String sound = baritoneHorn.play();
    Assert.assertEquals("concertina", sound);
  }
   
}
