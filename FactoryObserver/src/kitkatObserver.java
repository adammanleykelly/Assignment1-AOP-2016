/*
 * Adam Manley Kelly R00113196
 */
public class kitkatObserver extends Observer
{
	public kitkatObserver(Subject state)
	{
			this.state = state;
			this.state.attach(this);
	}
	
	@Override
	public void update()
	{
		System.out.println("Kitkats Sold: " + Integer.toString(state.getState()));
	}
}
