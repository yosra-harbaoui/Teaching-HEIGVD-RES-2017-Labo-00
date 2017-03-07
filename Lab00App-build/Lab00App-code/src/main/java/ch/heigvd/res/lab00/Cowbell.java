package ch.heigvd.res.lab00;

/**
 * @author Denise Gemesio
 */
public class Cowbell implements IInstrument {

	public String play() {
		return "DingDangDong";
	}
	
	public String getSound() {
		return "DingDangDong";
	}

	public int getSoundVolume() {
		return 1000000;
	}
	
	public String getColor() {
		return "yellow";
	}

}