/*
 * Adam Manley Kelly R00113196
 */
public class mathObserver extends Observer
{

	public mathObserver(Subject subject)
	{
			this.subject = subject;
			this.subject.attach(this);
	}
	
	@Override
	public void update()
	{
		System.out.println("Math Grade " + Integer.toString(subject.getState()));
	}
	
}
