/*
 * Adam Manley Kelly R00113196
 */
public class physicsObserver extends Observer
{
	public physicsObserver(Subject subject)
	{
			this.subject = subject;
			this.subject.attach(this);
	}
	
	@Override
	public void update()
	{
		System.out.println("Physics Grade " + Integer.toString(subject.getState()));
	}
	
}
