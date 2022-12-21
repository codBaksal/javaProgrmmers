package level1;

import java.util.HashMap;

// 숫자의 일부 자릿수를 영단어로 바꾸는 예시입니다.
// 1478 → "one4seveneight"
// 234567 → "23four5six7"
// 10203 → "1zerotwozero3"
// 이렇게 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열 s가 매개변수로 주어집니다. s가 의미하는 원래 숫자를 return 하도록 solution 함수를 완성해주세요.

// 입출력 예 =============================================================================
// "one4seveneight"		1478

// "23four5six7"		234567

// "2three45sixseven"	234567
// "three"는 3, "six"는 6, "seven"은 7에 대응되기 때문에 정답은 입출력 예 #2와 같은 234567이 됩니다.
// 입출력 예 #2와 #3과 같이 같은 정답을 가리키는 문자열이 여러 가지가 나올 수 있습니다.

// "123"				123
// s에 영단어로 바뀐 부분 없다
// =============================================================================

// 정확성테스트 10초

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

