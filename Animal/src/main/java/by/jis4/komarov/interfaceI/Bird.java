package by.jis4.komarov.interfaceI;

import java.util.Objects;

public abstract class Bird extends Animal {
    boolean feathers = true;
    boolean fly = true;

    public String voice(){
        return "voice";
    }

    public String fly(){
        return "flying";
    }

    public Bird(String name, String color, int legCount, boolean feathers, boolean fly) {
        super(name, color, legCount);
        this.feathers = feathers;
        this.fly = fly;
    }

    public boolean isFeathers() {
        return feathers;
    }

    public void setFeathers(boolean feathers) {
        this.feathers = feathers;
    }

    public boolean isFly() {
        return fly;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return feathers == bird.feathers &&
                fly == bird.fly;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), feathers, fly);
    }

    @Override
    public String toString() {
        return "Bird{" +
                "feathers=" + feathers +
                ", fly=" + fly +
                ", legCount=" + legCount +
                '}';
    }
}
