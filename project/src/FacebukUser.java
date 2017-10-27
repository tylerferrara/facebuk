
public class FacebukUser {
	private  String name;
	private Image image;
	
	public FacebukUser()
	{}
	public FacebukUser(String name, Image image)
	{
		this.name = name;
		this.image = image;
	}
	public String getName()
	{
		return name;
	}
	public Image getImage()
	{
		return image;
	}
}
