package coding;

import java.util.ArrayList;
import java.util.List;

public class test {
	public static void main(String[] args) {
		String[][] S = {{"ChetanBhagat","TwoStates","chgfjf"},{"b2","gfjhm","jgfthdf"}};
		
	
	 List<String> st = new ArrayList<>();
     // Write your code here
	 int count =1;
     for(int i=0;i<S.length;i++){
    	  int ascii = 65;
    	 
         for(int j=0;j<S[i].length;j++){
           
             if(j==0){
             st.add(count+". "+ S[i][j]);
             count++;}
             else{
                 char ch = (char)ascii;
                 ascii++;
                 st.add(ch+". "+ S[i][j]);
             }
         }
     }
     String [] ans = st.toArray(new String[0]);
     System.out.println(st);
	}
	
}
