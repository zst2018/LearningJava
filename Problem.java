class Sample {  
      
   private  int x;  
  
    public Sample() { // 不带参数的构造方法  
        this(1); //这是调用的带参的构造方法 
        System.out.println(x);
    }  
      
    public Sample(int x) { //带参数的构造方法  
        this.x=x;  
        //System.out.println(x);
    }  
      
    public int Sample(int x) { //不是构造方法  
        return x++;  

    }  
  
}  
class Problem{
    public static void main(String[] args){
        Sample s=new Sample();
        //System.out.println(s.x);//x可以在Sample中访问private
         //System.out.println(s.Sample(8));
       // System.out.println();
        //Sample s1=new Sample(27);
     //System.out.println(s1.Sample(6));
    }
}