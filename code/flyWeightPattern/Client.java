package flyWeightPattern;

public class Client {
    public static void main(String[] args) {
        FlyWeightFactory factory = FlyWeightFactory.getInstance();
        AbstractFriend clown = factory.getFriend("th15_5b");
        System.out.println(clown.getName());
        People people = new People();
        people.setName("Nona9961");
        clown.engage(people);
    }
}
