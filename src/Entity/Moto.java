package Entity;

public class Moto extends AbstractVehicle {
    public Moto() {
    }

    @Override
    public String toString() {
        return "Moto{" +
                "roues=" + roues +
                ", typeRoue=" + typeRoue +
                ", cylindre='" + cylindre + '\'' +
                ", carrosserie=" + carrosserie +
                ", reservoir=" + reservoir +
                '}';
    }


}
