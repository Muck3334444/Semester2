package org.Vorlesungen.Generics.Container;

public abstract class KlasseOhneEqualsAndHash {
    private int id;

    public KlasseOhneEqualsAndHash(int id) {
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
