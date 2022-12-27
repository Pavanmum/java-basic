import java.util.Arrays;
public class sortascending
{
	public static void main(String []args)
	{
//FOR ASCENDING
		int[] array = new int [] {16,60,1,74,90};
		Arrays.sort(array);
		System.out.println("Element of array in ascending order:");
		for (int i=0; i<array.length;i++)
		{
			System.out.println(array[i]);
		}
//FOR DESCENDING
		int[] arrayd = new int [] {16,60,1,74,90};
		int temp=0;
		for(int j=0;j<arrayd.length;j++)
		{
			for (int k=j+1; k<arrayd.length;k++)
			{
				if (arrayd[j]<arrayd[k])
				{
					temp = arrayd[j];
					arrayd[j]=arrayd[k];
					arrayd[k]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("Elements of array in descending order:");
		for(int j=0;j<arrayd.length;j++)
		{ 
			System.out.println(arrayd[j]+" ");
		}
	}
}
