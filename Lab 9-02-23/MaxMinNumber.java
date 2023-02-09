public class MaxMinNumber 
{
	public static void main(String args[])
	{
        Scanner input = new Scanner(System.in);
        System.out.print("\n Enter Size of Array: ");
        int n = input.nextInt();
        int i, sum = 0;
        int arr[] = new int[n]; 

        for (i = 0; i < n; i++) 
        { 
            System.out.print("\n Enter Number: ");
            arr[i] = input.nextInt();
        }

        int max_element = arr[0], min_element = arr[0]; //Initializing with first element.

        for (i = 0; i < n; i++)
        {
            if (arr[i] > max_element) 
            { //Checking Maximum element
                max_element = arr[i];
            }

            if (arr[i] < min_element) 
            { //Checking Minimum element
                min_element = arr[i];
            }
        }
        System.out.println("\n Maximum Number: " + max_element);
        System.out.println("\n Minimum Number: " + min_element);
    }
}
