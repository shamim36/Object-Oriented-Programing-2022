public class Main extends Army {
    public static void main(String[] args) {
        Army army = new Army();
        army.setName("Army");
        army.setRank("General");
        army.setTroops("1000");
        army.brigadeDetails();

        System.out.println();

        Airforce airforce = new Airforce();
        airforce.setName("Airforce");
        airforce.setRank("Air Marshal");
        airforce.setTroops("500");
        airforce.brigadeDetails();

        System.out.println();

        Navy navy = new Navy();
        navy.setName("Navy");
        navy.setRank("Admiral");
        navy.setTroops("100");
        navy.brigadeDetails();
    }
}