package Class_Fan;

public class Fan {
    // Tạo Hằng Số
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // xây dựng các thuộc tính của Fan
    private int speed = SLOW;
    private boolean onOFF = false;
    private double radius = 5;
    private String color = "blue";

    public static int getSLOW() {
        return SLOW;
    }

    public static int getMEDIUM() {
        return MEDIUM;
    }

    public static int getFAST() {
        return FAST;
    }

    public int getSpeed(int fast) {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOnOFF(boolean b) {
        return onOFF;
    }

    public void setOnOFF(boolean onOFF) {
        this.onOFF = onOFF;
    }

    public double getRadius(int i) {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor(String yelow) {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (isOnOFF(true)) {
            return "Status: " + onOFF + ", speed: " + speed + ", color: " + color + ", radius: " + radius + ", fan is on";
        } else {
            return "Status: " + onOFF + ", speed: " + speed + ", color: " + color + ", radius: " + radius + ", fan is off";
        }
    }
}
