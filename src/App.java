import java.util.ArrayList;
import java.util.List;

import models.Node;
import models.Person;

public class App {
    public static void main(String[] args) {
        Node<Person> nodeJ = new Node<Person>(new Person("Juan", 30));
        Node<Person> nodeM = new Node<Person>(new Person("Maria", 35));
        Node<Person> nodeP = new Node<Person>(new Person("Pepito", 31));
        Node<Person> nodeD = new Node<Person>(new Person("Diego", 25));

        nodeJ.setNext(nodeM);
        nodeM.setNext(nodeP);
        nodeP.setNext(nodeD);

        System.out.println(nodeJ.toString());
    }
}
