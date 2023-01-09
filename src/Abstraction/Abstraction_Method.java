package Abstraction;

abstract class Bike{
    final int id = 10;
    abstract void run();
}
class Honda4 extends Bike{
    void run() {
        System.out.println("running safely.."+super.id);
    }

    public static void main(String args[]) {
        Bike obj = new Honda4();
        obj.run();
    }
}