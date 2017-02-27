/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author Adrian
 */
public class BanjoTest {
    @Test
    public void aBanjoShouldMakeBoing() {
        IInstrument banjo = new Banjo();
        String sound = banjo.play();
        Assert.assertEquals("boing", sound);
    }
}
