public class Team
{
	private String teamName;
	private String playerName; 
	private int teamRank; 


	public Team(String teamName)
	{
		this.teamName = teamName; 
	}



	public void setRank(int teamRank)
	{
		this.teamRank = teamRank; 
	}


	pubic String toString()
	{
		return teamName + " " + "De Uovervindelige rank" + " " + teamRank; 
	}

}