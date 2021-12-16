package ProgrammingKnowledge;




public class SelectionSort 
{
	

    /* Selection Sort function */

	public void sort(int arr[])
	{
		
	
	   int N = arr.length;
	
	   int i, pos, temp;
	   int j = 0;
	
	   for (i = 0; i < N; i++)
	   {
	
	       pos = j;
	
	       for (j = i+1; j < N-1; j++)
	
	       {
	
	           if (arr[j] < arr[pos])
	
	           {
	
	               pos = i;
	
	           }
	
	       }
	
	       /* Swap arr[i] and arr[pos] */
	
	       temp = arr[i];
	
	       arr[i] = arr[pos];
	
	       arr[pos]= temp;           
	
	   }       
	
	 }

}
/*public class SelectionSort {
    private int temp;

    public SelectionSort(){

    }

    public int[] basicSelectionSort(int[] x){
        for (int i=0;i<x.length; ++i){
            for(int j=i+1; j<x.length; ++j){
                if(x[i]>x[j]){
                    temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }
        return x;
    }
}*/

/*public class SelectionSort {



public static void sort( int arr[] ){

int N = arr.length;

int i, j, pos, temp;

for (i = 0; i < N; i++)

{

   pos = j;

   for (j = i+1; j < N-1; j++)

   {

       if (arr[j] < arr[pos])

       {

           pos = i;

       }

   }

   /* Swap arr[i] and arr[pos] 

   temp = arr[I];

   arr[i] = arr[pos];

   arr[pos]= temp;           

}       

}

}*/