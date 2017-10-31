import java.util.ArrayList;

public class Pet extends FacebukUser{
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
	//public String getName()
	//{
	//	return this.getName();
	//}
}