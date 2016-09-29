/*
 * Adam Manley Kelly R00113196
 * This is my submission for Assignment 1 of the capped lab work implementing the Factory and Observer patterns in a
 * simple console application.
 * I did have a bit of trouble with having the kitkat/lollipop classes implementing the candy interface and extending the 
 * observer class at the same time so I split them up in order to have the project work in some manner
 */
/* 
 * I also had some trouble downloading the github desktop app however i have uploaded this project via the web version
 * https://github.com/adammanley-kelly/Assignment1-AOP-2016
 * I included my practice versions of both the observer and factory design patterns 
 */
import java.util.Scanner;

public class FactoryObserverTest 
{
	public static void main(String [] args)
	{
		//Factory
		Factory sweetFactory = new Factory();
		
		Scanner sc = new Scanner(System.in);
		int lollipopsSold = 23;
		int kitkatsSold = 17;
		int choice = -1;
		do
		{
			System.out.println("Would you like a lollipop or a kitkat?");
			System.out.println("1. Lollipop");
			System.out.println("Or a");
			System.out.println("2. Kitkat");
			System.out.println("");
			System.out.println("3.Exit");
			choice = sc.nextInt();
			
			if (choice == 1)
			{
				//Factory
				Candy sweet = sweetFactory.getCandy("lollipop");
				sweet.display();
				
				//Observer
				Subject state1= new Subject();
				new lollipopObserver(state1);
				state1.setState(lollipopsSold ++);
				System.out.println("");
			}
			
			else if(choice==2)
			{
				//Factory
				Candy sweet2 = sweetFactory.getCandy("kitkat");
				sweet2.display();
				
				//Observer
				Subject state2= new Subject();
				new kitkatObserver(state2);
				state2.setState(kitkatsSold ++);
				System.out.println("");
			}
		}while(choice !=3);
		sc.close();
		System.exit(0);
	}
}
