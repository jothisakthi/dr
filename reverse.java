package assign;

public class Reverse {

	    public static void main(String[] args) {
	        String str = "Hammer";
	        String revStr = "";

	        for(int i=0; i<=str.length()-1;i++){
	            if(revStr.indexOf(str.charAt(i))==-1){
	                revStr = str.charAt(i)+revStr;
	            }
	        }
	        System.out.println(revStr);
	    }
	}