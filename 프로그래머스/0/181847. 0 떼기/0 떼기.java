class Solution {
    public String solution(String n_str) {
        String answer = detachZero(n_str);
        return answer;
    }
    
    public String detachZero(String n_str){
        String temp = n_str;
        int index = 0;
        String[] arr = n_str.split("");
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals("0")){
                index ++;
            }
            else{
                break;
            }
        }
        
        
        return n_str.substring(index);
    }
}