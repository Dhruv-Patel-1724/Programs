public class A {
    static A a1 =new A();
    int age=21;
    public void n1(){

        System.out.println("Hello");
    }
    public static void m1(){
//A a1 =new A();
a1.n1();
System.out.println(a1.age);
    }
    public static void m2(){
//A a1 =new A();
a1.n1();
System.out.println(a1.age);

    }
    public static void m3(){

     
a1.n1();  
System.out.println(a1.age);
    }
    public static void m4(){


a1.n1();
System.out.println(a1.age);
    }
    public static void main(String[] args) {

m1();
m2();
m3();
m4(); }
}
