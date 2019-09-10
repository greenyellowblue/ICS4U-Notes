
public class a {
	public static void main(String[]args){
		System.out.println(count1(314261) == 4);
		System.out.println(count1(119121) == 3);
		System.out.println(count1(919191) == 0);
		System.out.println(count1(551431) == 5);
	}
	public static int count1(int i){
		String s = String.valueOf(i);
		if (s.equals("0") || s.length() < 1){
			return 0;
		}
		else if ((s.length() >= 2 && s.charAt(1) == 1) && (s.charAt(0) ==9 || s.charAt(0) == 5 || s.charAt(0) == 3)){
			if (s.charAt(0) ==9){
				return count1(Integer.valueOf(s.substring(2, s.length())));
			} else if (s.charAt(0)==5){
				return count1(Integer.valueOf(s.substring(2, s.length()))) + 2;
			}
			else{
				return count1(Integer.valueOf(s.substring(2,s.length()))) + 3;
			}
		}
		else if (s.charAt(0)==1){
			return count1(Integer.valueOf(s.substring(1,s.length()))) + 1;
		}
		else {
			return count1(0);
		}
	}
}
