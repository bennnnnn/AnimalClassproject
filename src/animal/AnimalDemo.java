package animal;

import org.w3c.dom.Element;

/**
 * 
 * @author Binalfew
 *
 */
public class AnimalDemo{

	public static void main(String[] args) {
		

		Animal a = new Animal();// Crate an object of the Animal class.
		System.out.println(a.eat()); // call the eat method. Animal class can only call methods available in the Animal class
		System.out.println(a.sleep());// call the  sleep method. Animal class can only call methods available in the Animal class

		Elephant e = new Elephant(); // Create a cat object
		System.out.println(e.eat());   // call the eat method to print the string in the eat method
	    System.out.println(e.sleep()); // call the sleep method to print the string inside the method
		System.out.println(e.attackPeople()); // call the purr method to execute it
		System.out.println(e.eatGrass()); // Call the bite method to execute the code inside the bite method
	    System.out.println( e.breath());

		Dog d = new Dog(); // Create an object of the Dog class.  This helps us to call and use the methods in the Dog class.
		System.out.println(d.eat());  // call the eat method 
	    System.out.println(d.sleep()); // call the sleep method 
		System.out.print(d.bark()); // call the bark method
		System.out.println(d.run()); // call the run method
		Cat c = new Cat();
		print(c.eat());
		print(c.sleep());
		print(c.purr());
		

		Bird b = new Bird();
		print(b.eat());
		print(b.sleep());
		print(b.fly());
	}
		private static void print(String s){
			System.out.println(s);
		}

	}
	 

