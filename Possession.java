
public class Possession implements UserItems{
	private String name;
	private Image image;
	private float price;
	private Person owner;
	
	public Possession()
	{}
	
	
	public Possession(String name, Image image, float price)
	{
		this.name = name;
		this.image = image;
		this.price = price;
	}
	public void setOwner(Person owner)
	{
		this.owner = owner;
	}
	

}
