package ch.heigvd.res.labo00;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class BellTest {
  @Test
  public void aBellShouldMakePouet() {
    IInstrument trumpet = new Trumpet();
    String sound = trumpet.play();
    Assert.assertEquals("bell", sound);
  }
}

