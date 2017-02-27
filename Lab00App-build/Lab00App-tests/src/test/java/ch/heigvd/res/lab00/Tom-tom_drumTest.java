package ch.heigvd.res.lab00;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 * 
 * @author Zanone Jérémie
 */
public class Tom-tom_drumTest {


  @Test
  public void aTom-tom_drumShouldMakeTom-tom() {
    IInstrument Tom-tom_drum = new Tom-tom_drum();
    String sound = Tom-tom_drum.play();
    Assert.assertEquals("tom-tom", sound);
  }
   
 
}