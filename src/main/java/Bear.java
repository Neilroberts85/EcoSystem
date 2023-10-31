import java.util.ArrayList;

public class Bear {

    private String name;
    private ArrayList<Fish> belly;

    public Bear(String inputName){
        this.name = inputName;
        this.belly = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void sleep() {
        this.belly.clear();
    }

    public void eat(River river) {
        Fish fishToEat = river.removeFish();
        if (fishToEat != null) {
            this.belly.add(fishToEat);
        }
    }

    public int getBellySize() {
        return this.belly.size();
    }
}
