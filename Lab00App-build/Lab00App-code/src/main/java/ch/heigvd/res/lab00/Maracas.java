package ch.heigvd.res.lab00;

/**
 *  @author Loan Lassalle
 */
 

public class Maracas implements IInstrument
{
     String sound;
     int soundVolume;
     String color;
             
    public Maracas()
    {
        sound = "TshTsh";
        soundVolume = 19;
        color = "wood";
    }

    public String play()
    {
        return sound;
    }

    public int getSoundVolume()
    {
        return soundVolume;
    }

    public String getColor()
    {
        return color;
    }
}
