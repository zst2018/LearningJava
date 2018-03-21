/*

根据返回值
 			有明确返回值方法
 			返回void类型的方法
 		根据形式参数
 			无参数方法
 			带参数方法

*/
class New{
	private int age;
	public void show(){
		System.out.println("show");

	}
	public String show1(){
			return "nihao";
		}
	public void show(int age){
		this.age=age;

	}
	//字符串拼接
	public String show(String a,String b){
		return a+b;
	}


}
class New1{
	public static void main(String[] args){
		New n=new New();
		n.show();
		n.show(90);
		String m=n.show1();
		System.out.println(m);
		String x=n.show("nihjaoj","huyrte");
		System.out.println(x);
	}
} 