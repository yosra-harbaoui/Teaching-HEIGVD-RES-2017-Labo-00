package ch.heigvd.res.lab00;

/**
 * Created by Colin Lavanchy on 28.02.17.
 */
public class Marimba implements IInstrument {
    @Override
    public String play() {
        return "dumdumdum";
    }

    @Override
    public int getSoundVolume() {
        return 15;
    }

    @Override
    public String getColor() {
        return "brown";
    }
}
