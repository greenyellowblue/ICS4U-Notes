
public class RecursionTest {
	public static void main(String[]args){
		System.out.println(count1(9));
	}
	public static void hailstone(int i){
		if ( i == 1){
			System.out.println(1);
		} else if (i%2 == 1){
			System.out.println(i);
			hailstone(i*3+1);
		} else {
			System.out.println(i);
			hailstone(i/2);
		}
	}
	public static int count1(int i){
		if(i / 10 == 0){
			if(i == 1){
				
				return 1;
			} else {
				
				return 0;
			}
		}	else if (i%10 == 1 && i %100/10 == 9){
			return count1(i/10);
		}	else if (i%10 == 1 && i%100/10 == 5){
			return  2 + count1(i/10);
		}	else if (i%10 == 1 && i%100/10 == 3){
			return  3 + count1(i/10);
		}	else if (i%10 == 1){
			return  1 + count1(i/10);
		}	else {
			return count1(i/10);
		}
		
	}
}
