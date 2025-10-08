public class ADT{
    public static void main(String[] args) {
        Spaghetti spaghetti = new Spaghetti("Spaghetti", "Italia");
        NasiGoreng nasgor1 = new NasiGoreng("Nasi Goreng", "Indonesia");
        Sushi sushi = new Sushi("Sushi", "Jepang");

        Human chef = new Human("Chef");
        Human  customer = new Human("Customer");

        //chef restock the food
        spaghetti.add(chef, 10);
        nasgor1.add(chef, 20);
        sushi.add(chef, 50);

        //buyer
        spaghetti.buy(customer, 10);
        nasgor1.buy(customer, 20);
        sushi.buy(customer, 5);

        //lihat sisa makanan
        // System.out.println(spaghetti.getTotal());
        // System.out.println(nasgor1.getTotal());
        // System.out.println(sushi.getTotal());

        System.out.println("=== Linked List yang menyimpan Object dari ADT ===");
        Linked_List food = new Linked_List();
        food.addFirst(nasgor1);
        food.addTail(sushi);
        food.addAfter(spaghetti, nasgor1);
        food.display();
    }
}

abstract class Food{
    String foodName;
    String fromCountry;
    int total;

    abstract boolean isReady();
    abstract void buy(Human buyer, int amount);
    abstract void add(Human adder, int add);
    abstract int getTotal ();
}

class NasiGoreng extends Food{

    public NasiGoreng (String foodName, String fromCountry){
        this.foodName = foodName;
        this.fromCountry = fromCountry;
        this.total = 0;
    }

    public boolean isReady(){
        if (this.total <= 0) return false;
        else return true;
    }

    public void buy (Human buyer, int amount){
        if (isReady()) {
            if (amount > total){
                System.out.println( total + foodName + " left");
            }else{
                System.out.println(buyer.name + " has bought " + amount + " fried rice from " + this.fromCountry);
                this.total-= amount;
            }
        }else{
            System.out.println(this.foodName + " is out of stock");
        }
    }

    public void add (Human adder, int add){
        this.total+=add;
        System.out.println(adder.name + " has added fried rice to the stock.\n the stock right now is: " + total);
    }

    public int getTotal(){
        return total;
    }
}

class Spaghetti extends Food{

    public Spaghetti (String foodName, String fromCountry){
        this.foodName = foodName;
        this.fromCountry = fromCountry;
        this.total = 0;
    }

    public boolean isReady(){
        if (this.total <= 0) return false;
        else return true;
    }

    public void buy (Human buyer, int amount){
        if (isReady()) {
            if (amount > total){
                System.out.println( total + foodName + " left");
            }else{
                System.out.println(buyer.name + " has bought " + amount + " has bought Spagetti from " + this.fromCountry);
                this.total-=amount;
            }
        }else{
            System.out.println(this.foodName + " is out of stock");
        }
    }

    public void add (Human adder, int add){
        this.total+=add;
        System.out.println(adder.name + " has added spaghetti to the stock.\n the stock right now is: " + total);
    }

    public int getTotal(){
        return total;
    }
}

class Sushi extends Food{

    public Sushi (String foodName, String fromCountry){
        this.foodName = foodName;
        this.fromCountry = fromCountry;
        this.total = 0;
    }

    public boolean isReady(){
        if (this.total <= 0) return false;
        else return true;
    }

    public void buy (Human buyer, int amount){
        if (isReady()) {
            if (amount > total){
                System.out.println( total + foodName + " left");
            }else{
                System.out.println(buyer.name + " has bought " + amount + " has bought sushi from " + this.fromCountry);
                this.total-= amount;
            }
        }else{
            System.out.println(this.foodName + " is out of stock");
        }
    }

    public void add (Human adder, int add){
        this.total+=add;
        System.out.println(adder.name + " has added sushi to the stock.\n the stock right now is: " + total);
    }

    public int getTotal(){
        return total;
    }
}

class Human{
    String name;

    public Human (String name){
        this.name = name;
    }
}

