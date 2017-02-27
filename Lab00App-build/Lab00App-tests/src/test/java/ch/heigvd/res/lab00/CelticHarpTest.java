package ch.heigvd.res.lab00;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/** 
 * @author Loan Lassalle
 */
public class CelticHarpTest
{ 
    public void getSoundTest()
    {
        IInstrument celticharp = new CelticHarp();
        String sound = celticharp.play();
        Assert.assertEquals("celtic harp", sound);
    }  
}
