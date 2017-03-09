package ch.heigvd.res.lab00;

/**
 *
 * @author SILVERCORP
 */
public class Mandolin implements IInstrument {   
    
    private String color = "golden";
    private int soundVolume = 10;
    
    public Mandolin() { }
    public String play() { return "zing";}
    public int getSoundVolume() {return soundVolume;}	
    public String getColor() {	return color;}
	
    
}
