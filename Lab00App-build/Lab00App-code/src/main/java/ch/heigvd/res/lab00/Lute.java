package ch.heigvd.res.lab00;

public class Lute implements IInstrument {
   private static final String sound = "tingting";
   private static final int volume = 10;
   private static final String color = "brown";

   @Override
   public String play() {
      return sound;
   }

   @Override
   public int getSoundVolume() {
      return volume;
   }

   @Override
   public String getColor() {
      return color;
   }
}
