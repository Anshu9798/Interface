
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
        
        return s + n%2;
	}
}
/*
String s = new Integer(n).toString();
int length = s.length();

String reverse = "";
for(int i =1; i<length; i++)
{
	if()
}
String finished = "";
for(int i=0; i<reverse.length(); i++)
{
	int jawn = (reverse.length()-1)-i;

	finished += reverse.charAt(jawn);
}
return finished;
*/