
import java.util.Scanner;

public class Solarenergy{

    static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter morning energy generated: ");
        double morningEnergy = obj.nextDouble();

        System.out.print("Enter evening energy generated: ");
        double eveningEnergy = obj.nextDouble();

        double total = calculateTotalEnergy(morningEnergy, eveningEnergy);

        System.out.println("Total energy generated : " + total + " kWh");

        obj.close();
    }
}