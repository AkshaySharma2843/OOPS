// Java program to demonstrate 
// the bird class 

// Implementing the bird class 
public class Encapsulation { 

	// Few properties which 
	// define the bird 
	String color; 
	String legs; 

	// Implementing the getters and 
	// setters for the color and legs. 

	public void setColor(String color) 
	{ 
		this.color = color; 
	} 

	public String getColor() 
	{ 
		return this.color; 
	} 

	public void setLegs(String legs) 
	{ 
		this.legs = legs; 
	} 

	public String getLegs() 
	{ 
		return this.legs; 
	} 

	// Few operations which the 
	// bird performs 
	public void eat() 
	{ 
		System.out.println( 
			"This bird has eaten"); 
	} 

	public void fly() 
	{ 
		System.out.println( 
			"This bird is flying"); 
	} 
} 
