package ch.heigvd.res.lab00;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 * @author Ludovic Richard
 */
public class SawTest {
  
  @Test
  public void aTrumpetShouldMakeWoui() {
    IInstrument trumpet = new Trumpet();
    String sound = trumpet.play();
    Assert.assertEquals("woui", sound);
  }
  
}
