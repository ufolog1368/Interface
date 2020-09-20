package by.jis4.komarov.interfaceI;

public abstract class Mammal extends Animal{

    boolean haveWool = true;

    public String run(){
        return "running";
    }

    public Mammal(String name, String color, int legCount, boolean haveWool) {
        super(name, color, legCount);
        this.haveWool = haveWool;
    }
}
