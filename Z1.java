public class Z1 {
    int a = 20;
    public static void main(String[] args) {
        Z1 a1 =new Z1();
        Z1 a2 =a1;
        System.out.println(a1.a);
        System.out.println(a2.a);
        a1.a=100;
        System.out.println(a1.a);
        System.out.println(a2.a);
    }
}
