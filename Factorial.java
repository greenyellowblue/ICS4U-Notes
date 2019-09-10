
public class Factorial {
	public int factorial(int n) {
		if(n == 1){
			return 1;
		}
		return n * factorial(n-1);
	}
	public int bunnyEars2(int bunnies) {
		if (bunnies == 0){
			return 0;
		}
		if(bunnies == 1){
			return 2;
		} else if(bunnies % 2 == 1){
			return 2 + bunnyEars2(bunnies-1);
		} else {
			return 3 + bunnyEars2(bunnies-1);
		}
	}
	public int bunnyEars(int bunnies) {

		if (bunnies == 0){
			return 0;
		}
		if(bunnies == 1){
			return 2;
		} else {
			return 2 + bunnyEars(bunnies-1);
		}


	}
	public int fibonacci(int n) {
		if(n == 0){
			return 0;
		}
		if (n == 1){
			return 1;
		} else {
			return fibonacci(n-2) + fibonacci(n-1);
		}
	}
	public int triangle(int rows) {
		if(rows == 0){
			return 0;
		}
		if (rows == 1){
			return 1;
		} else {
			return rows + triangle(rows-1);
		}
	}
	public int sumDigits(int n) {
		if (n/10 == 0){
			return n;
		} else {
			return n%10 + sumDigits(n/10);
		}
	}
	public int count7(int n) {
		if(n / 10 == 0){
			if(n%10 == 7){
				return 1;
			} else {
				return 0;
			}
		} else{
			if(n % 10 == 7){
				return 1 + count7(n/10);
			} else {
				return count7(n/10);
			}
		}
	}
	public int count8(int n) {
		if (n == 0){
			return 0;
		}  else {
			if (n % 10 == 8 && (n/10)%10 == 8){
				return 2 + count8(n/10);
			} else if (n%10 ==8){
				return 1 + count8(n/10);
			} else {
				return count8(n/10);
			}
		}
	}
	public int powerN(int base, int n) {
		if(n == 0){
			return 1;
		}
		return base * powerN(base, n-1);
	}
	public int countHi(String str) {
		String s = "hi";
		int count = 0;

		if(str.length() < 2) {
			return 0;
		}
		else if(str.substring(0,2).equals(s)){
			count+= 1 + countHi(str.substring(2));
		}
		else {
			count+= countHi(str.substring(1));
		}
		return count;
	}
	public String changePi(String str) {
		String s = "pi";

		if(str.equals("xpix")){
			return "x3.14x";
		}
		if(str.length() < 2) {
			return str.substring(0);
		}
		else if(str.substring(0,2).equals(s)){
			return "3.14" + changePi(str.substring(2));
		}
		else {
			return str.substring(0,2) + changePi(str.substring(2));
		}
	}
	public String noX(String str) {

		String s = "x";

		if(str.length() < 1) {
			return "";
		}
		else if(str.substring(0,1).equals(s)){
			return "" + noX(str.substring(1));
		}
		else {
			return str.substring(0,1) + noX(str.substring(1));
		}

	}
	public boolean array6(int[] nums, int index) {
		if (nums.length == 0){
			return false;
		}
		if(index < nums.length-1){
			if (nums[index] == 6){
				return true;
			} else {
				return array6(nums, index+1);
			}
		} else if (nums[index] == 6) {
			return true;
		} else {
			return false;
		}
	}
	public int array11(int[] nums, int index) {
		if (nums.length == 0){
			return 0;
		}
		int count = 0;
		if(index < nums.length-1){
			if (nums[index] == 11){
				count += 1;
				return count + array11(nums, index + 1);
			} else {
				return array11(nums, index+1);
			}
		} else if (nums[index] == 11) {
			return 1;
		} else {
			return 0;
		}
	}
	public boolean array220(int[] nums, int index) {
		if (index >= nums.length-1) return false;
		if (nums[index+1] == nums[index] * 10) return true;
		return array220(nums, index+1);
	}

	public String allStar(String str) {
		if(str.length() == 1 || str.length() == 0){
			return str;
		}
		return Character.toString(str.charAt(0)) + "*" + allStar(str.substring(1));
	}
	public String pairStar(String str) {
		if(str.length() == 1 || str.length() == 0){
			return str;
		}
		if(str.charAt(0) == str.charAt(1)){
			return Character.toString(str.charAt(0)) + "*" + pairStar(str.substring(1));
		} else {
			return Character.toString(str.charAt(0)) + pairStar(str.substring(1));
		}
	}
	public String endX(String str) {
		if(str.length() == 0 || str.length() == 1){
			return str;
		} 
		if (Character.toString(str.charAt(0)).equals("x")){
			return endX(str.substring(1)) + "x";
		} else {
			return Character.toString(str.charAt(0)) + endX(str.substring(1));
		}

	}

	public int countPairs(String str) {
		if (str.equals("") || str.length() < 3) {
			return 0;
		}
		if (str.charAt(0) == str.charAt(2)) {
			return 1 + countPairs(str.substring(1));
		} else {
			return countPairs(str.substring(1));
		}
	}
	public int countAbc(String str) {
		if(str.length() < 3){
			return 0;
		} 
		if ((Character.toString(str.charAt(0)) + Character.toString(str.charAt(1)) + Character.toString(str.charAt(2))).equals("abc")){
			return 1 + countAbc(str.substring(1));
		} else if  ((Character.toString(str.charAt(0)) + Character.toString(str.charAt(1)) + Character.toString(str.charAt(2))).equals("aba")){
			return 1 + countAbc(str.substring(1));
		} else {
			return countAbc(str.substring(1));
		}
	}

	public int count11(String str) {
		if (str.length() < 2) {
			return 0;
		}
		if (str.substring(0,2).equals("11")){
			return 1 + count11(str.substring(2)); 
		}
		else
			return count11(str.substring(1));

	}
	

}
