/*
if 的第二种格式与三目运算符的异同
*/
class ControlTest1{
	    public static void main(String[] args){
	    	int a=39;
	    	int b=89;
	    	int max;
	    	if(a>b){
	    		max=a;
	    	}else{
	    		max=b;
	    	}
	    	System.out.println("max:"+max);
	    	//int max=(a>b)?(a):(b);
	    	//System.out.println("max:"+max);

	    }
}