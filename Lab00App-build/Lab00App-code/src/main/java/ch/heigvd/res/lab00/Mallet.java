package ch.heigvd.res.lab00;

/**
 * Implementation of Mallet
 * @author Remi Jacquemard
 */
public class Mallet implements IInstrument {

    public String play() {
        return "stomp";
    }

    public int getSoundVolume() {
        return 10;
    }

    public String getColor() {
        return "blue";
    }
}
