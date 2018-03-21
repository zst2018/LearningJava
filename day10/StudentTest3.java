/*
连编程：
	每次调用方法完毕，返回的是一个对象，这样才能继续电影方法
*/
class Student{
	public void study(){
		System.out.println("haphaop xie ci ");
	}
}

class StudentDemo{
	public Student getstudent(){
		return new student();
	}
}
class StudentTest{
	public static void main(String[] args){
		StudentDemo sd=new StudentDemo();
		Student s=sd.getstudent();
		s.study();
		//对象调用方法，方法，
		sd.getstudent().study();

	}
}