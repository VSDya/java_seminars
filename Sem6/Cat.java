package Sem6;

import java.util.Objects;

public class Cat {
    int numPassport;
    String owner;
    String name;
    int age;
    String color;

    public Cat(int numPassport, String name, String owner, int age, String color) {
        this.numPassport = numPassport;
        this.owner = owner;
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return  "numPassport: " + numPassport +
                " owner: " + owner +
                " name: " + name +
                " age: " + age +
                " color: " + color;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + 7*numPassport + 13*owner.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cat)){
         return false;
        }
        Cat cat = (Cat) obj;
        return numPassport == cat.numPassport && name.equalsIgnoreCase(cat.name) && owner.equalsIgnoreCase(cat.owner);
    }
}

