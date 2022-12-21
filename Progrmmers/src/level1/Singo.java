package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Singo {
	
   /*	
    �� ������ �� ���� �� ���� ������ �Ű��� �� �ֽ��ϴ�.
	�Ű� Ƚ���� ������ �����ϴ�. ���� �ٸ� ������ ����ؼ� �Ű��� �� �ֽ��ϴ�.
	�� ������ ���� �� �Ű��� ���� ������, ������ ������ ���� �Ű� Ƚ���� 1ȸ�� ó���˴ϴ�.
	k�� �̻� �Ű�� ������ �Խ��� �̿��� �����Ǹ�, �ش� ������ �Ű��� ��� �������� ���� ����� ���Ϸ� �߼��մϴ�.
	������ �Ű��� ��� ������ �����Ͽ� �������� �Ѳ����� �Խ��� �̿� ������ ��Ű�鼭 ���� ������ �߼��մϴ�.
	������ ��ü ���� ����� ["muzi", "frodo", "apeach", "neo"]�̰�, k = 2(��, 2�� �̻� �Ű���ϸ� �̿� ����)�� ����� �����Դϴ�.
    
    �� ID       �Ű���ID      ����   
    "muzi"		"frodo"		"muzi"�� "frodo"�� �Ű��߽��ϴ�.
	"apeach"	"frodo"		"apeach"�� "frodo"�� �Ű��߽��ϴ�.
	"frodo"		"neo"		"frodo"�� "neo"�� �Ű��߽��ϴ�.
	"muzi"		"neo"		"muzi"�� "neo"�� �Ű��߽��ϴ�.
	"apeach"	"muzi"		"apeach"�� "muzi"�� �Ű��߽��ϴ�.
	
	
	
	
	
	*/
	
	public static void main(String[] args) {
		Singo singoTest = new Singo();
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		// A -> B
		// A -> C
		// B -> C
		// B -> A
		// B -> A
		// A : 1, B : 1, C : 2(�������Ϲ߼�)
		int k = 2;
		
		int[] result = singoTest.solution(id_list, report, k);
		System.out.println(Arrays.toString(result));
	}
	
	public int[] solution(String[] id_list, String[] report, int k) {
		
        int[] answer = new int[id_list.length];
        HashMap<String, Integer> index = new HashMap<>();
        HashMap<String, List<Integer>> list = new HashMap<>();
		
        for(int i=0 ; i<id_list.length ; i++) {
			index.put(id_list[i], i);
		}
        
        for(String rep : report) {
        	String[] ids = rep.split(" ");
        	String fromId=ids[0], toId=ids[1];
        	if(!list.containsKey(toId)) {
        		list.put(toId, new ArrayList<>());
        	}
        	List<Integer> tmp = list.get(toId);
        	if(!tmp.contains(index.get(fromId))) {
        		tmp.add(index.get(fromId));
        	}
        }
        
        for(int i=0 ; i<id_list.length ; i++) {
        	String id = id_list[i];
        	if(list.containsKey(id) && list.get(id).size()>=k) {
	        	for(int idx : list.get(id)) {
	        		answer[idx]++;
	        	}
        	}
        }
        return answer;
	}
	
}


