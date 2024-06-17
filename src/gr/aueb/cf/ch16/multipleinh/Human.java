package gr.aueb.cf.ch16.multipleinh;

public class Human implements IHumanable {
    @Override
    public void read() {
        System.out.println("Can be read");
    }

    @Override
    public void speak() {
        System.out.println("Can speak");
    }
}
