public class Book extends Product {
    private String author;
    private double dec=20;
    private double Pr=100;

    public Book(){

    }

    @Override
    public double getDiscount() {
        double d= Pr-(Pr*dec/100);
        return Pr-(Pr*dec/100);

    }

    public Book(String name , double price, String author){
        super(name,price);
        this.author=author;
    }



    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String toString(){
        return "Book name: "+getName()+"  Book price: "+getPrice()+"  Author name: "+getAuthor();
    }
}
