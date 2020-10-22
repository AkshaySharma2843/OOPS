// Java program to demonstrate

// This class will contain 
// 3 methods with same name, 
// yet the program will 
// compile & run successfully 
public class Polymarphism { 

	// Overloaded sum(). 
	// This sum takes two  parameters 
	public int sum(int x, int y) 
	{ 
		return (x + y); 
	} 

	// Overloaded sum(). 
	// This sum takes three i parameters 
	public int sum(int x, int y, int z) 
	{ 
		return (x + y + z); 
	} 

	// Overloaded sum(). 
	// This sum takes two double parameters 
	public double sum(double x, double y) 
	{ 
		return (x + y); 
	} 

	// Driver code 
	public static void main(String args[]) 
	{ 
		Polymarphism s = new Polymarphism(); 
		System.out.println(s.sum(10, 20)); 
		System.out.println(s.sum(10, 20, 30)); 
		System.out.println(s.sum(10.5, 20.5)); 
	} 
} 

