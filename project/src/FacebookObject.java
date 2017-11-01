/* FacebookObject: General super class that holds equals methods for
 *  Person, Pet, Possesion, and Moment objects, also stores name
 */
public class FacebookObject {
	
	//Instance variables
	
	private String name;

	//----------------------------------------------------------------------------
	//CONSTRUCTORS
	
	public FacebookObject()
	{
		
	}
	
	public FacebookObject(String name)
	{
		this.name = name;
	}
	//----------------------------------------------------------------------------
	//INSTANCE METHODS
	
	
	//Returns the name of the object called on
	public String getName()
	{
		return this.name;
	}
	
	//Checks if called object has the same (string) name as the object passed in
	public boolean equals(Object other)
	{
		if(other instanceof Person)
		{
			if(this.getName().equals(((Person) other).getName()))
			{
				return true;
			}
			else 
				return false;
		}
		else if(other instanceof Possession)
		{
			if(this.getName().equals(((Possession) other).getName()))
			{
				return true;
			}
			else 
				return false;
			
		}
		else if (other instanceof Pet)
		{
			if(this.getName().equals(((Pet) other).getName()))
			{
				return true;
			}
			else
				return false;
		}
		else if (other instanceof Moment)
		{
			if(this.getName().equals(((Moment) other).getName()))
			{
				return true;
			}
			else
				return false;
		}
		return false;
	}
	
	//Local tester
	public static void main(String[] args)
	{
		FacebookObject test1 = new Person("Michelle2", new Image("Michelle2.png"));
		FacebookObject test2 = new Pet("xd", new Image("Michelle2.png"));
	
		System.out.println(test1.equals(test2));
		
		//Create tests for Moments and possessions as well
	}

}

