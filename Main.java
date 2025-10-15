public class Main {
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

        System.out.println("=== Linked List yang menyimpan Object dari ADT ===");
        Linked_List food = new Linked_List();
        food.addFirst(nasgor1);
        food.addLast(sushi);
        food.addAfter(spaghetti, nasgor1);
        food.display();

        //buyer
        spaghetti.buy(customer, 10); 
        if (spaghetti.getTotal() == 0) food.delete("Spaghetti");
        nasgor1.buy(customer, 20);
        if (nasgor1.getTotal() == 0) food.delete("Nasi Goreng");
        sushi.buy(customer, 5);
        if (sushi.getTotal() == 0) food.delete("Shusi");

        System.out.println("=== Linked List yang menyimpan Object dari ADT (Updated)===");
        food.display();

    }
}
