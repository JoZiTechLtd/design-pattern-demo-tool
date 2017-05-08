package DPs;

import java.util.Scanner;

import AbstractFactory.OctopusFactory;
import AbstractFactory.OctopusType;

import Adaptor.AudioPlayer;

import Bridge.BlueCircle;
import Bridge.Circle;
import Bridge.RedCircle;
import Bridge.Shape;

import Composite.Crew;

import Facade.DrinkMaker;

import Factory.RealAleFactory;
import Factory.RealAleType;

import Singleton.Contact;
import Singleton.ContactList;

import Strategy.Context;
import Strategy.OperationAdd;
import Strategy.OperationMultiply;
import Strategy.OperationSubtract;

public class Demo {

	public static void main(String[] args) {
	// TODO Auto-generated method stub

		
		//Define scanner object for input from keyboard
		Scanner scan = new Scanner(System.in);
		
		boolean isValid = false;
		
		while (isValid == false) {
			
			System.out.println("======================");
			System.out.println("SELECT DESIGN PATTERN:");
			System.out.println("======================");
			System.out.println("1. Singleton");
			System.out.println("2. Factory");
			System.out.println("3. Abstract Factory");
			System.out.println("4. Facade");
			System.out.println("5. Adaptor");
			System.out.println("6. Bridge");
			System.out.println("7. Composite");
			System.out.println("8. Strategy");
			System.out.println("======================");	
			//Prompt for input
			System.out.print("Choice: ");	
			
			
			try {
				
				//Try assigning value to integer - Exception will be caught
				int choice = Integer.parseInt(scan.next());
				
				
				if (choice >= 1 && choice <= 8) {
					
					//Invoke method according to choice made
					System.out.println();
					switch (choice) {
					
					case 1: singletonDemo();
					break;
					
					case 2: factoryDemo();
					break;
					
					case 3: abstractFactoryDemo();
					break;
					
					case 4: facadeDemo();
					break;
					
					case 5: adaptorDemo();
					break;
					
					case 6: bridgeDemo();
					break;
					
					case 7: compositeDemo();
					break;
					
					case 8: strategyDemo();
					break;
					
					default: 
						System.out.println();
						System.out.println("Invalid Choice");
						System.out.println();
					break;
					
					}
					
					System.out.println("======================");
					System.out.print("Finished... Run Again? (Y / N): ");
					String again = scan.next();
					System.out.println();
					System.out.println();
					
					if (again.equalsIgnoreCase("y") || again.equalsIgnoreCase("yes")) {
						
					} else {
						//break out of loop
						break;
					}
					
				} else {
					System.out.println();
					System.out.println("Invalid Choice - Please Choose Between 1 and 8.");
					System.out.println();
					System.out.println();
			}
			
		
			} catch (Exception e) {
				
				System.out.println();
				System.out.println("Format Exception, Please select a number.");
				System.out.println();
				System.out.println();
			
			}
		}
		
		System.out.println();
		System.out.println("FINISHED");
	}
	
	
	private static void singletonDemo() {
		
		System.out.println("SINGLETON DEMO");
		System.out.println();
		
		//Create a contact list
		ContactList myContacts = ContactList.getInstance();
		
		//Add a contact
		Contact newContact1 = new Contact ("Mr", "Fred", "Bloggs", "01234 567890");
		myContacts.addContact(newContact1);
		
		Contact newContact2 = new Contact ("Mrs", "Sheila", "Bloggs", "09876 543210");
		myContacts.addContact(newContact2);
		
		//Output the contacts
		//Get the list name
		System.out.println(myContacts.getListName());
		System.out.print(myContacts.toString());
		System.out.println();
		
		//Prove the contacts list is a Singleton
		System.out.println("Attempt to get new contact list...");
		System.out.println("The Singleton will return the current instance... so it cannot be instaniated again.");
		ContactList theContacts = ContactList.getInstance();
		System.out.println(theContacts.getListName());
		System.out.println(theContacts.toString());
		System.out.println();
		
	}
	
