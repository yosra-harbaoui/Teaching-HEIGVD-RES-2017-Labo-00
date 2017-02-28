package ch.heigvd.res.lab00;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class HarmonicaTest {

  
  @Test
  public void aHarmonicaShouldMakeharmonica() {
    IInstrument harmonica = new Harmonica();
    String sound = harmonica.play();
    Assert.assertEquals("harmonica", sound);
  }
  

 
}

