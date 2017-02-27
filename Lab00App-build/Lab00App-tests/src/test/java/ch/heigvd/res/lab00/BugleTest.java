package ch.heigvd.res.lab00;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Maxime Guillod
 */
public class BugleTest {

    @Test
    public void aBugleShouldMakePouetpouet() {
        IInstrument trumpet = new Trumpet();
        String sound = trumpet.play();
        Assert.assertEquals("pouetpouet", sound);
    }

}
