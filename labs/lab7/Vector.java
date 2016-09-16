package lab7;

public class Vector {
	
	private double deltaX;
	private double deltaY;
   
	
	public Vector (double deltaX, double deltaY)
	{
		this.deltaX = deltaX;
		this.deltaY = deltaY;

	}
	
	public String toString(double x, double y)
	{
		return new Vector(x, y).toString();
	}
	
	public double getDeltaX()
	{
		return deltaX;
	}
	
	public double getDeltaY()
	{
		return deltaY;
	}
	
	public double magnitude()
	{
		double mag = 0;
		mag = Math.sqrt(Math.pow(this.deltaX, 2) + Math.pow(this.deltaY, 2));
		return mag;
	}
	
	public Vector deflectX()
	{
		double x = 0;
		x = this.deltaX * -1;
		return new Vector(x, this.deltaY);
	}
	
	public Vector deflectY()
	{
		double y = 0;
		y = this.deltaY * -1;
		return new Vector(this.deltaX, y);
	}
	
	
	public Vector plus(Vector v)
	{
		double a = 0;
		double b = 0;
		a = this.deltaX + v.deltaX;
		b = this.deltaY + v.deltaY;
		
		return new Vector(a , b);
		
	}
	
	public Vector minus(Vector v)
	{
		double a = 0;
		double b = 0;
		a = this.deltaX - v.deltaX;
		b = this.deltaY - v.deltaY;
		
		return new Vector(a , b);
		
	}
	
	public Vector scale(double factor)
	{
		double a = 0;
		double b = 0;
		
		a = this.deltaX * factor;
		b = this.deltaY * factor;
		
		return new Vector(a , b);	
				
	}
	
	public Vector rescale(double magnitude)
	{
		//Vector v = new Vector(this.deltaX, this.deltaY);
		// defines the magnitude.
		double a = magnitude();
		double b = magnitude/a;
		//v = v.scale(a);
		if (a == 0)
		{
			Vector c = new Vector(magnitude , 0);
			return c;
		}
		return scale(b);
	}
	
	/*
	public Vector rescale(double magnitude)
	{
		
	}
	*/
	
	
	
	
}

