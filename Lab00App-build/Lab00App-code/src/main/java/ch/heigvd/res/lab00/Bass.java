package ch.heigvd.res.lab00;

/**
 * Branch:
 * Projet: Lab00App-build
 * File: Bass
 * 01.03.17 at 11:25
 *
 * @author Lawrence Stalder
 * @brief
 */
public class Bass implements  IInstrument {
    private String sound = "boum boum";

    public String play() {
        return sound;
    }
}
