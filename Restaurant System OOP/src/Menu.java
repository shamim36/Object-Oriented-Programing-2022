import java.util.Scanner;

public class Menu extends Menu2 {

    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
@Override
    public void menu(){

        System.out.println();
        System.out.println("1. Burger to Green  1200tk/-");
        System.out.println("2. Pizza Green paperoni  1700tk/-");
        System.out.println("3. Chilli French Fry  900tk/-");
        System.out.println("4. Chocolate Shake  500tk/-");
        System.out.println("5. Ice Cream  399tk/-");
        System.out.println("6. Cold Drink  199tk/-");
        System.out.println("7. Tea/coffee  299tk/-");
        System.out.println("8. Asif Special Naga Chicken  2700tk/-");
        System.out.println("9. Asif Special Naga Burger  1500tk/-");
        System.out.println("10. Asif Special Naga Pizza  2000tk/-");
        System.out.println("11. Asif Special Naga Chilli French Fry  1000tk/-");
        System.out.println("12. Asif Special Naga Chocolate Shake  600tk/-");
        System.out.println("13. Asif Special Naga Ice Cream  4999tk/-");
        System.out.println("14. Asif Special Naga Cold Drink  299tk/-");
        System.out.println("15. Exit");
    }


    public int choice(){
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();
        return choice;
    }


}
