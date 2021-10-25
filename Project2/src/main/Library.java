package main;

import java.util.Scanner;

public class Library {

	public static String libraryEntrance(String NAME)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println(NAME + "is at the library entrance right now");
		System.out.println(NAME + " was thinking of checking out the Library to see if any useful information will be there and if the library has any new comics!");
		System.out.println("Narrator: " + NAME + " needs a Library Pass to enter the back section." + NAME +" remembers what happened last time someone forgot it and they lost their pants!!");
		System.out.println( "What will " + NAME + " do next? Right now it seems like they're just going to stand there like a statue, apparently");
		String input = sc.nextLine();
		return input;
	}
	
	public static void libraryFront (String NAME, String command)
	{
		String [] inputs = {"visit", "use", "look", "check inventory", "help"};
		System.out.println(NAME + " walks into the library.");
		System.out.println("So what are you doing while you're in here?: ");
		command = TextGame.checkInput(inputs);
		String place = "";
		if(command=="visit"){
			place=TextGame.visit(place);
		}
		
		else if(command=="help"){
			TextGame.help();	
		}
		
		else if(command=="check inventory"){
			Inventory.checkInv(NAME);	
		}
		
		else if(command=="look"){
			System.out.println(NAME + " looks around the library and sees no comics in sight.");
        		System.out.println("Well, of course there aren't comic books. This is a library not Barnes & Noble.");
        		System.out.println(NAME +" does spot the section that has lots of old books when they finally stop moping about the comics.");
        		System.out.println("You should be able to use the books through the books for information about the treasure.");
		}
		
		else if(command=="use"){
			if(!(Inventory.hasItem("map"))){
				System.out.println( NAME + " starts skimming through the books because they can't be bothered to actually read and a piece of paper falls out of the last book they were holding.");  
        			System.out.println("That was convenient. The paper is a very faded map that’s hard to read.");
        			System.out.println("It looks like it might be a map of the cave, but I wouldn’t use that as my guide. You’d probably get lost or die or something.");
       				System.out.println("That being said you do whatever floats your boat, I'm just the unfortunate narrator that has to deal with you...");
				Inventory.addItemToInv("map", NAME);
			}
			else if(Inventory.hasItem("map")){
				System.out.println(NAME + " starts skimming through the books yet again, because they can't be bothered to actually read.");
			}
				
		}
	}
		
}
