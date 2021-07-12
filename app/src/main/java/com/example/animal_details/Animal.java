package com.example.animal_details;


public class Animal {

    private int image;
    private String name;
    private String type;
    private String sound;

    public Animal(int image, String name, String type, String sound) {
        this.image = image;
        this.name = name;
        this.type = type;
        this.sound = sound;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getSound() {
        return sound;
    }
}
