public class Main {
    public static void main(String[] args) {
        System.out.println("***********************");
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        redHeadDuck.display();
        redHeadDuck.performFly();
        redHeadDuck.performQuack();
        redHeadDuck.performSwim();
        System.out.println("***********************");
        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        rubberDuck.performSwim();
        System.out.println("***********************");
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.performSwim();

    }
}
