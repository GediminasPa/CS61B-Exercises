public class Dog {
    int weightInPounds;

    public void makeNoise() {
        if (weightInPounds < 10) {
            System.out.println("yip");
        } else if (weightInPounds < 30) {
            System.out.println("yayaya");
        } else {
            System.out.println("Wooooof!");
        }
    }

}
