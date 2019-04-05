/**
This program will randomly generate a loadout for a random apex legend
or the legend provided by the user. It asumes that if a user wants to play
a specific legend they will pass that name as an arg on the cmd line. It is
also assuming that no player wants to use the same gun in both slots, so a
check is made to ensure that no duplicate weapons are selected.

David Haskell 04-04-2019
please work **test line**
new test line for testbranchtwo
*/
import java.util.*;

public class ApexLoadoutGenerator{
	public static void main(String[] args){
		final int NUM_OF_WEPS = 17;
		final int NUM_OF_LEGENDS = 9;

		ArrayList legends = new ArrayList();
		ArrayList weapons = new ArrayList();

		//add all possible legends to an ArrayList
		legends.add("Bloodhound");
		legends.add("Gibraltar");
		legends.add("Lifeline");
		legends.add("Pathfinder");
		legends.add("Wraith");
		legends.add("Bagalore");
		legends.add("Caustic");
		legends.add("Mirage");
		legends.add("Octane");

		//add all possible weapons to an ArrayList
		weapons.add("Mozambique");
		weapons.add("Peacekeeper");
		weapons.add("EVA-8");
		weapons.add("Mastiff");
		weapons.add("P2020");
		weapons.add("RE-45 Auto");
		weapons.add("Wingman");
		weapons.add("R-301");
		weapons.add("Hemlok");
		weapons.add("Flatline");
		weapons.add("Havoc");
		weapons.add("Spitfire");
		weapons.add("Devotion");
		weapons.add("G7 Scout");
		weapons.add("Longbow");
		weapons.add("Triple Take");
		weapons.add("Kraber");

		//randomly pick two weapons
		Random rand = new Random();
		int weapon1 = rand.nextInt(NUM_OF_WEPS);
		int weapon2 = rand.nextInt(NUM_OF_WEPS);
		//make sure that they are not the same weapons (no one wants dups)
		while(weapon1 == weapon2){
			weapon2 = rand.nextInt(NUM_OF_WEPS);
		}

		//if no args are passed on the cmd line, give a random legend and weapons. otherwise get random weapons to go with the legend the user chose from the cmd line.
		if(args.length == 0){
			System.out.println("\nYou should play " + legends.get(rand.nextInt(NUM_OF_LEGENDS)) + ", and use " + weapons.get(weapon1) + " with a " + weapons.get(weapon2) + " this round");
		}
		else{
			System.out.println("So you want to play " + args[0] + ", try using " + weapons.get(weapon1) + " with a " + weapons.get(weapon2) + " this round");
		}
	}
}
