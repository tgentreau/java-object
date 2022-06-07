package banque.entities;

abstract public class Operation {
    public String dateOperation;
    public int montantOperation;

    public Operation(String dateOperation, int montantOperation) {
        this.dateOperation = dateOperation;
        this.montantOperation = montantOperation;
    }

    public abstract String getType();

    @Override
    public String toString() {
        return "Operation{" +
                "dateOperation='" + dateOperation + '\'' +
                ", montantOperation=" + montantOperation +
                '}';
    }
}
