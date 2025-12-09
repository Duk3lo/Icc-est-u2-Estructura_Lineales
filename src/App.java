import controllers.Stack;
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

        runStackExample();
        
    }

    public static void runStackExample(){
        Stack<Person> persons = new Stack<Person>();
        persons.push(new Person("Juan", 30));
        persons.push(new Person("Maria", 35));
        persons.push(new Person("Pepito", 31));
        persons.push(new Person("Diego", 25));
        System.out.println("Size" + persons.size());
        persons.pritnAllNodes();
        System.out.println(persons.pop());
        System.out.println("Size=" + persons.size());
        persons.pritnAllNodes();
    }
}
