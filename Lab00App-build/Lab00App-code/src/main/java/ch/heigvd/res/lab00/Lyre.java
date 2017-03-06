package ch.heigvd.res.lab00;

//@author Tano Iannetta
class Lyre implements IInstrument {

    private String sound = "drlingdrling";
    private int volume = 10;
    private String color = "golden";

    public Lyre(){
    }

    public String play()
    {
        return sound;
    }
    public int getSoundVolume()
    {
        return volume;
    }
    public String getColor()
    {
        return color;
    }


}
