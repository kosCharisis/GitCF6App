package gr.aueb.cf.ch19.lifo;

public class Main {
    public static void main(String[] args) {
        // Wiring
        IStorage storage = new StorageImpl<>(50);
        IGarage garage = new GarageImpl(storage);

        try {
            garage.addCar("IZZ9801");
            System.out.println("Successfully Inserted");

            garage.addCar("PZZ7601 ");
            System.out.println("Successfully Inserted");

            String removeCar = garage.removeCar();
            System.out.println("Removed: " + removeCar);

            garage.printCars();
        } catch (GarageIsFullException e) {
            System.out.println("Garage is full");
        } catch (GarageIsEmptyException e) {
            System.out.println("Garage is empty");
        }
    }
}
