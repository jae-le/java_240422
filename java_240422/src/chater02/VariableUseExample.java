package chater02;

public class VariableUseExample {
		public static void main(String[] args) {
			int hour = 3;
			int minute = 5;
//			System.out.println(hour+minute);
//			+ 할때 문자열이 하나라도 있으면 전체는 문자열이 된다.
			System.out.println(hour+"시간 "+minute+"분");
			
			int totalMinute = hour*60 + minute;
//			System.out.println(totalMinute);
			System.out.println("총 시간은 " + totalMinute + "분 입니다.");
		}
}
