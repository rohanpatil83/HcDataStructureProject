package dataStructures;

public class MyArray {
	
	
        int capacity=5;	
		int []arr =new int[capacity];
		int temp;
		
				
	    public void insertAt(int index,int data)
	    { if(index<capacity && index>=0)
	    {
	    	arr[index]=data;
	    }else
	    {
	    	temp=index;
	    	expand();
	    	arr[index]=data;	
	    }
	    }
		private void expand() {
			int tarr[]=new int[temp+1];
			for(int i=0;i<arr.length;i++)
			{
				tarr[i]=arr[i];
			}
			arr=tarr;
			capacity=temp+1;
		}



		public void deleteAtIndex(int index)
		{  if(index<capacity)
		       { for (int i=index;i<arr.length-1;i++)
		         {
		    	arr[i]=arr[i+1];
		         }
		          shrink();
		       }else
		       {
		    	System.out.println("index should be less than capacity"+" "+capacity);   
		       }
		}
		
		private void shrink() {
			 
			int tempArr[]=new int [capacity-1];
			
			for (int i=0;i<arr.length-1;i++)
					{
				      tempArr[i]=arr[i];
					}
			arr=tempArr;
         	capacity--;   
		}

		public void getSize()
		{
			System.out.println("size of array="+" "+arr.length);
		}


		public void show()
		{
			for(int i:arr)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		public void elePrsentOrNot(int data) 
		{      int count=0;
			for(int i=0;i<arr.length;i++)
			{ 
				if(arr[i]==data)
				{
					count++;
					System.out.print("at"+" "+"index"+" "+i+"/");
				}
			}
			if(count!=0)
			{
				System.out.println(" "+"element is present");
			}else {
			 System.out.println("element is not present");
			}
		}
			
		public void eleAtIndex(int index)
		{
			int data = 0;
			int count=0;
			for(int i=0;i<arr.length;i++)
			if(i==index)
			{  
				data=arr[index];
				count++;
				System.out.println(data);
			}
			if(count==0)
			{
				System.out.println("index sholde be less than  "+capacity);
			}
		//	return data;
			
			
			
		}
			
}
