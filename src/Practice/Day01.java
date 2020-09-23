package Practice;

public class Day01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(DivisorSum(12));
	}
	
	/*
	 * summary : ����� ��
	 * date : 2020-09-20
	 */
	public static int DivisorSum(int n) {
        int answer = 0;
        
        for(int i = 1; i <= n; i++) {
        	if(n % i == 0)
        	{
        		answer += i;
        	}
        }
        
        return answer;
    }
	
	/*
	 * summary : �ڸ��� ���ϱ�
	 * date : 2020-09-20
	 */
	public static int DigitNumberSum(int n) {
		int answer = 0;
		
		String temp = Integer.toString(n);
		
		for(int i = 0; i < temp.length(); i++)
		{
			answer += Character.getNumericValue(temp.charAt(i));
		}
		
		return answer;
	}

}
