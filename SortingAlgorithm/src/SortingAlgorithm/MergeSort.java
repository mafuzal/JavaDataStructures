package SortingAlgorithm;

public class MergeSort {
	int[] array;
	int[] TempArray;
	 void PrepareForSort(int [] arr) {
		 this.array = arr;
		 this.TempArray = new int[arr.length];
		 doMergeSort(0,arr.length-1);
		 
	 }
	 void doMergeSort(int LowerIndex,int HigherIndex) {
		 if(LowerIndex<HigherIndex) {
			 int middle = LowerIndex + (HigherIndex-LowerIndex)/2;
			 doMergeSort(LowerIndex,middle);
			 doMergeSort(middle+1,HigherIndex);
			 MergePart(LowerIndex,middle,HigherIndex);
		 }
	 }
	 
	 void MergePart(int LowerIndex,int middle,int HigherIndex) {
		 for(int i=LowerIndex;i<=HigherIndex;i++)
			 TempArray[i] = array[i];
		 int i = LowerIndex;
		 int j = middle + 1;
		 int k = LowerIndex;
		 while(i<=middle && j<=HigherIndex){
			 if(TempArray[i] <= TempArray[j]) {
				 array[k] = TempArray[i];
				 i++;
			 }else {
				 array[k] = TempArray[j];
				 j++;
				 
			 }
			 k++;
		 }
		 
		 while(i<= middle) {
			 array[k] = TempArray[i];
			 k++;
			 i++;
		 }
	 }
	 
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int [] arr = {1,50,30,10,60,80};
			System.out.println("Before Sorting");
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+"\t");
				
			}
			new MergeSort().PrepareForSort(arr);
			System.out.println("\nAfter Sorting");
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+"\t");
				
			}
				
		}



}
