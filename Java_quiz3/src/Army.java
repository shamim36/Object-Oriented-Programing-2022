import java.awt.*;

public class Army extends Abstract {
    private String name;
    private String rank;
    private String troops;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return this.rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getTroops() {
        return this.troops;
    }

    public void setTroops(String troops) {
        this.troops = troops;
    }


    @Override
    void brigadeDetails() {
        System.out.println(this.name);
        System.out.println(this.rank);
        System.out.println(this.troops);
    }
}
