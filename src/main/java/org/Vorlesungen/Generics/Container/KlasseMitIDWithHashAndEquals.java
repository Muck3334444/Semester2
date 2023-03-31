package org.Vorlesungen.Generics.Container;

import java.util.Objects;

public class KlasseMitIDWithHashAndEquals {
    private int id;

    public KlasseMitIDWithHashAndEquals(int id) {
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
        //return 1234;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (getClass() != obj.getClass())
            return false;
        System.out.println("Equals Methode von: " + this);
        return id == ((KlasseMitIDWithHashAndEquals)obj).id;
    }
}
