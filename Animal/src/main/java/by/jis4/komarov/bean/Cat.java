package by.jis4.komarov.bean;


import by.jis4.komarov.interfaceI.Mammal;

import java.util.Objects;


public class Cat extends Mammal {
    private String say = "myau";
    private boolean sleep20hinDay = true;

    public Cat(String name, String color, int legCount, boolean haveWool, String say, boolean sleep20hinDay) {
        super(name, color, legCount, haveWool);
        this.say = say;
        this.sleep20hinDay = sleep20hinDay;
    }

    public boolean gameWithRope(){
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

    public boolean isSleep20hinDay() {
        return sleep20hinDay;
    }

    public void setSleep20hinDay(boolean sleep20hinDay) {
        this.sleep20hinDay = sleep20hinDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return sleep20hinDay == cat.sleep20hinDay &&
                Objects.equals(say, cat.say);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), say, sleep20hinDay);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "say='" + say + '\'' +
                ", sleep20hinDay=" + sleep20hinDay +
                ", legCount=" + legCount +
                '}';
    }
}
