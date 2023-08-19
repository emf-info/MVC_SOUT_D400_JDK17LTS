package models;

public class PrevisionMeteo {

    private final String prevision;

    public PrevisionMeteo( String prevision ) {
        this.prevision = prevision;
    }

    public String getPrevision() {
        return prevision;
    }

    @Override
    public String toString() {
        return prevision;
    }
    
}
