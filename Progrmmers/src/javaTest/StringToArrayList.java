package javaTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringToArrayList {
	public static void main(String[] args) {
		String firstStr = "�ȳ��ϼ���";
		String secondStr = "�ڹڻ��Դϴ�";
		new StringToArrayList().StringToArray(firstStr, secondStr);
	}
	public void StringToArray(String firstStr, String secondStr) {
		ArrayList<Character> strList = new ArrayList<Character>();

		// ���ڿ��� �ѱ��ھ� ���
		for(char StringToChar : firstStr.toCharArray()) {
			strList.add(StringToChar);
		}
		for(char StringToChar : secondStr.toCharArray()) {
			strList.add(StringToChar);
		}
		System.out.println(strList.get(5));
		
		// ���ڿ� ������ ���ڿ��� �ٲٱ�
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
