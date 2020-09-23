package Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Day02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] result = solution(new int[] {2,1,3,4,1});
		
		for(int a : result)
		{
			System.out.println(a);
		}
	}

	/*
	 * summary : 두 개 뽑아서 더하기 
	 * date : 2020-09-23
	 * -- 커밋테스트
	 */
	public static int[] solution(int[] numbers) {
		Set<Integer> set = new HashSet();
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				set.add(numbers[i] + numbers[j]);
			}
		}
		
		int[] answer = new int[set.size()];
		
		int size = 0;
		for(Integer val : set)
		{
			answer[size++] = val;
		}
		
		Arrays.sort(answer);
		
		return answer;
	}
}