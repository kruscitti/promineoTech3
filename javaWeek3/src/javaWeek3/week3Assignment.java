package javaWeek3;

public class week3Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// Question #1 - Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		
		int[] ages = new int[9];
		
		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
		ages[8] = 17;
		
//Question #1a - Programmatically subtract the value of the first element in the array from the value in the last element of the array. Print the result to the console.
	
	//see below	
	
//Question #1b - Add a new age to your array and repeat the step above to ensure it is dynamic 
		System.out.println(ages[ages.length-1] -  ages[0]);
	
//Question #1c - Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		int sum = 0;
		for (int i = 0; i < ages.length; i ++) {
		sum = sum + ages[i];	
		}
		System.out.println(sum / ages.length);
		


//Question #2 - Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
 		
		String[] names = new String[6];
		
		names[0]= "Sam";
		names[1]= "Tommy";
		names[2]= "Tim";
		names[3]= "Sally";
		names[4]= "Buck";
		names[5]= "Bob";
	
/*
 * Question 2a - Use a loop to iterate through the array and calculate the average number of letters per name. 
 * Print the result to the console.	
 */
		int chars = 0;
			for (int i = 0; i < names.length; i++) {
					chars += names[i].length();
				}System.out.println(chars / names.length);
		

				
				
/* 
 * Question 2b - b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, 
 * and print the result to the console.
 */		
		String string = "";
		for(int n = 0; n < names.length; n++) {
			string = names[n] + " " + string;
		}System.out.println(string);
	
									
				
/*
 * Question #5 - Create a new array of int called nameLengths. 
 * Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
 */			
		
		
		int[] nameLengths = new int[6];
			
		for (String name : names) {
		
		 int n = 0;
		
		nameLengths[n] = n + name.length();
		
		System.out.println("Name Length Test " + nameLengths[n]);
			
		}
		
							
//Question #6 - Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. 

		for(int m = 0; m < nameLengths.length; m++) {
		int amount = 0;
		amount = amount + nameLengths[m];
			
		}System.out.println(sum);
		
		
//This is testing Question #7
		System.out.println("multiplyWordTest " + multiplyWord("Hello" , 3));
	
//This is testing Question #8
		System.out.println("fullNameTest " + fullName("Jane", "Doe"));
		
//This is testing Question #9
		int[] numbers = new int[6];
		
		numbers[0] = 14;
		numbers[1] = 23;
		numbers[2] = 7;
		numbers[3] = 11;
		numbers[4] = 30;
		numbers[5] = 3;
		
		System.out.println("isGreaterThan100Test " + isGreaterThan100(numbers));
	 
//This is testing Question #10
		double[] values = new double[5];
	
			values[0] = 11.11;
			values[1] = 22.22;
			values[2] = 33.33;
			values[3] = 44.44;
			values[4] = 55.55;
		
		System.out.println("averageArrayTest " + averageArray(values));

//This is testing Question #11
		double[] nums = new double[5];
				
			nums[0] = 11;
			nums[1] = 21;
			nums[2] = 31;
			nums[3] = 41;
			nums[4] = 51;
		
		System.out.println("greaterThanArrayTest " + greaterThanArray(nums, values));
		
//This is testing Question #12
		System.out.println("willBuyDrinkTest " + willBuyDrink(false, 12.35));
			
				

//This is testing Question #13
		System.out.println(enoughCookies(12, 5));

	}		
		//END OF MAIN
	
	
	
/* Question #7 - Write a method that takes a String, word, and an int, n, as arguments and returns the 
 * word concatenated to itself n number of times. 
 */	
	public static String multiplyWord(String word , int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result = result + word;
		}
		return result;
	}
//Question #8 - Write a method that takes two Strings, firstName and lastName, and returns a full name 
	public static String fullName(String firstName, String lastName) {
		String fName = "";
		fName = (firstName + " " + lastName);
	
		return fName;
	}
// Question #9 - Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	public static boolean isGreaterThan100(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum = number + sum;
		}
		if (sum > 100) {
			return true;
		}else {
			return false;
		}
	}
	
// Question #10 -Write a method that takes an array of double and returns the average of all the elements in the array.	
		
	public static double averageArray(double[] values) {
		double add = 0;
		for (double value : values) {
			add = add + value;
		}
			return (add / values.length);
		}
// Question #11 - Write a method that takes two arrays of double and returns true if the average of the elements in the 
	//first array is greater than the average of the elements in the second array.
	
	public static boolean greaterThanArray(double[] array1 , double[] array2) {
			double a = 0;
			for (double arr1 : array1) {
				a = (a + arr1) / array1.length;
			}
			 double b = 0;
			 for (double arr2 : array2) {
				 b = (b + arr2) / array2.length;
			 }if (a > b) {
			return true;
		} else {
			return false;
		}
	}
// Question #12 - Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
	//and returns true if it is hot outside and if moneyInPocket is greater than 10.50.	
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside = true && moneyInPocket< 10.50) {
			return true;
		} else {
			return false;
		}
	}
/*
 *  Question #13 - Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
 *  
 *  Write a method that takes an int numberOfCookies and an int numberOfPeople and returns whether or not there is an equal number of 
 *  cookies for everyone.
 *  
 *  Variations of this could be important in an inventory situations and also to make sure no one is getting more cookies than me :p	
 */
		public static boolean enoughCookies(int numberOfCookies, int numberOfPeople) {
			if(numberOfCookies % numberOfPeople == 0 ) {
				return true;
			} else {
				return false;
			}
		
	}
		
}
		

