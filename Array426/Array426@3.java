import java.util.Scanner;

class ArrayAvg3 {
    public static void main(String[] args) {
	    int n ,max;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        n = sc.nextInt();
	int arr[] = new int[n];
	System.out.println("Enter the array elements:");
	for(int i = 0; i<n; i++){
		arr[i] = sc.nextInt();
	}
		for(int i = 0; i<n;i++){
			for(int j = i+1;j<n;j++){
				if(arr[i]>arr[j]){
					max = arr[i];
					arr[i] = arr[j];
					arr[j]=max;
				}
			}
		}
		System.out.println("Second Largest Element array : " +arr[n-2]);
	}
    }

