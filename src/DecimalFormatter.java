
public class DecimalFormatter implements NumberFormatter
{
	public String format(int n)
	{
		String s = new Integer(n).toString();
		int length = s.length();
		
		String reverse = "";
		for(int i =1; i<length+1; i++)
		{
			reverse += s.charAt(length-i);
			 if(i%3 == 0 && i!=length)
			 {
				 reverse+= ".";
			 }
		}
		String finished = "";
		for(int i=0; i<reverse.length(); i++)
		{
			int dookie = (reverse.length()-1)-i;

			finished += reverse.charAt(dookie);
		}
		return finished;
	}
}
