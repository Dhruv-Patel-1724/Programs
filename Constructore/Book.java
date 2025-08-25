public class Book {
    int price;
    String book_name;
    String publiser_name;
    String Author_name;
    int No_Pages;
static int count =0;
public Book(int p,String book,String pub,String Author,int page){
    price=p;
    book_name=book;
    publiser_name=pub;
    Author_name=Author;
    No_Pages=page;
}
public void default1(){
    System.out.println(price+" price "+book_name+" BookName "+publiser_name+" Publisher "+Author_name+" Author "+No_Pages+" pages ");
    count++;
}
    public static void main(String[] args) {
        Book b1 =new Book(200,"xyz","RJV","Raju",501);
        Book b2 =new Book(2000,"abc","RJV1","Ram",5001);
        b1.default1();
        b2.default1();
        System.out.println("Total nimbe is:"+count);
}
}