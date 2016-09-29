/*
 * Adam Manley Kelly R00113196
 */
public class englishObserver extends Observer
{
	public englishObserver(Subject subject)
	{
			this.subject = subject;
			this.subject.attach(this);
	}
	
	@Override
	public void update()
	{
		System.out.println("English Grade " + Integer.toString(subject.getState()));
	}

}
