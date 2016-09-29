/*
 * Adam Manley Kelly R00113196
 */
public class lollipopObserver extends Observer
{
	public lollipopObserver(Subject state)
	{
			this.state = state;
			this.state.attach(this);
	}
	
	@Override
	public void update()
	{
		System.out.println("Lollipops Sold: " + state.getState());
	}
}