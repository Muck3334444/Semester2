package org.Vorlesungen.Generics.Container;

public class KlasseMitIDOnlyWithEquals extends KlasseOhneEqualsAndHash{
    public KlasseMitIDOnlyWithEquals(int id) {
        super(id);
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
        return getId() == ((KlasseMitIDOnlyWithEquals)obj).getId();
    }
}
