package chekpoint.products;

public class Tea extends Product{

    private boolean noTeaBag;

    public Tea(int id, String name, int price, boolean noTeaBag) {
        super(id, name, price);
        this.noTeaBag = noTeaBag;
    }

    public void setNoTeaBag(boolean noTeaBag) {
        this.noTeaBag = noTeaBag;
    }
}
