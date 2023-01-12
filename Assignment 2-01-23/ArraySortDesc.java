package arrayexample;
public class ArraySortDesc 
{
	public static void main(String[] args) 
	{
		int b[] = {45,77,98,32,21};
		int temp =0;
		System.out.println("Original array:");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<b.length;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i]<b[j])
				{
					temp =b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		System.out.println("Sorted array:(descending order)");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}
}
