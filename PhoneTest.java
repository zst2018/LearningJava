/*
		


*/
class Phone{
	//private 修饰成员变量
	private String brand;
	private int price;
	private String color;
	//获取品牌方法，不需要传参，但是有明确的返回值
	public String getBrand(){
		return brand;
	}
	public int getPrice(){
		return price;
	}
	public String getColor(){
		return color;
	}
	//赋值 方法  不返回，但是有参数列表
	public void setBrand(String brand){
		this.brand=brand;
	}
	public void setPrice(int price){
		this.price=price;
	}
	public void setColor(String color){
		this.color=color;
	}
}
//测试  类
class PhoneTest{
	public static void main(String[] args){
		//创建一个对象
		Phone s1=new Phone();
		//通过方法访问成员变量
		System.out.println(s1.getBrand()+"    "+s1.getPrice()+"   "+s1.getColor());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		//通过方法，给成员变量赋值
		s1.setBrand("apple");
		s1.setPrice(8999);
		s1.setColor("white");

		System.out.println(s1.getBrand()+"    "+s1.getPrice()+"   "+s1.getColor());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		//创建第二个 对象
		Phone s2=new Phone();
		s2.setBrand("sumxing");
		s2.setPrice(5999);
		s2.setColor("red");
		System.out.println(s2.getBrand()+"    "+s2.getPrice()+"   "+s2.getColor());
	}
}