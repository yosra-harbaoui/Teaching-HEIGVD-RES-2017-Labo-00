package ch.heigvd.res.lab00;

/**
 * 
 * @author Nathan Gonzalez
 */
public class EnglishHorn implements IInstrument{

    private final String sound;
    private int volume;
    private final String color;

    public EnglishHorn(){
        this.sound = "fluflu";
        this.volume = 10;
        this.color = "brown";
    }
    
    @Override
    public String play(){
            return sound;
    }

    @Override
    public int getSoundVolume(){
    	return volume;
    }

    @Override
    public String getColor(){
    	return color;
    }
}
