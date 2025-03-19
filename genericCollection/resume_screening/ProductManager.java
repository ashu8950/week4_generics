package genericCollection.resume_screening;

public class ProductManager extends JobRole {
    private boolean hasMBA;

    public ProductManager(String candidateName, boolean hasMBA) {
        super(candidateName);
        this.hasMBA = hasMBA;
    }

    @Override
    public boolean screen() {
        return hasMBA;
    }
}
