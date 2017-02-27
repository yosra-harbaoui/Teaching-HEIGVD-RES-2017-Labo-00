import org.junit.Test;

/**
@author Tano Iannetta
*/
public class CastanetsTest {

    @Test
    public void expectedSoundCastanets()
    {
        IInstrument c = new Castanets();
        String son = Castanets.play();
        Assert.assertEquals("chiki chiki", son);
    }


}