	private static void factoryDemo() {
		
		System.out.println("FACTORY DEMO");
		System.out.println();
		
		//Test the Octopus factory
		RealAleType Bitter = RealAleType.BITTER;
		RealAleType Golden = RealAleType.GOLDEN;
		RealAleType Mild = RealAleType.MILD;
		RealAleType Stout = RealAleType.STOUT;
		RealAleType Barley_Wine = RealAleType.BARLEY_WINE;

		try {
			System.out.println("Brewed a Golden Ale:");
			System.out.println(RealAleFactory.makeRealAle(Golden));
		} catch (Exception e) {
			System.out.println("Error: That was a bad brew of Golden Ale...");
		}
		System.out.println();
		
		try {
			System.out.println("Brewed a Bitter:");
			System.out.println(RealAleFactory.makeRealAle(Bitter));
		} catch (Exception e) {
			System.out.println("Error: That was a bad brew of Bitter...");
		}
		System.out.println();
		
		try {
			System.out.println("Brewed a Mild:");
			System.out.println(RealAleFactory.makeRealAle(Mild));
		} catch (Exception e) {
			System.out.println("Error: That was a bad brew of Mild...");
		}
		System.out.println();
		
		try {
			System.out.println("Brewed a Stout:");
			System.out.println(RealAleFactory.makeRealAle(Stout));
		} catch (Exception e) {
			System.out.println("Error: That was a bad brew of Stout...");
		}
		System.out.println();
		
		try {
			System.out.println("Brewed a Barley Wine:");
			System.out.println(RealAleFactory.makeRealAle(Barley_Wine));
		} catch (Exception e) {
			System.out.println("Error: That was a bad brew of Stout...");
		}
		System.out.println();
		
	}
	
	private static void abstractFactoryDemo() {
		
		System.out.println("ABSTRACT FACTORY DEMO");
		System.out.println("(Shedding light on BIO's secret Octopus splicing activities...");
		System.out.println();
		
		/*
		 * Take a factory and add another layer of abstraction....
		 * 
		 * In essence, it instantiates factories...
		 */
		
		//Test Octopus Abstract Factory
		OctopusType normal = OctopusType.NORMAL;
		OctopusType mutant = OctopusType.MUTANT;
		OctopusType supermutant = OctopusType.SUPERMUTANT;
		
		try {
			System.out.println("Making a normal Octopus, (hopefully with 8 tentacles)...");
			System.out.println(OctopusFactory.makeOctopus(normal));
		} catch (Exception e) {
			System.out.println("Error: Ooops, the Octopus was spliced with a Mouse and became an Octomouse. It has since ran away!");
		}
		System.out.println();
		
		try {
			System.out.println("Making a mutant octopus (beware, these creatures are unpredictable)...");
			System.out.println(OctopusFactory.makeOctopus(mutant));
		} catch (Exception e) {
			System.out.println("Error: This mutant Octopus was starting to evolve into a Super Mutant and the Lizard King demanded its immediate destruction.");
		}
		System.out.println();
		
		try {
			System.out.println("Making a Super-Mutant Octopus (This is a very dangeous and stupid thing to do)...");
			System.out.println(OctopusFactory.makeOctopus(supermutant));
		} catch (Exception e) {
			System.out.println("Error: The Lizard King has decreed all Super Mutant Octopuses must be immediate destroyed.");
		}
		
		System.out.println();
		
	}
	
	private static void facadeDemo() {
		
		System.out.println("FACADE DEMO");
		System.out.println();
		
		//Instantiate the DrinkMaker facade
		DrinkMaker dm = new DrinkMaker();
		
		//The DrinkMaker facade exposes the drink methods - but does not reveal the underlying methods
		System.out.println("The facade allows access to the drinks, but does not reveal underlying methods etc.");
		dm.getBeer();
		dm.getWine();
		dm.getCoffee();
		dm.getTea();

		System.out.println();
		
		
	}	
	
