public class Main {

    public static void main(String[] args) {
        Animals sheep = new Animals("sheep");
        System.out.println("Sheep Produce Wool");

        Mammal whale = new Mammal(3403,"Whale");
        System.out.println("Suprisingly, Whales are Considered Mammals");

        Reptile snake = new Reptile(true,"Rattlesnake");
        System.out.println("Many Snakes are Poisonous");

        Lizard chamilion = new Lizard(true);
        System.out.println("Chamilions Change Colors");

        Bear blackBear = new Bear(true);
        System.out.println("Bears tend to hibernate during the winter");


    }
}
