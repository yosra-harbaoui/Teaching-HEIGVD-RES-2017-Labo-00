package ch.heigvd.res.lab00;

/**
 *  @author Loan Lassalle
 */
 

interface IInstrument
{

     String play();
     int getSoundVolume();
     String getColor();
}

public class Maracas implements IInstrument
{
     String sound;
     int soundVolume;
     String color;
             
    public Maracas()
    {
        sound = "TshTsh";
        soundVolume = 18;
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
