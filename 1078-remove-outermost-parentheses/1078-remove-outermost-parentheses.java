class Solution {
    public String removeOuterParentheses(String s) {
       StringBuilder str = new StringBuilder();
       int balance=0;
       for(int i=0;i<s.length();i++){
        char ch= s.charAt(i);
        if(ch=='('){
            balance++;
            if(balance>1){
            str.append("(");
        }
        }
        
        if(ch==')'){
            balance--;
            if(balance!=0){
                str.append(")");
            }
        }

       } 
       return str.toString();
    }
}