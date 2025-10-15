public class Main {
        public static void main(String[] args) {
        Linked_List food = new Linked_List();
        
        Spaghetti spaghetti = new Spaghetti("Spaghetti", "Italia");
        NasiGoreng nasgor1 = new NasiGoreng("Nasi Goreng", "Indonesia");
        Sushi sushi = new Sushi("Sushi", "Jepang");

        Human chef = new Human("Chef");
        Human  customer = new Human("Customer");

        //chef restock the food
        spaghetti.add(chef, 10);
        if (!food.findData("Spaghetti")) food.addFirst(spaghetti);
        nasgor1.add(chef, 20);
        if (!food.findData("Nasi Goreng")) food.addLast(nasgor1);
        sushi.add(chef, 50);
        if (!food.findData("Sushi")) food.addFirst(sushi);

        System.out.println("=== Linked List yang menyimpan Object dari ADT ===");
        food.display();

        //buyer
        spaghetti.buy(customer, 10); 
        if (spaghetti.getTotal() == 0) food.delete("Spaghetti");
        nasgor1.buy(customer, 20);
        if (nasgor1.getTotal() == 0) food.delete("Nasi Goreng");
        sushi.buy(customer, 5);
        if (sushi.getTotal() == 0) food.delete("Shusi");

        System.out.println("=== Linked List yang menyimpan Object dari ADT (deleted)===");
        food.display();

        //chef restock the food again
        spaghetti.add(chef, 7);
        if (!food.findData("Spaghetti")) food.addFirst(spaghetti);
        nasgor1.add(chef, 8);
        if (!food.findData("Nasi Goreng")) food.addLast(nasgor1);

        System.out.println("=== Linked List yang menyimpan Object dari ADT (updated)===");
        food.display();
    }
}
