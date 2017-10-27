import java.util.ArrayList;

public class Moment 
{
	public String name;
	public Image image;
	public ArrayList<FacebukUser> participants;
	public ArrayList<Integer> smileValues;
	public Moment() 
	{	
	}
	public Moment(String name, Image image, ArrayList<FacebukUser> participants, ArrayList<Integer> smileValues)
	{
		this.name = name;
		this.image = image;
		this.participants = participants;
		this.smileValues = smileValues;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public void setImage(Image image)
	{
		this.image = image;
	}
	public void setParticipants(ArrayList<FacebukUser> participants)
	{
		this.participants = participants;		
	}
	public void setSmileValues(ArrayList<Integer> smileValues)
	{
		this.smileValues = smileValues;
	}
}
