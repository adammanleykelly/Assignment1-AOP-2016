/*
 * Adam Manley Kelly R00113196
 */
public class Factory 
{
	 public Candy getCandy(String sweetType)
	    {
	        if(sweetType == null)
	        {
	        return null;
	        }
	        if(sweetType.equalsIgnoreCase("lollipop"))
	        {
	            return new lollipop();
	        }
	        else if(sweetType.equalsIgnoreCase("kitkat"))
	        {
	            return new kitkat();
	        }
	        
	        return null;
	    }
}
