//(c) A+ Computer Science
//www.apluscompsci.com
//Name -


public class LineCounter
{
   private String line;

   public LineCounter()
   {
		setLine("");
   }

   public LineCounter(String s)
   {
	   this.line = s;
   }

	public void setLine(String s)
	{
		this.line = s;
	}

	public int getCount()
	{
		String[] numbers = this.line.split(" ");
		int count=numbers.length;	
		return count;
	}

	public String getLine()
	{
		return line;
	}

	public String toString()
	{
		return getLine() + "\nCount: " + getCount();
	}
}