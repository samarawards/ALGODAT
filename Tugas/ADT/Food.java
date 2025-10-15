abstract public class Food{
    String foodName;
    String fromCountry;
    int total;

    abstract boolean isReady();
    abstract void buy(Human buyer, int amount);
    abstract void add(Human adder, int add);
    abstract int getTotal ();
}