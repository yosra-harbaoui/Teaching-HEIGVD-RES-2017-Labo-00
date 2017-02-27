package ch.heigvd.res.lab00;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Mathias on 27/02/2017.
 */
public class BouzoukiTest {
    @Test
    public void aBouzoukiShouldMakeBOO() {
        IInstrument bouzouki = new Bouzouki();
        String sound = bouzouki.play();
        Assert.assertEquals("booooo", sound);
    }
}
