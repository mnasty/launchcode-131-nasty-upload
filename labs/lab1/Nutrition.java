package lab1;

import cse131.ArgsProcessor;

public class Nutrition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArgsProcessor ap = new ArgsProcessor(args);
    String nameFood = ap.nextString("What is the name of the food we are analyzing?");
    double carbGrams = ap.nextDouble("Please enter the carbohydrate content of this food:");
    double fatGrams = ap.nextDouble("Please enter the fat content of this food:");
    double proteinGrams = ap.nextDouble("Please enter the protein content of this food:");
    double calorieContent = ap.nextDouble("Please enter the calorie content of this food:");
    
    double unavaliableCal = (carbGrams * 4)  +  (fatGrams * 9)  +  (proteinGrams * 4)  - (calorieContent);
    double fiberGrams = (unavaliableCal / 4);
    double unavaliableDecimal = Math.round(unavaliableCal * 1000);
    double fiberDecimal = Math.round(fiberGrams * 1000);
    double carbPercent = Math.round(carbGrams * 4 / calorieContent * 1000);
    double fatPercent = Math.round(fatGrams * 9 / calorieContent * 1000);
    double proteinPercent = Math.round(proteinGrams * 4 / calorieContent * 1000);
    
    double lowcarbCheck = carbGrams * 4;
    double lowfatCheck = fatGrams * 9;
    
    boolean lowcarbAccp = calorieContent * .25 >= lowcarbCheck;
    boolean lowfatAccp = calorieContent * .15 >= lowfatCheck;
    boolean heads = Math.random() >= 0.5;
    
	System.out.println("For your " + nameFood + ":");
	System.out.println("Based on the input provided, this food has " + calorieContent + " avaliable calories.");
    System.out.println("With a total of " + unavaliableDecimal / 1000 + " unavaliable calories, this food has "+ fiberDecimal / 1000 +" gram(s) of fiber.");
    System.out.println("");
    System.out.println("   -" + carbPercent / 10 + "% of it is carbohydrates.");
    System.out.println("   -" + fatPercent / 10 + "% of it is fat.");
    System.out.println("   -" + proteinPercent / 10 + "% of it is protein.");
    System.out.println("");
    System.out.println("This food is suitable for a low-carb diet? " + lowcarbAccp + "");
    System.out.println("This food is suitable for a low-fat diet? " + lowfatAccp + "");
    System.out.println("Java thinks you should eat this food? " + heads + "");

	}

	//complete assignment one!
	
}
