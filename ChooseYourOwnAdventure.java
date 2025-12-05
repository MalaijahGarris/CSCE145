import java.util.Scanner;
public class ChooseYourOwnAdventure {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("-----Welcome to choose your own adventure!!-----");
		System.out.println("In this game, you will be able to make your own decisions to try and win the game");
		System.out.println("Good Luck!");
		
		
		System.out.print("First, pick your weapons: ");
		String weapons = scanner.nextLine();
		
		
		System.out.println("Great! You picked "+weapons+ ". Good choice! Would you like to keep these weapons? (yes/no)");
		String keepweapon = scanner.nextLine();
		
		
		
		if(keepweapon.equals ("yes"))
		{
			System.out.println("Great! You will keep your "+weapons+ ".");
		}
		else if(keepweapon.equals ("no"))
		{
			System.out.print("Okay, pick your new weapons: ");
			weapons = scanner.nextLine();
			System.out.println("You picked "+weapons+ ". Good choice!");
		}
		else
		{
			System.out.println("Choice not listed. We'll keep your original weapons: "+weapons+ ".");
		}
		
		
		
		System.out.println("Awesome! Since you picked your weapon, it's time to start the adventure!!");
		
		System.out.println("You come across two paths. One has a light shining through and the other is covered my trees.");
		
		System.out.print("Which one would you like to go through? (light or trees)");
		String pathChoice = scanner.nextLine();
		
		
		
		if(pathChoice.equals("light"))
		{
			System.out.println("You chose the path with the light. It feels very welcoming");
			System.out.println("Now you come across a waterfall and a cave");
			System.out.print("Which one would you like to go to? (cave or waterfall)");
			String lightPath = scanner.nextLine();
		
			if(lightPath.equals("waterfall"))
			{
				System.out.println("You found a amythst cave!");
				System.out.println("Would you like to take the amethyst and leave or go through a little opening? (take or opening)");
				String amethyst = scanner.nextLine();
				
				if(amethyst.equals("take"))
				{
					System.out.println("You decided to take the amethyst");
					System.out.println("Uh OH!");
					System.out.println("There was a monster protecting the amethyst and he kills you!");
					System.out.println("Game Over!");
					scanner.close();
					return;
				}
				else if(amethyst.equals("opening"))
				{
					System.out.println("You decided to go through the opening.");
					System.out.println("It's a very tight squeeze, but you manage to get through");
					System.out.println("You find a small village.");
					System.out.print("Would you like to go into the village or keep on with your adventure? (village or walk)");
					String village = scanner.nextLine();
				
					
					if(village.equals("village"))
					{
						System.out.println("You decided to go into the village and everyone is looking at you");
						System.out.println("You decided to ask someone for directions, but nobody speaks your language");
						System.out.println("The people in the village are scared of you and attack you!");
						System.out.println("You try to run, but dropped all of your things!");
						System.out.println("You have no food nor clean water and end up starving to death!");
						System.out.println("Game Over!");
						scanner.close();
						return;
					}
					else if(village.equals("walk"))
					{
						System.out.println("You decided to keep walking and come across a beautiful meadow");
						System.out.println("It has everything you need!");
						System.out.println("You decide to stay and build up your own village!");
						System.out.println("Helping many people who are going on the same adventure as you!");
						System.out.println("You win!! Game Over!");
						scanner.close();
						return;
					}
				}
			}
			
			else if(lightPath.equals("cave"))
			{
				System.out.println("It's very dark, but luckily you have a lantern on you!");
				System.out.println("UH OH!");
				System.out.println("There was a bunch of black widows and they fell on you!!");
				System.out.println("You got bitten all over and succumbed to your injuries. Game Over!");
				scanner.close();
				return;
			}
		}
		else if (pathChoice.equals("trees"))
		{
			System.out.println("You chose the path with the trees. It feels very mysterious");
			System.out.println("Theres a lake with a boat and a mineshaft.");
			System.out.print("Would you like to cross the lake or go in the mineshaft? (lake or mineshaft): ");
			String lakeChoice = scanner.nextLine();
		
		if(lakeChoice.equals("lake"))
		{
			System.out.println("You chose to cross the lake.");
			System.out.println("After you cross the lake, you discover a house");
			System.out.println("You can either go in the house or search the basement.");
			System.out.print("Would you like to go in the house or the basement? (house or basement): ");
			String house = scanner.nextLine();
			
			if(house.equals("house"))
					{
						System.out.println("You decided to go into the house.");
						System.out.println("It's very dark and the floors are steady creaking");
						System.out.println("You hear a whisper coming from behind you.");
						System.out.println("As you turn around, you see a witch!");
						System.out.println("She attacks you and hold you hostage!");
						System.out.println("Game Over");
						scanner.close();
						return;
					}
			else if(house.equals("basement"))
					{
				System.out.println("You decided to go in the basement.");
				System.out.println("Its very dark down there, but you find a light switch");
				System.out.println("You see out of the corner of your eye something shiny");
				System.out.println("When you get close to it, you fidn out that it's gold!");
				System.out.println("You have found the stolen treasure!!");
				System.out.println("YOU WIN!");
				scanner.close();
				return;
					}
		}
		else if(lakeChoice.equals("mineshaft"))
		{
			System.out.println("You chose to go in the mineshaft.");
			System.out.println("You can either go left or right.");
			System.out.print("Would you like to go left or right? ");
			String leftRight = scanner.nextLine();
			
		if(leftRight.equals ("left"))
		{
			System.out.println("You decided to go to the left, but it very unstable.");
			System.out.println("Every time you take a step, everything around you shakes.");
			System.out.println("You try to go back, but get scared by a sudden growl which causes all of the rocks to fall on you!");
			System.out.println("Game Over.");
			scanner.close();
			return;
		}
		else if(leftRight.equals("right"))
		{
			System.out.println("You decided to go right.");
			System.out.println("You find a ladder that goes up and one that goes down.");
			System.out.print("Would you like to go up or down? (up or down): ");
			String upDown = scanner.nextLine();
			
			if(upDown.equals("up"))
			{
				System.out.println("You decided to go up");
				System.out.println("While going up, the ladder starts to shake!");
				System.out.println("Rocks start falling on your head while your trying to climb up");
				System.out.println("It's shaking so bad until a boulder comes flying down on top of you!!");
				System.out.println("The impact was so bad, you died instantly!");
				System.out.println("Game Over.");
				scanner.close();
				return;
			}
			else if(upDown.equals("down"))
			{
				System.out.println("You decided to go down");
				System.out.println("The ladder is barely stable and there are steps missing");
				System.out.println("You are trying your best to hold on, but as your going down, one of the steps snap!");
				System.out.println("You hit your head on a rock and die instantly!");
				System.out.println("Game Over.");
				scanner.close();
				return;
			}
		}
		else
		{
			System.out.println("Invalid input. Exiting the game now.");
			scanner.close();
			return;
		}
	}
	}
	}
}
		
		
		
		

	


