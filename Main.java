

public class Main {
    public static void main(String[] args) {
        Movie movie=new Movie("I Am Legend",50,"Francis Lawrence");
       System.out.print("Movie price after discount:  "+movie.getDiscount()+"\n");
       System.out.println("-------------------------------");
        Book book= new Book("NARUTO",90,"Masashi Kishimoto");
       System.out.println(book.toString());
        System.out.println("Book price after discount:  "+book.getDiscount());



    }
}