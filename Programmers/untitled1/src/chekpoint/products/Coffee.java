package chekpoint.products;

public class Coffee extends Product{
    private boolean addtionalShat;

    public Coffee(int id, String name, int price, boolean addtionalShat) {
        super(id, name, price);
        this.addtionalShat = addtionalShat;
    }

    public void setAddtionalShat(boolean addtionalShat) {
        this.addtionalShat = addtionalShat;
    }
}
