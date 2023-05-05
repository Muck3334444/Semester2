package org.Vorlesungen.FunctionalProgramming.Streams;

import java.util.Calendar;

public class Person {
    private String name;

    private Calendar birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    public void setBirthday(Calendar birthday) {
        this.birthday = birthday;
    }

    public Person(String name, Calendar birthday) {
        this.name = name;
        this.birthday = birthday;
    }
}
