package studio4;

import java.awt.Color;

import cse131.ArgsProcessor;
import sedgewick.StdAudio;
import sedgewick.StdDraw;
import sedgewick.StdIn;

public class Flag {


	public static void main(String[] args) {

		StdDraw.setCanvasSize(640, 480);
		StdDraw.setPenColor(Color.CYAN);
		StdDraw.filledRectangle(.500, .500, .50, .50);

		//border
		StdDraw.setPenRadius(.01); //pen size changed
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.rectangle(.500, .500, .50, .50);

		//corner 1
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.line(0.0, .200, .200, 0.0);
		//corner 2
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.line(0.0, 0.8, 0.2, 1.0);
		//corner 3
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.line(0.8, 1.0, 1.0, 0.8);
		//corner 4
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.line(0.8, 0.0, 1.0, 0.2);

		StdDraw.picture(.500, .500, "images/ice1.jpg");

		double x = .200;
		double y = .2;
		while (x < 1)
		{
			StdDraw.text(x, y, "Chill Outia");
			x = x + .200;
			y = y + .200;
			StdDraw.show(1000);
		}

		int j = 0;			
		ArgsProcessor.useStdInput("sound/tomsdiner.txt");
		// repeat as long as there are more integers to read in
		while (!StdIn.isEmpty() && j < 1000) {
			j = j + 1;
			// read in the pitch, where 0 = Concert A (A4)
			int pitch = StdIn.readInt();

			// read in duration in seconds
			double duration = StdIn.readDouble();

			// build sine wave with desired frequency
			double hz = 440 * Math.pow(2, pitch / 12.0);
			int N = (int) (StdAudio.SAMPLE_RATE * duration);
			double[] a = new double[N+1];
			for (int i = 0; i <= N; i++) {
				a[i] = Math.sin(2 * Math.PI * i * hz / StdAudio.SAMPLE_RATE);	
			}

			// play it using standard audio
			StdAudio.play(a);
		}

	}
}



