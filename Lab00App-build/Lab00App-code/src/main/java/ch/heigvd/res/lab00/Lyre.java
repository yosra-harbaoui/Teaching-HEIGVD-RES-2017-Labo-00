package ch.heigvd.res.lab00;

//@author Tano Iannetta

interface IInstrument{

    public String play();
}

class Lyre implements IInstrument {

    private String sound = "drlingdrling";

    public Lyre(){

    }

    public String play()
    {
        return sound;
    }

}
