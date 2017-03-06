package ch.heigvd.res.lab00;

//@author Tano Iannetta
class Lyre implements IInstrument {

    private String sound = "drlingdrling";

    public Lyre(){

    }

    public String play()
    {
        return sound;
    }

}
