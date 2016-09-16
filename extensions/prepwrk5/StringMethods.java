package prepwrk5;

public class StringMethods {
	
	public static String dup(String in)
	{
		return copies (in,2);
	}
	
	public static String copies(String s, int n)
	{
		String ans = "";
		for (int i = 0; i < n; i++)
		{
			ans = ans + s;
		}
		return ans;
		
	}
	
	public static String join(String[] array, String joiner)
	{
		String ans = array[0];
		for (int i = 1; i < array.length; i++)
		{
			ans = ans + joiner + array[i];
		}
		return ans;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(dup("hello"));
		for (int i = 0; i < 5; i++)
		{
			System.out.println(copies("comp sci", i));
		}
		
		String s = "I like computer science";
		String[] words = s.split(" ");
		for (String w : words)
		{
			System.out.println("a word:" + w);
		}
	}

}
