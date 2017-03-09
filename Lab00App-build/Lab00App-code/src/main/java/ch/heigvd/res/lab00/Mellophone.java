package ch.heigvd.res.lab00;

/**
 *
 * @author Lemdjo
 */
/*Add implementation for Mellophone*/
public class Mellophone implements IInstrument{
   	public Mellophone() {}

	public String play() {
           return "Pouet";
	}
         int getSoundVolume(){
           return 0; 
         }
          String getColor(){
             return "Golgen";
          }
   
}
