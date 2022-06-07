package banque.entities;

public class Debit extends Operation{
    public Debit(String dateOperation, int montantOperation) {
        super(dateOperation, montantOperation);
    }

    @Override
    public String getType() {
        return "Débit";
    }
}
