import java.util.Scanner;
class BasicArray2{
        public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
                int[] arr1 =  new int[10];
		System.out.println("Enter 10 elements:");
		for(int i = 0;i<10;i++){
			arr1[i] = sc.nextInt();
		}
                System.out.println("Array:");
                for(int i = 0 ; i <arr1.length; i++){
			if(arr1[i]%2==0){

                        System.out.print(arr1[i] + " ");
                break;
			}
        }
}
}
