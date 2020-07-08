package EPAM.COLLECTION;

import java.util.Scanner;;
public class App 
{
	public static void main(String[] args)
	{
		Custom_List<Integer> c=new Custom_List<Integer>();
		Scanner s=new Scanner(System.in);
		String ch1="y";
		do
		{
			System.out.println("Enter your choice: ");
			System.out.println("1.Fetching \n2.Adding \n3.Removing \n4.Printing");
			int ch=s.nextInt();
			switch(ch)
			{
			case 1:

				System.out.println("Enter the index of the element you want to fetch (0-n) : ");
				int index1=s.nextInt();
				System.out.println("The element at the "+index1+"th index is "+c.get(index1));
				break;
			case 2:
				System.out.println("Enter how many elements you want");
				int n=s.nextInt();
				System.out.println("Enter elements: ");
				for(int i=0;i<n;i++)
				{
					int num=s.nextInt();
					c.add(num);
				}
				System.out.println("The list is created");
				break;
			case 3:
				System.out.println("Enter the index of element you want to remove (0-n) :");
				int index=s.nextInt();
				c.remove(index);
				System.out.println("The element is removed Successfully!!!");
				break;

			case 4:
				System.out.println("The elements in the list are : "+c);
				break;
			}
			System.out.println("Do you want to continue(y/n)?");
			ch1=s.next();
		}while(ch1.equalsIgnoreCase("y"));
	}
}
