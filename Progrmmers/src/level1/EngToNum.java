package level1;

import java.util.HashMap;

// ������ �Ϻ� �ڸ����� ���ܾ�� �ٲٴ� �����Դϴ�.
// 1478 �� "one4seveneight"
// 234567 �� "23four5six7"
// 10203 �� "1zerotwozero3"
// �̷��� ������ �Ϻ� �ڸ����� ���ܾ�� �ٲ�����ų�, Ȥ�� �ٲ��� �ʰ� �״���� ���ڿ� s�� �Ű������� �־����ϴ�. s�� �ǹ��ϴ� ���� ���ڸ� return �ϵ��� solution �Լ��� �ϼ����ּ���.

// ����� �� =============================================================================
// "one4seveneight"		1478

// "23four5six7"		234567

// "2three45sixseven"	234567
// "three"�� 3, "six"�� 6, "seven"�� 7�� �����Ǳ� ������ ������ ����� �� #2�� ���� 234567�� �˴ϴ�.
// ����� �� #2�� #3�� ���� ���� ������ ����Ű�� ���ڿ��� ���� ������ ���� �� �ֽ��ϴ�.

// "123"				123
// s�� ���ܾ�� �ٲ� �κ� ����
// =============================================================================

// ��Ȯ���׽�Ʈ 10��

public class EngToNum {
	public static void main(String[] args) {
		String s = "123";
		int result = new EngToNum().solution(s);
		System.out.println(result);
	}
	
	public int solution(String s) {
		HashMap<String, String> givenList = new HashMap<String, String>();
		givenList.put("zero", "0");
		givenList.put("one", "1");
		givenList.put("two", "2");
		givenList.put("three", "3");
		givenList.put("four", "4");
		givenList.put("five", "5");
		givenList.put("six", "6");
		givenList.put("seven", "7");
		givenList.put("eight", "8");
		givenList.put("nine", "9");
		
		for(String check : givenList.keySet()) {
			if(s.contains(check)) {
				String changeWord = givenList.get(check);
				s = s.replace(check, changeWord);
			} 
		}
		
		int answer = Integer.parseInt(s);
		return answer;
	}
}

