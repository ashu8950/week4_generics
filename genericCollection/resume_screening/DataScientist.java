package genericCollection.resume_screening;

public class DataScientist extends JobRole {
    private boolean knowsML;

    public DataScientist(String candidateName, boolean knowsML) {
        super(candidateName);
        this.knowsML = knowsML;
    }

    @Override
    public boolean screen() {
        return knowsML;
    }
}

