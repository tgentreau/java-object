package banque;

import banque.entities.Credit;
import banque.entities.Debit;
import banque.entities.Operation;

import java.util.ArrayList;

public class TestOperation {
    public static void main(String[] args) {
        ArrayList<Operation> arr= new ArrayList<>();
        
        arr.add(new Credit("18/05/2021", 1500));
        arr.add(new Debit("02/09/2019", 2000));
        arr.add(new Credit("18/01/2020", 15000));
        arr.add(new Debit("25/04/2022", 200));

        int motantTotalCredit = 0;
        int motantTotalDebit = 0;
        for (Operation operation : arr) {
            System.out.println(operation.getType() + ": " + operation.toString());
            if(operation.getType() == "Crédit") {
                System.out.println(motantTotalCredit += operation.montantOperation);
            } else {
                System.out.println(motantTotalDebit -= operation.montantOperation);
            }
        }
    }
}
