package studio7;

public class Hockey {

	private String name;
	private int number;
	private boolean rlHanded;
	private int gamesCompleted;
	private int goals;
	private int assists;
	private int points;
	private int totalGames;

	
	public Hockey(String name, int number, boolean rlHanded, int gamesCompleted, int goals, int assists, int points,
			int totalGames) {
		
		this.name = name;
		this.number = number;
		this.rlHanded = rlHanded;
		this.gamesCompleted = gamesCompleted;
		this.goals = goals;
		this.assists = assists;
		this.points = points;
		this.totalGames = totalGames;
	}
	
	public void rlhanded(boolean rl)
	{
		if (rl = true)
		{
			this.rlHanded = true;
			System.out.println("Right-Handed Player");
		}
		else
		{
			this.rlHanded = false;
			System.out.println("Left-Handed Player");
		}
		
	}
	
	public boolean gamesCompleted(boolean gp)
	{
		if (gp = true)
		{
			this.gamesCompleted = this.gamesCompleted + 1;
			return true;
		}
		else
		{
			System.out.println("unn?");
			return false;
		}
		
	}
	
	public int goals(int goalsRecorded)
	{
		this.goals = this.goals + goalsRecorded;
		System.out.println(this.goals);
		return this.goals;
	}
	
	public int assists(int assistsRecorded)
	{
		this.assists = this.assists + assistsRecorded;
		System.out.println(this.assists);
		return this.assists;
	}
	
	public void totalGoals()
	{
		System.out.println(goals);
	}
	
	public void totalAssists()
	{
		System.out.println(assists);
	}
	
	//getter
	public int getGoals()
	{
		return this.goals;
	}
	
	//setter
	public void setGoals(int g)
	{
		this.goals = g;
	}
	
	public int points() 
	{
		this.points = this.goals + this.assists;
		System.out.println(this.points);
		return this.points;
	}
	
	public int totalGames()
	{
		gamesCompleted(true);
		System.out.println(gamesCompleted + totalGames);
		return this.gamesCompleted + totalGames;
		
	}
	
	public void setName(String name) {
		this.name = name;
		System.out.println(name);
	}

	public void setNumber(int number) {
		this.number = number;
		System.out.println(number);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hockey hockey1 = new Hockey("Oshie", 77 , true, 0, 136 , 225, 361,
				727);
		Hockey hockey2 = new Hockey("DougMick", 34, true, 23, 34,2345,243,2345);
		
		//hockey1.rlhanded(true);
		hockey1.setName("Backes");
		hockey1.setNumber(42);
		hockey1.gamesCompleted(true);
		hockey1.goals(3);
		hockey1.assists(1);
		//hockey1.totalGoals();
		//hockey1.totalAssists();
		hockey1.points();
		hockey1.totalGames();
		
		
		hockey1.setName("Hi");
		hockey2.setName("hello");
		
		
		
		
		
	}

}
