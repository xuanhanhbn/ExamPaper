package Exam2;

public class Main {
    public static void main(String[] args) {
        Flight f = new Flight();
        Flight f2 = new Flight(-2,"");
        Flight f3 = new Flight(857, "Toronto");
        f.display();
        f2.display();
        f3.display();
    }
}
