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
 * @author Remi
 */
public class CelestaTest {

    @Test
    public void aCelestaShouldMakeGling() {
        IInstrument celesta = new Celesta();
        String sound = celesta.play();
        Assert.assertEquals("gling", sound);
    }
}
