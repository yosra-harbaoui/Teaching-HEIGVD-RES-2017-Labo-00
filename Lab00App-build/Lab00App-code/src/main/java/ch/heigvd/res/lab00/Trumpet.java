package ch.heigvd.res.lab00;

interface IInstrument{

   String play();
   int getSoundVolume();
   String getColor();
}

public class Trumpet implements IInstrument{
   @Override
   public String play() {
      return "pouet";
   }

   @Override
   public int getSoundVolume() {
      return 42;
   }

   @Override
   public String getColor() {
      return "golden";
   }
}

class Flute implements IInstrument{
   @Override
   public String play() {
      return "fulululuuu";
   }

   @Override
   public int getSoundVolume() {
      return 24;
   }

   @Override
   public String getColor() {
      return "wood";
   }
}
