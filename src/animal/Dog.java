
package animal;

 /**
  * 
  * @author Binalfew
  *
  */

public class Dog extends Animal {  // Dog class extends the Animal class because Dog class is Animal
	
	public Dog()  // Dog class constructor. this constructs Dog class objects
	{
	 super();  // call the super class methods/constructors
	System.out.println("A bird is hatched...");
	}
	
	
	@Override // over ride the sleep method
	public String sleep() {
	return "A bird sleeps soundly...";
	}
	
	@Override // over ride the eat method
	public String eat() {
	return "A bird eats...";
	}
	
	 // a bark method that prints "Dogs bark". THis method has a bark method that other methods don't. 
	public String bark()
	{
	 
	return " Dogs bark.";
	}
	
	// This run method is only in Dog class. it returns the string "Dogs run".
	public String run(){
		return "Dogs runn..";
	}
}

 
