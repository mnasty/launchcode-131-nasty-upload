package studio2;

public class Pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double circleCounter = 0;
        
        for (int i = 0; i < 1000; i++)
        {
		double x = Math.random();
		double y = Math.random();
		
		double difX = Math.abs(x-0.5);
		double difY = Math.abs(y-0.5);
		
		double dX2 = Math.pow(difX, 2);
		double dY2 = Math.pow(difY, 2);
		
		double sum = dY2 + dX2;
		double distance = Math.sqrt(sum);
		
		if(distance <= 0.5)
		{
			circleCounter = circleCounter + 1;
		}
        
        }
		double ratio = (circleCounter/1000.0)*4;
		System.out.println(ratio);
        
        
		//for(int i = 0; i < 1000; i++)
		//{
			//double x1 = Math.random();
			//double x2 = Math.random();
			//double y1 = Math.random();
			//double y2 = Math.random();
			
			//double a = (x1 - x2);
			//double b = (y1 - y2);
			
			//double c = Math.sqrt();
			
			
		//}
		
		
		
	}

}
