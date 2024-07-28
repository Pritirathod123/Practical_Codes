import java.util.Scanner;
class ArrayAvg6{
             public static void main(String[] args) {
		     
              Scanner sc = new Scanner(System.in);
                 System.out.println("Enter the Characters:");
                 int  size = sc.nextInt();
		 
		 System.out.println("Enter the elements");
		 char[] array = new char[size];
		 for(int i = 0; i<size;i++){
			array[i] = sc.next().charAt(0);
		 }
		 int vowelCount = 0;
                 int consonantCount = 0;
		 for(char c : array){
			 if(Character.isLetter(c)){
				 c = Character.toLowerCase(c);
		 
		 if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){

              // System.out.println(" Count of vowels : ");
              vowelCount++;
               }
	       else{

	       consonantCount++;
	       }
		 }
		 }
		 System.out.println("Count of vowels: " + vowelCount);
		 System.out.println("Count of consonants: " + consonantCount);
      }
}

