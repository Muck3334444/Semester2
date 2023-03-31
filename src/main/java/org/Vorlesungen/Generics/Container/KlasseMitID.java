package org.Vorlesungen.Generics.Container;

public class KlasseMitID {
    private int id;

    public KlasseMitID(int id) {
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj){
        return id == ((KlasseMitID)obj).id;
    }
}
