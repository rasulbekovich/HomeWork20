import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner =new Scanner(System.in);
            System.out.print("Height: ");
            double height = scanner.nextDouble();
            System.out.print("Length: ");
            double length = scanner.nextDouble();
            System.out.print("Wight: ");
            double wight = scanner.nextDouble();
            Parallelepiped parallelepiped=new Parallelepiped(height,length,wight);
            System.out.println(parallelepiped);
            System.out.println(" area: "+parallelepiped.area());
            System.out.println("value: "+parallelepiped.value());
        }catch (InputMismatchException e){
            System.out.println("no letters allowed!!!");
        }
    }
}