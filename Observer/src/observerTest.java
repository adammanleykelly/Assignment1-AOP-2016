/*
 * Adam Manley Kelly R00113196
 */
public class observerTest 
{
	public static void main(String [] args)
	{
			Subject subject = new Subject();
			
			new mathObserver(subject);
			new physicsObserver(subject);
			new englishObserver(subject);
			
			System.out.println("Week 6 results");
			subject.setState(30);
			
			System.out.println("Week 9 results");
			subject.setState(50);
			
			System.out.println("Week 12 results");
			subject.setState(80);
	}
}
