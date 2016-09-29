/*
 * Adam Manley Kelly R00113196
 */
public class factoryfarmTest 
{
	public static void main(String [] args)
	   {
	       factoryfarm vegtableFactory = new factoryfarm();
	       
	       vegtable veg1 = vegtableFactory.getVegtable("Potatoe");
	       veg1.grow();
	       
	       vegtable veg2 = vegtableFactory.getVegtable("Carrot");
	       veg2.grow();
	   }
}
