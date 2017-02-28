package ch.heigvd.res.lab00;

/** Test class for testing class Carillon
 */
public class Carillon {
    @Test
    public void CarillonShouldMakeDong() {
        IInstrument carillon = new Carillon();
        String sound = carillon.play();
        assertEquals("Dong", sound);
    }
}
