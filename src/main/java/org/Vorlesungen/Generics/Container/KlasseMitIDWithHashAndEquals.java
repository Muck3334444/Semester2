package org.Vorlesungen.Generics.Container;

import java.util.Objects;

public class KlasseMitIDWithHashAndEquals extends KlasseOhneEqualsAndHash{
    public KlasseMitIDWithHashAndEquals(int id) {
        super(id);
    }

    @Override
    public int hashCode() {
        System.out.print("Hash Methode    ");
        return Objects.hash(getId());
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        System.out.println("Equals Methode von: " + this);
        return getId() == ((KlasseMitIDWithHashAndEquals)obj).getId();
    }
}
