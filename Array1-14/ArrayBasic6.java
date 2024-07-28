import java.io.*;
class BasicArray6{
	public static void main(String [] args)throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the length of the character array:");
		int length = Integer.parseInt(reader.readLine());

		char[] arr = new char[length];
		System.out.println("Enter the characters: ");

		for(int i = 0;i<length;i++){
			arr[i] = (char) reader.read();
			reader.readLine();
		}
		System.out.println("The characters you entered:");
	for(char c : arr){
		System.out.print( c + " ");
	}
	}
}

