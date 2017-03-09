package ch.heigvd.res.lab00;

/**
 *
 * @author Yosra
 */
public class Harmonica implements IInstrument{
        public Harmonica(){
        sound = "dap dap";
        color = "black";
        soundVolume = 40;
    }
    public String play(){
        return sound;
    }
    public String getColor(){
        return color;
    }
    
    public int getSoundVolume(){
        return soundVolume;
    }
    
    private String sound;
    private String color;
    private int soundVolume;
}
