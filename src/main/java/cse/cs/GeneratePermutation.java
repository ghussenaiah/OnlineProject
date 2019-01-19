package ExcelTest;

public class GeneratePermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 char a[]= {'A','B','C','D'};
		    int n = a.length;
		    permute(a, 0, n-1);
		  
	}
	
	 
	/* Function to print permutations of string
	   This function takes three parameters:
	   1. String
	   2. Starting index of the string
	   3. Ending index of the string. */
	public static void permute(char a[], int l, int r)
	{
	   int i;
	   if (l == r)
	     System.out.println(a);
	   else
	   {
	       for (i = l; i <= r; i++)
	    	   
	       {
	    	   char t;
	    	   t=(char) a[l];
	    	   a[l]=a[i];
	    	   a[i]=t;
	          //swap(a[l], a[i]);
	          permute(a, l+1, r);
	          //swap(a[l], a[i]); //backtrack
	          
	    	   t=(char) a[l];
	    	   a[l]=a[i];
	    	   a[i]=t;
	       }
	   }
	}
	 
	

}
