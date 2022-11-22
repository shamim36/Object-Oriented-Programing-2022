import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Electrical_Cars e = new Electrical_Cars();
        Mechanical_Cars m = new Mechanical_Cars();


        System.out.println("\n**For Mecahnical Car**\n");

        System.out.print("Set Cars name :");
        m.setName(in.next());
        System.out.print("Set Cars Model :");
        m.setModel(in.next());
        System.out.print("Set Cars color :");
        m.setColor(in.next());
        System.out.print("Set Cars milage :");
        m.setMilage(in.next());

        System.out.println();


        System.out.println("#Cars name :"+m.getName());
        System.out.println("#Cars Model :"+m.getModel());
        System.out.println("#Cars color :"+m.getColor());
        System.out.println("#Cars milage :"+m.getMilage());
        System.out.println("#Cars Engine :"+m.getEngineType());

        System.out.println("\n**For Electronic Car**\n");

        System.out.print("Set Cars name :");
        e.setName(in.next());
        System.out.print("Set Cars Model :");
        e.setModel(in.next());
        System.out.print("Set Cars color :");
        e.setColor(in.next());
        System.out.print("Set Cars milage :");
        e.setMilage(in.next());

        System.out.println();

        System.out.println("#Cars name :"+e.getName());
        System.out.println("#Cars Model :"+e.getModel());
        System.out.println("#Cars color :"+e.getColor());
        System.out.println("#Cars milage :"+e.getMilage());
        System.out.println("#Cars Engine :"+e.getEngineType());




    }

}
