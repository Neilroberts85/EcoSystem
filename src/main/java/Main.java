public class Main {
    public static void main(String[] args) {

        Bear yogi = new Bear("Yogi");
        System.out.println(yogi.getName());

        River amazon = new River("Amazon");
        Fish f1 = new Fish("Salmon");
        Fish f2 = new Fish("Salmon");
        Fish f3 = new Fish("Salmon");

        amazon.addFish(f1);
        amazon.addFish(f2);
        amazon.addFish(f3);


        yogi.eat(amazon);
        System.out.println(amazon.getFishCount());
        System.out.println(yogi.getBellySize());

    }}