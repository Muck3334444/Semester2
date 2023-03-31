package org.Vorlesungen.Generics.Container;

import java.util.Objects;

public class KlasseMitIDOnlyWithHash {
    private int id;

    public KlasseMitIDOnlyWithHash(int id) {
        super();
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        System.out.println("Hash Methode");
        return Objects.hash(id);
    }

    public int getId() {
        return id;
    }
}
