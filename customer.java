import java.util.ArrayList;
import java.util.list;


public class customer{
    private string name;
    private list<RentalTransaction> rentalHistory = new ArrayList<>();

    public Customer(string name){
        this.name = name;
    }
    public String getname(){
        return name;
    }

    public void addRentalTransaction(RentalTransaction transaction){
        rentalHistory.add(transaction);

    }
}
    
      

