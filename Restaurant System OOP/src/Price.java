public class Price extends Menu{
    public int option;
    public double price = 0.00;
    public double k = 0.00;


    public void price() {
        option = choice();
        System.out.println();
        switch (option) {
            case 1:
                System.out.println("\tAdded Burger to Green  1200tk/-");
                this.k = 1200.00;
                this.price += 1200.00;
                break;
            case 2:
                System.out.println("\tAdded Pizza Green paperoni  1700tk/-");
                this.k = 1700.00;
                this.price += 1700.00;
                break;
            case 3:
                System.out.println("\tAdded Chilli French Fry  900tk/-");
                this.k = 900.00;
                this.price += 900.00;
                break;
            case 4:
                System.out.println("\tAdded Chocolate Shake  500tk/-");
                this.k = 500.00;
                this.price += 500.00;
                break;
            case 5:
                System.out.println("\tAdded Ice Cream  399tk/-");
                this.k = 399.00;
                this.price += 399.00;
                break;
            case 6:
                System.out.println("\tAdded Cold Drink  199tk/-");
                this.k = 199.00;
                this.price += 199.00;
                break;
            case 7:
                System.out.println("\tAdded Tea/coffee  299tk/-");
                this.k = 299.00;
                this.price += 299.00;
                break;
            case 8:
                System.out.println("\tAdded Asif Special Naga Chicken  2700tk/-");
                this.k = 2700.00;
                this.price += 2700.00;
                break;
            case 9:
                System.out.println("\tAdded Asif Special Naga Burger  1500tk/-");
                this.k = 1500.00;
                this.price += 1500.00;
                break;
            case 10:
                System.out.println("\tAdded Asif Special Naga Pizza  2000tk/-");
                this.k = 2000.00;
                this.price += 2000.00;
                break;
            case 11:
                System.out.println("\tAdded Asif Special Naga Chilli French Fry  1000tk/-");
                this.k = 1000.00;
                this.price += 1000.00;
                break;
            case 12:
                System.out.println("\tAdded Asif Special Naga Chocolate Shake  600tk/-");
                this.k = 600.00;
                this.price += 600.00;
                break;
            case 13:
                System.out.println("\tAdded Asif Special Naga Ice Cream  4999tk/-");
                this.k = 4999.00;
                this.price += 4999.00;
                break;
            case 14:
                System.out.println("\tAdded Asif Special Naga Cold Drink  299tk/-");
                this.k = 299.00;
                this.price += 299.00;
                break;
            case 15:
                System.out.println("\tExiting");
                this.k = 0.00;
                System.out.println("\n\tThank you for visiting Green Garder 2.0");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
    public double getPrice(){
        return price;
    }


}
