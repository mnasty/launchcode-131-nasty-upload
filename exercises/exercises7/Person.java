package exercises7;

/**
 * 
 * Identify the parts of this object:
 *      Constructor
 *      Instance variables
 *      Methods
 *         Accessors
 *         Mutators
 *         Other
 *
 */
public class Person {
	//instance var
	private int height, age;
	//constructor
	public Person(int height) {
		this.height = height;
		this.age    = 0;
	}
	
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void happyBirthday() {
		this.age = this.age + 1;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public int getAge() {
		return this.age;
	}
	

}
