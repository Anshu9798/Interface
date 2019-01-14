
public class BaseTwoFormatter implements NumberFormatter
{
	public String format(int n)
	{
		String s = "";
        
        while (n/2 != 0)
        {
            s += n%2;
            n /= 2;
        }
        String reverse = "" + s + n%2;
    	
    	String finished = "";
    	for(int i=0;i<reverse.length();i++)
    	{
    		int reverser = (reverse.length()-1)-i;

    		finished += reverse.charAt(reverser);
    	}
    	return finished;
	}
	
}
