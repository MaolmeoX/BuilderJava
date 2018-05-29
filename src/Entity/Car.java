package Entity;

public class Car extends AbstractVehicle {
    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "roues=" + roues +
                ", typeRoue=" + typeRoue +
                ", cylindre='" + cylindre + '\'' +
                ", carrosserie=" + carrosserie +
                ", reservoir=" + reservoir +
                '}';
    }
}
