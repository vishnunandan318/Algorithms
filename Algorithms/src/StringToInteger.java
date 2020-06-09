
public class StringToInteger {

	public int number(char ch) {
		// 0--48, 1--49,    9--57
		
		return ch%48;
	}
	
	public int number(String str) {
		
		int num=0;
		for(int i=0; i<str.length(); i++){
			num = num*10 + number(str.charAt(i));
		}
		return num;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringToInteger obj = new StringToInteger();
		
		String haha = "45556543";
		int answer = obj.number(haha);
		
		System.out.println(answer);
		
		
		char emo = 54;
		
		System.out.println(emo);
	}

}
