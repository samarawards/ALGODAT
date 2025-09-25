import java.util.Scanner;
import LinkedList.*;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int int_input, first_input; 
        String string_input;

        // Linked List Game Systems
        Single_LL inventory = new Single_LL();     
        Double_LL map = new Double_LL();           
        Circular_LL gacha = new Circular_LL();     
        Ordered_SLL quest = new Ordered_SLL();     
        Sorted_SLL rank = new Sorted_SLL();        

        do {
            System.out.println("\n======== INFORMATION SYSTEM OF GALAXY ADVENTURE GAME ========");
            System.out.print(
                "1. Player Inventory\n" +
                "2. Maps\n" +
                "3. Item Spin Wheel\n" +
                "4. Quest\n" +
                "5. Rank \n" +
                "6. Exit\n" +
                "Choice: "
            );
            first_input = userInput.nextInt(); userInput.nextLine(); // buffer

            // ========== INVENTORY (Singly LL) ==========
            if (first_input == 1) {
                System.out.println("========= PLAYER INVENTORY =========");
                System.out.print("0. Back\n1. Show Items\n2. Add Items\nChoice: ");
                int_input = userInput.nextInt(); userInput.nextLine();

                if (int_input == 1) {
                    System.out.println("------------");
                    inventory.display();
                    System.out.println("------------");
                    System.out.print("0. Back\n1. Delete Item\nChoice: ");
                    int_input = userInput.nextInt(); userInput.nextLine();
                    if (int_input == 1) {
                        System.out.print("Delete item name: ");
                        string_input = userInput.nextLine();
                        inventory.deleteData(string_input);
                    }
                } else if (int_input == 2) {
                    System.out.print("1. Add First\n2. Add Last\n3. Add Between\nChoice: ");
                    int_input = userInput.nextInt(); userInput.nextLine();
                    System.out.print("Item name: ");
                    string_input = userInput.nextLine();
                    switch (int_input) {
                        case 1 -> inventory.addHead(string_input);
                        case 2 -> inventory.addTail(string_input);
                        case 3 -> {
                            System.out.print("Position: ");
                            int pos = userInput.nextInt(); userInput.nextLine();
                            inventory.addDataByNumber(string_input, pos);
                        }
                    }
                }

            // ========== MAP (Doubly LL) ==========
            } else if (first_input == 2){
                System.out.println("=========MAPs========");
                System.out.print("0. Back\n1. Show Map\n2. Add Map\nChoice: ");
                int_input = userInput.nextInt(); userInput.nextLine();

                if (int_input == 1){
                    map.display();
                } else if (int_input == 2){
                    System.out.print("0. Back\n1. Add at Start\n2. Add at End\n3. Add Between\nChoice: ");
                    int_input = userInput.nextInt(); userInput.nextLine();
                    System.out.print("Map name: ");
                    string_input = userInput.nextLine();
                    if (int_input == 1) map.addHead(string_input);
                    else if (int_input == 1) map.addLast(string_input);
                    else {
                        System.out.print("Put after: ");
                        String after = userInput.nextLine();
                        map.addDataByName(string_input, after);
                    }
                }

            } else if (first_input == 3){
                System.out.println("=========SPIN WHEEL========");
                System.out.print("0. Back\n1. Show Rewards\n2. Spin\n3. Add Reward\nChoice: ");
                int_input = userInput.nextInt(); userInput.nextLine();

                if (int_input == 1){
                    gacha.display();
                } else if (int_input == 2){
                    gacha.spin();
                }else if (int_input == 3){
                    System.out.print("Item name: ");
                    string_input = userInput.nextLine();
                    System.out.print("Put at number: ");
                    int_input = userInput.nextInt(); userInput.nextLine();
                    gacha.addDataByNumber(string_input, int_input);
                }

            } else if (first_input == 4){
                System.out.println("=========QUEST PRIORITY========");
                System.out.print("0. Back\n1. Show Quests\n2. Add Quest\nChoice: ");
                int_input = userInput.nextInt(); userInput.nextLine();

                if (int_input == 1){
                    quest.display();
                } else if (int_input == 2){
                    System.out.print("Quest name: ");
                    string_input = userInput.nextLine();
                    System.out.print("Quest difficulty (Easy/Medium/Hard): ");
                    String diff = userInput.nextLine();
                    quest.addData(string_input, diff); 
                }

            } else if (first_input == 5){
                System.out.println("=========PLAYER RANK========");
                System.out.print("0. Back\n1. Show Rank\n2. Add Player Score\nChoice: ");
                int_input = userInput.nextInt(); userInput.nextLine();

                if (int_input == 1){
                    rank.display();
                } else if (int_input == 2){
                    System.out.print("Player name: ");
                    string_input = userInput.nextLine();
                    System.out.print("Score: ");
                    int score = userInput.nextInt(); userInput.nextLine();
                    rank.addData(score, string_input); 
                }
            }
        } while (first_input != 6);

        userInput.close();
        System.out.println("Game Information System Closed.");
    }
}
