package level1;

import java.util.ArrayList;
import java.util.List;

/*
1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.(전체를 비교)
5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
     만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.(전체를 가지고 비교)
7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.(전체를 가지고 비교)
*/

public class IdRecommend {
	public static void main(String[] args) {
//		String new_id = "...!@BaT#*..y.abcdefghijklm-.";
		String new_id = "=.=";
		String result = new IdRecommend().solution(new_id);
		System.out.println(result);
	}
	
	public String solution(String new_id) {
		int new_id_size = new_id.length();
		// 1단계
		// 문자열내 대문자를 모두 소문자로 치환
		new_id = new_id.toLowerCase();
//		System.out.println("1단계 : " + new_id);
		
		// 2단계
		// []안에 들어있는 문자를 제외하고 삭제
		new_id = new_id.replaceAll("[^\\w\\-_.]*", "");
//		System.out.println("2단계 : " + new_id);
		
		// 3단계
		// .이 2개 이상이면 .로 바꿔라
		new_id = new_id.replaceAll("\\.{2,}", ".");
//		System.out.println("3단계 : " + new_id);
		
		// 4단계
		new_id = new_id.replaceAll("^[.]|[.]$", "");
//		System.out.println("4단계 : " + new_id);
		
		// 5단계
		if(new_id.length() == 0) {
			new_id = new_id + "a";
		}
//		System.out.println("5단계 : " + new_id);
		
		// 6단계
		if(new_id.length() >= 16) {
			new_id = new_id.substring(0, 15);
		}
		new_id = new_id.replaceAll("[.]$", "");
//		System.out.println("6단계 : " + new_id);
		
		// 7단계
		if(new_id.length() <= 2) {
			int lastTextNum = new_id.length() -1;
			String lastText = new_id.substring(lastTextNum);
			for(int i = lastTextNum + 1; i < 3; i++) {
				new_id = new_id + lastText;
				if(new_id.length() == 4) return new_id;
			}
		}
//		System.out.println("7단계 : " + new_id);
		
		
		String answer = new_id;
		return answer;
	}
}
