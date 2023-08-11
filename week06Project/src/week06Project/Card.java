package week06Project;

public class Card {

	private int value; //creates private value variable 
	private String name; //creates private name variable
	
	//constructor 
	public Card(int value, String name) {
		this.value = value; 
		this.name = name;
	}

	public int getValue() { //getter for value 
		return value;
	}

	public void setValue(int value) { //setter for value 
		this.value = value;
	}

	public String getName() { //getter for name 
		return name;
	}

	public void setName(String name) { //setter for name 
		this.name = name;
	}
	
	public String describe () { //prints and returns the name of the card 
		System.out.println(name);
		return name;
	}
	
}
