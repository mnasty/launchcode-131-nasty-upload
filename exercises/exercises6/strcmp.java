package exercises6;

public class strcmp {

	public static boolean strcmp(String a, String b)
	{
		if (a.length() != b.length())
		{
			return false;
		}
		for (int i = 0; i < a.length(); i++)
		{
			if (a.charAt(i) != b.charAt(i))
			{
				return false;
			}
		}
		return true;
	}

	public static boolean strcmpR(String x, String y)
	{
		if (x.length() != y.length())
		{
			return false;
		}
		return strcmp2(x, y, 0);

	}

	public static boolean strcmp2(String x, String y, int i)
	{
		if (x.charAt(i) != y.charAt(i))
		{
			return false;
		}
		else if (i == x.length())
		{
			return true;
		}
		else
		{
			return strcmp2(x, y ,i++);
		}



	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(strcmpR("working", "working"));
	}

}
