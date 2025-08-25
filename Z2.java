public class Z2 {
    int a = 20;

    public static void main(String[] args) {
        Z2 a1 =new Z2();
        Z2 a2 =new Z2();
        System.out.println(a1.a);
        System.out.println(a2.a);
        a1.a=100;
        System.out.println(a1.a);
        System.out.println(a2.a);
    }
}
