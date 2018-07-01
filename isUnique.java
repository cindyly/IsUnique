
public class isUnique {
	public boolean Unique(String s)
	{
		boolean unique = true;
		char[] all = s.toCharArray();
			for (int i = 0; i < all.length; i++)
		{
			for (int z = i+1; z < all.length-1; z++)
			{
				if (all[i] == all[z])
				{
					unique = false;
				}
				
			}
		
		}
		return unique;
		
	}
	
	public static void main(String[] args)
	{
		String input = "a n d";
		isUnique result = new isUnique();
		if (result.Unique(input) == false)
		{
			System.out.println("Not Unique!");
		}
		else
		{
			System.out.println("Unique!");
		}
	}

}