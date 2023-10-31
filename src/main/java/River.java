import java.util.ArrayList;

public class River {

    private String name;
    private ArrayList<Fish> fishes;

    public River(String inputName){
        this.name = inputName;
        this.fishes = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addFish(Fish fish) {
        this.fishes.add(fish);
    }

    public int getFishCount() {
        return this.fishes.size();
    }

    public Fish removeFish() {
        if(this.getFishCount() > 0) {
            return this.fishes.remove(0);
        }
        return null;
    }
}
