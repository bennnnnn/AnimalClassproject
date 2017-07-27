package animal;

 /**
  * 
  * @author Binalfew
  *
  */
public class Elephant extends Animal { // THe cat class extends the animal class. THis way the xcat class can use the methods that are in the animal class.

	public Elephant() // a no-arg constructor
	{
	super(); // call the super class constructor
	System.out.println("Now I am a Cat!");
	}
	
	@Override // over ride the sleep method
	public String sleep() {
		return "A cat sleeps...";
	}
	
	@Override // over ride the eat method
	public String eat() {
		return "A cat eats...";
	}
	
	// purr method prints the string "Elephants eat grass...". It is only available in the Cat class
	public String eatGrass(){
		return ".Elephants eat grass..";
	}
	// The bite method is available is only in the Elephant  class and it prints the string "Cats bite.."
	public String attackPeople (){
		return  "Elephants attack people..";
		
	}
	public boolean breath(){
	return true;
	  
	}
	}

