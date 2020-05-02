package Class_Fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        // set thuộc tính cho đối tượng

        fan1.setOnOFF(true);
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yelow");

        fan2.setOnOFF(false);
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");

        System.out.print("Fan_1 : " + fan1.toString());
        System.out.print("\nFan_2 : " + fan2.toString());
    }
}
