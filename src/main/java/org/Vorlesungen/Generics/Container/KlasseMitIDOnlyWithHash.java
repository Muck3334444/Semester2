package org.Vorlesungen.Generics.Container;

import java.util.Objects;

public class KlasseMitIDOnlyWithHash extends KlasseOhneEqualsAndHash{
    public KlasseMitIDOnlyWithHash(int id) {
        super(id);
    }

    @Override
    public int hashCode() {
        System.out.print("Hash Methode  ");
        return Objects.hash(getId());
    }
}
