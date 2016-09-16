package lab7;

public class Point
{
	private double x;
	private double y;

	public Point(double x, double y)
	{
        this.x = x;
        this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
    public String toString()
    {
    	return new Point(x , y).toString();
    }
    
    public Point plus(Vector v)
    {
    	//vector
    	double c = v.getDeltaX();
        double d = v.getDeltaY();
        
        double e = c + this.x;
        double f = d + this.y;
        
        return new Point(e, f);
    }
    
    public Vector minus(Point a)
    {
    	double b = a.getX();
    	double c = a.getY();
    	
    	double d = this.x - b;
    	double e = this.y - c;
    	
    	return new Vector(d, e);
    	
    }
    
    public double distance(Point a)
    {
    	double d = Math.sqrt(Math.pow(this.x - a.getX(), 2) + Math.pow(this.getY() - a.getY(), 2));;
    	return d;
    }
    
}



