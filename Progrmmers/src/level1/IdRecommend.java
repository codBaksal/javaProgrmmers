package level1;

import java.util.ArrayList;
import java.util.List;

/*
1�ܰ� new_id�� ��� �빮�ڸ� �����Ǵ� �ҹ��ڷ� ġȯ�մϴ�.
2�ܰ� new_id���� ���ĺ� �ҹ���, ����, ����(-), ����(_), ��ħǥ(.)�� ������ ��� ���ڸ� �����մϴ�.
3�ܰ� new_id���� ��ħǥ(.)�� 2�� �̻� ���ӵ� �κ��� �ϳ��� ��ħǥ(.)�� ġȯ�մϴ�.
4�ܰ� new_id���� ��ħǥ(.)�� ó���̳� ���� ��ġ�Ѵٸ� �����մϴ�.(��ü�� ��)
5�ܰ� new_id�� �� ���ڿ��̶��, new_id�� "a"�� �����մϴ�.
6�ܰ� new_id�� ���̰� 16�� �̻��̸�, new_id�� ù 15���� ���ڸ� ������ ������ ���ڵ��� ��� �����մϴ�.
     ���� ���� �� ��ħǥ(.)�� new_id�� ���� ��ġ�Ѵٸ� ���� ��ġ�� ��ħǥ(.) ���ڸ� �����մϴ�.(��ü�� ������ ��)
7�ܰ� new_id�� ���̰� 2�� ���϶��, new_id�� ������ ���ڸ� new_id�� ���̰� 3�� �� ������ �ݺ��ؼ� ���� ���Դϴ�.(��ü�� ������ ��)
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
		// 1�ܰ�
		// ���ڿ��� �빮�ڸ� ��� �ҹ��ڷ� ġȯ
		new_id = new_id.toLowerCase();
//		System.out.println("1�ܰ� : " + new_id);
		
		// 2�ܰ�
		// []�ȿ� ����ִ� ���ڸ� �����ϰ� ����
		new_id = new_id.replaceAll("[^\\w\\-_.]*", "");
//		System.out.println("2�ܰ� : " + new_id);
		
		// 3�ܰ�
		// .�� 2�� �̻��̸� .�� �ٲ��
		new_id = new_id.replaceAll("\\.{2,}", ".");
//		System.out.println("3�ܰ� : " + new_id);
		
		// 4�ܰ�
		new_id = new_id.replaceAll("^[.]|[.]$", "");
//		System.out.println("4�ܰ� : " + new_id);
		
		// 5�ܰ�
		if(new_id.length() == 0) {
			new_id = new_id + "a";
		}
//		System.out.println("5�ܰ� : " + new_id);
		
		// 6�ܰ�
		if(new_id.length() >= 16) {
			new_id = new_id.substring(0, 15);
		}
		new_id = new_id.replaceAll("[.]$", "");
//		System.out.println("6�ܰ� : " + new_id);
		
		// 7�ܰ�
		if(new_id.length() <= 2) {
			int lastTextNum = new_id.length() -1;
			String lastText = new_id.substring(lastTextNum);
			for(int i = lastTextNum + 1; i < 3; i++) {
				new_id = new_id + lastText;
				if(new_id.length() == 4) return new_id;
			}
		}
//		System.out.println("7�ܰ� : " + new_id);
		
		
		String answer = new_id;
		return answer;
	}
}