	private static void adaptorDemo() {
		
		System.out.println("ADAPTOR DEMO");
		System.out.println();
		
		//instantiate the audio player
		AudioPlayer ap = new AudioPlayer();
		
		//Test out the examples
		ap.play("mp3", "Sub Focus - Turn Back Time");
		ap.play("flac", "Paul Van Dyk - For An Angel");
		ap.play("ogg", "Ellie Goulding - Starry Eyed");
		ap.play("wav", "Robin Thicke - Blurred Lines");
		ap.play("wma", "Storm Queen - Look Right Through");
		
		System.out.println();
		
	}	
	
	private static void bridgeDemo() {
		
		System.out.println("BRIDGE DEMO");
		System.out.println();
		
		Shape redCircle = new Circle(150,150, 15, new RedCircle());
		Shape blueCircle = new Circle(150, 150, 15, new BlueCircle());
		
		//Draw the circles
		redCircle.draw();
		blueCircle.draw();
		System.out.println();
		
	}	
	
	private static void compositeDemo() {
		
		System.out.println("COMPOSITE DEMO");
		System.out.println();
		
		Crew captain = new Crew("Katherine Janeway","Captain","Command","Captain");
		Crew firstOfficer = new Crew("Chakotay","Commander","Command","First Officer");
		
		Crew chiefEngineer = new Crew("B'Elanna Torres","Lieutenant","Engineering and Security","Chief Engineer");
		Crew chiefOfSec = new Crew("Tuvok","Lieutenant Commander","Engineering and Security","Chief of Security");
		
		Crew helmsman = new Crew("Tom Paris","Lieutenant Junior Grade","Command","Conn");
		Crew opsMan = new Crew("Harry Kim","Ensign","Engineering and Security","Operations Manager");
		Crew engineer1 = new Crew("Vorik","Ensign","Engineering and Security","Engineer");
		
		Crew medic = new Crew("The Doctor","N/A","Science and Medical","Captain");
		
		
		captain.add(firstOfficer);
		firstOfficer.add(chiefOfSec);
		firstOfficer.add(chiefEngineer);
		firstOfficer.add(medic);
		firstOfficer.add(helmsman);
		
		chiefEngineer.add(engineer1);
		chiefOfSec.add(opsMan);
		
		//Print the hierarchy
		
		System.out.println("Crew of Federation Starship USS Voyager");
		System.out.println();
		System.out.println(captain);
		
		for (Crew senior : captain.getSubordinates()) {
			System.out.println(senior);
			
			for (Crew mid : senior.getSubordinates()) {
				System.out.println(mid);
				
				for (Crew junior : mid.getSubordinates()) {
					System.out.println(junior);
				}
			}
		}
		
	}	
	
	private static void strategyDemo() {
		
		System.out.println("STRATEGY DEMO");
		System.out.println();
		Scanner stratScan = new Scanner (System.in);
		
		/* CODE FOR GETTING FIRST NUMBER */
		Integer num1 = null;
		Integer num2 = null;
		
		while (num1 == null) {
			System.out.print("Enter a number: ");
			num1 = getNumber(stratScan.next());
		}
		
		/* CODE FOR GETTING SECOND NUMBER */
		while (num2 == null) {
			System.out.print("Enter another number: ");
			num2 = getNumber(stratScan.next());
		}
		
		Context ctx = new Context(new OperationAdd());
		System.out.println(num1 + " + " + num2 + " = " + ctx.executeStrategy(num1, num2));
		
		ctx = new Context(new OperationSubtract());
		System.out.println(num1 + " - " + num2 + " = " + ctx.executeStrategy(num1, num2));
		
		ctx = new Context(new OperationMultiply());
		System.out.println(num1 + " * " + num2 + " = " + ctx.executeStrategy(num1, num2));
		
	}	
	
	private static Integer getNumber(String input) {
		
		//Try assigning value to integer - Exception will be caught
		try {
		
			//Try and parse the int
			int number = Integer.parseInt(input);
			
			return number;
		
		} catch (Exception e) {
			
			System.out.println("Invalid Number Format - Try Again.");
			return (Integer) null;
			
		}
		
	}

}
