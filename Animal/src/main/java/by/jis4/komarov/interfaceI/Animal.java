package by.jis4.komarov.interfaceI;

import java.util.Objects;

public abstract class Animal {
     private String name;
     private String color;
     protected int legCount;

    public Animal() {
    }

    public Animal(String name, String color, int legCount) {
        this.name = name;
        this.color = color;
        this.legCount = legCount;
    }

    public String voice(String voice){
        return "voice";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLegCount() {
        return legCount;
    }

    public void setLegCount(int legCount) {
        this.legCount = legCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return legCount == animal.legCount &&
                Objects.equals(name, animal.name) &&
                Objects.equals(color, animal.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, legCount);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", legCount=" + legCount +
                '}';
    }
}

