package javaTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringToArrayList {
	public static void main(String[] args) {
		String firstStr = "안녕하세요";
		String secondStr = "코박살입니다";
		new StringToArrayList().StringToArray(firstStr, secondStr);
	}
	public void StringToArray(String firstStr, String secondStr) {
		ArrayList<Character> strList = new ArrayList<Character>();

		// 문자열을 한글자씩 얻기
		for(char StringToChar : firstStr.toCharArray()) {
			strList.add(StringToChar);
		}
		for(char StringToChar : secondStr.toCharArray()) {
			strList.add(StringToChar);
		}
		System.out.println(strList.get(5));
		
		// 문자열 형식을 문자열로 바꾸기
		ArrayList<String> StringToArrayList = new ArrayList<String>();
		StringToArrayList.add(firstStr);
		StringToArrayList.add(secondStr);
		System.out.println(StringToArrayList);
		
		// charAt
		ArrayList<Character> reverseStr = new ArrayList<Character>();
		for(int i = firstStr.length()-1; i >= 0 ; i--) {
			reverseStr.add(firstStr.charAt(i));
		}
		System.out.println(reverseStr);
		
		// Arrays.asList()
        // ArrayList<String> reverseStr = new ArrayList<String>(Arrays.asList(firstStr));
		
	}
}
