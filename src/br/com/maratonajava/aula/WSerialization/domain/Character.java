package br.com.maratonajava.aula.WSerialization.domain;


import java.io.*;

public class Character implements Serializable {


    @Serial
    private static final long serialVersionUID = 2408374219390512604L;

    private String name;
    private int life;
    private int strength;
    private transient ChrType chrType;

    public Character(String name, int life, int strength, ChrType chrType) {
        this.name = name;
        this.life = life;
        this.strength = strength;
        this.chrType = chrType;
    }

    @Serial
    private void writeObject(ObjectOutputStream oos){
        try{
            oos.defaultWriteObject();
            oos.writeObject(chrType);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    @Serial
    private void readObject(ObjectInputStream ois){
        try{
            ois.defaultReadObject();
            chrType = (ChrType) ois.readObject();
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", life=" + life +
                ", strength=" + strength +
                ", chrType=" + chrType +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public ChrType getChrType() {
        return chrType;
    }

    public void setChrType(ChrType chrType) {
        this.chrType = chrType;
    }
}
