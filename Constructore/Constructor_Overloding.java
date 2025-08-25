public class Constructor_Overloding {
String ename;
int eid;
double sal;
Constructor_Overloding(String ename,int eid,double sal){
    this.ename=ename;
    this.eid=eid;
    this.sal=sal;
}
Constructor_Overloding(String ename,int eid){
    this.ename=ename;
    this.eid=eid;
   
}
Constructor_Overloding(double sal){
    
    this.sal=sal;
}
public void displayDetails(){
    System.out.println("Name : "+ename);
    System.out.println("Eid : "+eid);
    System.out.println("Salary : "+sal);
}

    public static void main(String[] args) {
        Constructor_Overloding c1 =new Constructor_Overloding("Dhruv", 8, 1000000);
        Constructor_Overloding c2 =new Constructor_Overloding("Patel", 9);
        Constructor_Overloding c3 = new Constructor_Overloding(4132656);
        c1.displayDetails();
        c2.displayDetails();
        c3.displayDetails();
    }
}
