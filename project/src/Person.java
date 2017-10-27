import java.util.ArrayList;

public class Person extends FacebukUser
{
	private ArrayList<Pet> pets;
	private ArrayList<Person> friends;
	private ArrayList<Possession> possessions;
	
	
	public Person()
	{
		super();
	}
	public Person(String name, Image image)
	{
		super(name, image);
//		this.friends = friends;
//		this.possessions = possessions;
	}
	public void setPossesions(ArrayList<Possession> possessions)
	{
		this.possessions = possessions;
	}
	public void setPets(ArrayList<Pet> pets)
	{
		this.pets = pets;
	}
	
	
}
