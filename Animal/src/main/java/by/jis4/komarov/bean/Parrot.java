package by.jis4.komarov.bean;

import by.jis4.komarov.interfaceI.Bird;

import java.util.Objects;

public class Parrot extends Bird {
    private String say = "Кеша хороший!";
    private boolean notSleepin6Morning = true;

    public Parrot(String name, String color, int legCount, boolean feathers, boolean fly, String say, boolean notSleepin6Morning) {
        super(name, color, legCount, feathers, fly);
        this.say = say;
        this.notSleepin6Morning = notSleepin6Morning;
    }


    @Override
    public String fly() {
        return super.fly();
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

    public boolean isNotSleepin6Morning() {
        return notSleepin6Morning;
    }

    public void setNotSleepin6Morning(boolean notSleepin6Morning) {
        this.notSleepin6Morning = notSleepin6Morning;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Parrot parrot = (Parrot) o;
        return notSleepin6Morning == parrot.notSleepin6Morning &&
                Objects.equals(say, parrot.say);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), say, notSleepin6Morning);
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "say='" + say + '\'' +
                ", notSleepin6Morning=" + notSleepin6Morning +
                ", legCount=" + legCount +
                '}';
    }
}
