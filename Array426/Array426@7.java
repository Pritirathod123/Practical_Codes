import java.util.Scanner;
class ArrayAvg7{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the no of size:");
                int size = sc.nextInt();
                System.out.println("Enter the elements");
                char[] arr = new char[size];
                for(int i = 0; i<size;i++){
                        arr[i] = sc.next().charAt(0);
                }
		for(int i = 0; i<size; i++){
			if(Character.isLowerCase(arr[i])){
				arr[i] = Character.toUpperCase(arr[i]);
			}
		}
		System.out.println("Output");
		for(char c : arr){
			System.out.print(c + " ");
		}
	}
}
