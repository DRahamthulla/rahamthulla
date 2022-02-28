package JavaArrays;

public class TestArray{

	public static void main(String[] args) {
		// One-Dimensional Arrays: 
		int[] a=new int[6];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		a[5]=6;
		for (int i=0;i<a.length;i++)
		{
          System.out.println(a[i]);
		}
		
		// 2  Dimensional array
		int arr[][] = { {2,7,9},{3,6,1},{7,4,2} };
		 
        for (int i=0; i< 3 ; i++)
        {
            for (int j=0; j < 3 ; j++)
                System.out.print(arr[i][j] + " ");
 
            System.out.println();
        }
	}

}
