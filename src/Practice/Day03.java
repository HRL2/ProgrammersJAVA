package Practice;

public class Day03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = solution("01033334444");
	}
	
	/*
	 * summary : 시저 암호 ( 테스트 케이스 통과 x )
	 * date : 2020-09-24 
	 * fault : 소문자 + 25 입력 시, 대문자로 변경됨
	 */
	public static String solution(String s, int n) {
		
		StringBuilder sb = new StringBuilder();
		
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch != ' ')
			{
				int ascii = (int)ch + n;
				
				if(ascii >= 90 && ascii < 97) ascii = 65 + (n - 1);
				else if(ascii > 122) ascii = 97 + (n - 1);
				
				sb.append((char)ascii);
			}
			else
			{
				sb.append(ch);
			}
		}

		return sb.toString();
	}
	
	/*
	 * summary : 핸드폰 번호 가리기
	 * date : 2020-09-24
	 */
	public static String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();
        
        int len = phone_number.length();
        String back = phone_number.substring(len - 4, len);
        
        for(int i = 0; i < len - 4; i++)
        {
        	sb.append("*");
        }
        
        sb.append(back);
        
        return sb.toString();
    }

}
