/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author Yosra
 */
public class CalliopeTest {
    public void aCalliopeShouldMakeZiw() {
    IInstrument calliope = new Calliope();
    String sound = calliope.play();
    Assert.assertEquals("ziw", sound);
  }

}
