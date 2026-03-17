public class Dessert {
    int flavor;
    int price;
    public Dessert(int flavor,int price){
        this.flavor=flavor;
        this.price=price;
        Dessert.numDesserts += 1;
    }
    public static int numDesserts = 0;
    public  void printDessert(){
        System.out.println(this.flavor+" "+this.price+" "+Dessert.numDesserts);
    }
    public static void main(String[] args){
        System.out.println("I love dessert!");
    }
}
