import java.util.ArrayList;

public class FacebukUser {
	private  String name;
	private Image image;
	private ArrayList<FacebukUser> friends;
	private ArrayList<Moment> moments;
	
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
	public ArrayList<FacebukUser> getFriends() 
	{
		return friends;
	}
	public void setFriends(ArrayList<FacebukUser> friends)
	{
		this.friends = friends;
	}
	public void setMoments(ArrayList<Moment> moments)
	{
		this.moments = moments;
	}
	public FacebukUser getFriendWithWhomIAmHappiest()
	{
		// looks through list of moments in each friend
		// finds the friend with highest overallHappiestMoment
		return new FacebukUser(); //<=====temp
	}
	public Moment getOverallHappiestMoment()
	{
		// looks through list of moments
		// finds the highest average happiness moment
		return new Moment(); //<=====temp
	}
}
