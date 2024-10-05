class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        int length = my_string.length();
        String str = "";
        for(int i = 0 ; i < length ; i++){
                str = my_string.substring(i, length);
                if(str.equals(is_suffix)){
                    answer = 1; 
                    break;
                }
                                   
                       
            
        }
        
       
        return answer;
    }
}