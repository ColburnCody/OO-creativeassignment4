package model.idemo;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class Vehicle implements ISound, IRender {

    private int x;
    private int y;
    private String make;
    private double price;
    private BufferedImage image;

    public Vehicle(int x, int y, String make, double price) {
        this.x = x;
        this.y = y;
        this.make = make;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public double getPrice() {
        return price;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Vehicle at (" + x + ", " + y + ") " + make + " $" + price;
    }

    @Override
    public String getSound() {
        return null;
    }

    @Override
    public void render(Graphics2D g2) {

    }
}