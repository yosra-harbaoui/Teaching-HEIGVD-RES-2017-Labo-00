package ch.heigvd.res.lab00;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class SlideWhistleTest {
	
  @Test
  public void aSlideWhistleShouldMakePouet() {
    IInstrument slidewhistle = new SlideWhistle();
    String sound = slidewhistle.play();
    Assert.assertEquals("fuuuuu", sound);
  }

}
