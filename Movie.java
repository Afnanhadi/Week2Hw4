public class Movie extends Product{
   private String director;
   private double dec=50;
   private double Pr=3000;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Movie(){

   }

    @Override
    public double getDiscount() {
        double d= Pr-(Pr*dec/100);
        return Pr-(Pr*dec/100);
    }

    public Movie(String name , double price, String director){
       super(name,price);
       this.director=director;
    }

}
