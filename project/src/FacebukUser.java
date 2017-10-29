import java.util.ArrayList;

public class FacebukUser {
	private  String name;
	private Image image;
	private ArrayList<FacebukUser> friends;
	public ArrayList<Moment> moments;  // SHOULD THIS BE PUBLIC???
	
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
		if(this.friends.size() > 0) 
		{
			FacebukUser HappiestWithFriend = new FacebukUser();
			int maxHappyLevel = -100000;
			// get each friend		
			for(int i = 0; i < this.friends.size(); i++)
			{
				FacebukUser f = this.friends.get(i);
				// find max Happy Value with main User 
				int friendMax = maxHappyLevelOfPersonInMoments(FacebukUser.this, f.moments); 
				// ******NOTE: ^^^^ is FacebukUser.this main User!!!!!!!??? ******
				if(friendMax > maxHappyLevel)
				{	
					// new happiest friend
					HappiestWithFriend = f;
					maxHappyLevel = friendMax;
				}
			}
			return HappiestWithFriend;
		} else 
		{
			// No friends :(
			return null;
		}		
	}
	private Integer maxHappyLevelOfPersonInMoments(FacebukUser user, ArrayList<Moment> moments)
	{	
		int maxHappyVal = -100000; 
		for(int i = 0; i < moments.size(); i++)
		{
			Moment m = moments.get(i);
			for(int k = 0; k < m.participants.size(); k++)
			{
				FacebukUser p = m.participants.get(k);
				if(p.equals(user))
				{
					// User is in this moment!!!
					if(m.smileValues.get(k) > maxHappyVal)
					{
						// Add to the maxHappyVal
						maxHappyVal = m.smileValues.get(k);
					}
				}
			}
		}
		// will return -10000 if no moments found with FacebukUser
		return maxHappyVal;
	}
	public Moment getOverallHappiestMoment()
	{
		if(this.moments.size() > 0)
		{
			Moment bestMoment = new Moment(); 
			int maxHappyAvg = -10000;
			for(Moment m : this.moments)
			{
				int happySum = 0;
				for(int val : m.smileValues)
				{
					happySum += val;
				}
				int happyAvg = happySum / m.smileValues.size();
				if(happyAvg > maxHappyAvg)
				{
					// new best moment
					maxHappyAvg = happyAvg;
					bestMoment = m;
				}
			}
			return bestMoment;
		} else
		{
			// No moments :(
			return null;
		}
	}
	//Returns a list of the largest possible group of facebuk users who are friends with the target user
//	public ArrayList<FacebukUser> findMaximumCliqueOfFriends()
//	{
//		
//	}
	private ArrayList<FacebukUser> findClique()
	{
		ArrayList<FacebukUser> cliques = new ArrayList<FacebukUser>();
		if( (this.friends != null) && (this.friends.size()>1))
		{
			
		}
		return cliques;
	}
	private ArrayList<ArrayList<FacebukUser>> generateList()
	{
		ArrayList<ArrayList<FacebukUser>> list = new ArrayList<ArrayList<FacebukUser>>();
		if(this.friends != null && this.friends.size() > 0) 
		{
			for(FacebukUser f: this.friends)
			{
				ArrayList<FacebukUser> list2 = new ArrayList<FacebukUser>();
				if(f.friends != null && f.friends.size() > 0)
				{
					for(FacebukUser f2: f.friends)
					{
						list2.add(f2);
					}
				}
				list.add(list2);
			}
		}
		return list;
	}
}
