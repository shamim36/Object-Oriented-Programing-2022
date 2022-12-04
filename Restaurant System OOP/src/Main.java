import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double t =0.00;

        Menu menu = new Menu();
        Price price = new Price();
        System.out.print("Enter your name: ");
        menu.setName(scanner.nextLine());
        System.out.println();

        while (true) {
            menu.menu();
            price.price();



            if (price.option == 15) {
                break;
            }

            double t1 =0.00;
                    t1= price.k + (price.k*.15);
            System.out.println("\tNormal price with vat: " + t1);
            System.out.println();


                    t=t+ t1;
            System.out.println("\t---------------------------------");
            System.out.println("\tTotal Price without vat: " + price.getPrice() );
            System.out.println("\tTotal Price with vat: " + t );
            System.out.println("\t---------------------------------");

            System.out.println("\n\nPress 1 to continue buying");
            int c = scanner.nextInt();
            if (c != 1) {
                System.out.println("\n\t "+ menu.getName()+ " Thank you for visiting Green Garder 2.0");
                break;
            }

        }

    }
}
