public class Main {
    public static void main(String[] args) {
        Linked_List menu = new Linked_List();

        Human chef = new Human("Chef");
        Human customer = new Human("Customer");

        NasiGoreng nasgor1 = new NasiGoreng("Nasi Goreng", "Indonesia");
        Spaghetti spaghetti = new Spaghetti("Spaghetti","Italy");
        Sushi sushi = new Sushi("Sushi", "Japan");

        nasgor1.add(chef, 18);
        spaghetti.add(chef, 90);
        sushi.add(chef, 34);

        menu.addFirst(sushi);
        menu.addAfter(spaghetti, sushi);
        menu.addLast(nasgor1);
        menu.display();

        nasgor1.buy(customer, 3);
        spaghetti.buy(customer, 90);
        sushi.buy(customer,30);
        
        menu.display();
    }  
}
