package java_240422;

public class Hello {
	public static void main(String[] args){	
		System.out.println("안녕");
		
		String message ="새해";
		message= message + " 24년";
		System.out.println(message);	
		
		int num = 56;
		int popNum;
		String Stop = " 안돼";
		popNum= num + 24;
		System.out.println(popNum + " +" + Stop);
		
		String add = popNum + Stop;
		System.out.println(add);
	}	
}