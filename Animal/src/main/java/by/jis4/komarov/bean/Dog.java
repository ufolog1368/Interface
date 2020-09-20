package by.jis4.komarov.bean;

import by.jis4.komarov.interfaceI.Mammal;

import java.util.Objects;

public class Dog extends Mammal {
    private String say = "Hau hau";
    private boolean swim = true;

    public Dog(String name, String color, int legCount, boolean haveWool, String say, boolean swim) {
        super(name, color, legCount, haveWool);
        this.say = say;
        this.swim = swim;
    }

    public boolean runToStick(){
        return true;
    }

    @Override
    public String run() {
        return super.run();
    }

    @Override
    public String voice(String voice) {
        return super.voice(voice);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public int getLegCount() {
        return super.getLegCount();
    }

    @Override
    public void setLegCount(int legCount) {
        super.setLegCount(legCount);
    }

    public String getSay() {
        return say;
    }

    public void setSay(String say) {
        this.say = say;
    }

    public boolean isSwim() {
        return swim;
    }

    public void setSwim(boolean swim) {
        this.swim = swim;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return swim == dog.swim &&
                Objects.equals(say, dog.say);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), say, swim);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "say='" + say + '\'' +
                ", swim=" + swim +
                ", legCount=" + legCount +
                '}';
    }
}
