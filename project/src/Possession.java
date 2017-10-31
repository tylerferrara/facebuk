
public class Possession extends FacebookObject{
	//private String name;
	private Image image;
	private float price;
	private Person owner;
	
	public Possession()
	{
		super();
	}
	
	
	public Possession(String name, Image image, float price)
	{
		super(name);
		this.image = image;
		this.price = price;
	}
	public void setOwner(Person owner)
	{
		this.owner = owner;
	}
//	public String getName()
//	{
//		return this.name;
//	}
	

}
