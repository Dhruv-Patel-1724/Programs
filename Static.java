public class Static {
    static int a=10;
    static{
        a++;
    }

    {
        a++;
    }
    public static void main(String[] args) {
        Static a1=new Static();
        System.out.println(a);
    }
}
