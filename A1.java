public class A1 {
    static A1 a1 =new A1();
    int age=21;
    public void n1(){
        System.out.println("Hello");
    }
     public  void m1(){

a1.n1();
System.out.println(a1.age);
    }
    public  void m2(){

a1.n1();
System.out.println(a1.age);

    }
    public  void m3(){
a1.n1();  
System.out.println(a1.age);
    }
     
   public class B {
    public static void main(String[] args) {
       // A1 a1 =new A1();
        A1.a1.m1();
        A1.a1.m2();
        A1.a1.m3();
    }
}

}
