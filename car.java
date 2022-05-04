class Car {

    Integer quantityDoors = 4;

    public void addDoor() {
        this.quantityDoors += 1;
    }

    public void printDoors() {
        System.out.println("Number of doors: " + this.quantityDoors);
    }

    public static void main(String[ ] args) {

        Car miCar = new Car();
        miCar.addDoor();
        miCar.printDoors();
    }
}