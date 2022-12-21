package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Singo {
	
   /*	
    각 유저는 한 번에 한 명의 유저를 신고할 수 있습니다.
	신고 횟수에 제한은 없습니다. 서로 다른 유저를 계속해서 신고할 수 있습니다.
	한 유저를 여러 번 신고할 수도 있지만, 동일한 유저에 대한 신고 횟수는 1회로 처리됩니다.
	k번 이상 신고된 유저는 게시판 이용이 정지되며, 해당 유저를 신고한 모든 유저에게 정지 사실을 메일로 발송합니다.
	유저가 신고한 모든 내용을 취합하여 마지막에 한꺼번에 게시판 이용 정지를 시키면서 정지 메일을 발송합니다.
	다음은 전체 유저 목록이 ["muzi", "frodo", "apeach", "neo"]이고, k = 2(즉, 2번 이상 신고당하면 이용 정지)인 경우의 예시입니다.
    
    유 ID       신고한ID      설명   
    "muzi"		"frodo"		"muzi"가 "frodo"를 신고했습니다.
	"apeach"	"frodo"		"apeach"가 "frodo"를 신고했습니다.
	"frodo"		"neo"		"frodo"가 "neo"를 신고했습니다.
	"muzi"		"neo"		"muzi"가 "neo"를 신고했습니다.
	"apeach"	"muzi"		"apeach"가 "muzi"를 신고했습니다.
	
	
	
	
	
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
		// A : 1, B : 1, C : 2(정지메일발송)
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


