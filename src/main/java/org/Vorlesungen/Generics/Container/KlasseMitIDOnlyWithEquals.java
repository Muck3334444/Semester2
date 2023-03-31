package org.Vorlesungen.Generics.Container;

import java.util.Objects;

public class KlasseMitIDOnlyWithEquals {
    private int id;

    public KlasseMitIDOnlyWithEquals(int id) {
        super();
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
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (getClass() != obj.getClass())
            return false;
        System.out.println("Equals Methode von: " + this);
        return id == ((KlasseMitIDOnlyWithEquals)obj).id;
    }
}
