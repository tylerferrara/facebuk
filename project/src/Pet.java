import java.util.ArrayList;

public class Pet extends FacebukUser implements UserItems{
	public Person owner;
	public ArrayList<Person> friends;
	public Pet()
	{
		super();
	}
	public Pet(String name, Image image)
	{
		super(name,image);
		
	}
	public void setOwner(Person owner)
	{
		this.owner = owner;
	}
}