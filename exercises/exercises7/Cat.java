package exercises7;

public class Cat {
    
	//1.) declare values
	private String furContent;
	private int lives;
	
	//2.) initiate values (think default values for object)
	public Cat (String furContent, int lives)
	{
		this.furContent = "Normal Fur";
		this.lives = 9;
	}
    
	//3.) use values in methods as modifiers to achieve a desired change in object
	
	//shed fur	
	public String shed(String desc) {
		this.furContent = desc;	
		return this.furContent;
	}
	
	//kill cat
	public boolean kill(boolean kill)
	{
		if (kill = true)
		{
			this.lives = this.lives - 9;
			System.out.println("Dammit you killed the cat!");
			return true;
		}
		return false;
		
	}

	public static void main(String [] args)
	{
		//4.) create object
		Cat cat1 = new Cat("Hella Fur", 9);
		
		//5.) modify object 
		cat1.shed("Bald ass cat!");
		cat1.kill(true);
		
		//print modifications
		System.out.println("Fur Content: " + cat1.furContent);
		
	}
	
}
