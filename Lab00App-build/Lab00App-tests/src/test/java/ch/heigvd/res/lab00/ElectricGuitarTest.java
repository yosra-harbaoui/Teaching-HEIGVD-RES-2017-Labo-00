package ch.heigvd.res.lab00;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 * Classe testant une guitare éléctrique
 * @author P-B Monaco
 * @author Olivier Liechti
 */
public class ElectricGuitarTest {

  @Test
  public void thereShouldBeAnIInstrumentInterfaceAndAnElectricGuitarClass() {
    IInstrument eGuitar = new ElectricGuitar();
    assertNotNull(eGuitar);
  }
    
  @Test
  public void anElectricGuitarShouldMakeWaaWaaaa() {
    IInstrument eGuitar = new ElectricGuitar();
    String sound = eGuitar.play();
    Assert.assertEquals("waawaaaa", sound);
  }
  
  @Test
  public void anElectricGuitarShouldBeLouderThanASteelDrum() {
    IInstrument eGuitar = new ElectricGuitar();
    IInstrument steelDrum = new SteelDrum();
    int eGuitarVolume = eGuitar.getSoundVolume();
    int steelDrumVolume = steelDrum.getSoundVolume();
    Assert.assertTrue(eGuitarVolume > steelDrumVolume);
  }

  @Test
  public void anElectricGuitarShouldHaveSixOrSevenStrings() {
    IInstrument eGuitar = new ElectricGuitar();
    int nbString = eGuitar.getStringNumber();
    Assert.assertTrue(nbString == 6 || nbString == 7);
  }
 
}
