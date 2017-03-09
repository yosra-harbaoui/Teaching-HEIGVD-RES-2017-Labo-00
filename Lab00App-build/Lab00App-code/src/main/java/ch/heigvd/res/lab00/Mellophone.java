/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
