package ch.heigvd.res.lab00;

/**
 * 
 * @author Nathan Gonzalez
 */
public class EnglishHorn implements IInstrument{

	private String sound;
	private int volume;
	private String color;

	public EnglishHorn(String sound, int volume, String color){
		this.sound = sound;
		this.volume = volume;
		this.color = color;
	}

  	public String play(){
  		return sound;
  	}

    public int getSoundVolume(){
    	return volume;
    }

    public String getColor(){
    	return color;
    }
}
