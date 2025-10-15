public class NasiGoreng extends Food{

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
