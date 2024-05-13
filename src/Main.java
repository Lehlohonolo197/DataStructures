import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {


        LinkedList <String> names = new  LinkedList<>();

        names.add("Lehlohonolo");
        names.add("Keamogetswe");
        names.add("Tshireletso");
        names.add("Luyanda");
        names.add("Rorisang");

        System.out.println("The Names of the Big Five are :"+ names);

        //adding more names
        names.addFirst("Trust");
        names.addLast("Primo");
        names.add(3,"Tinte");

        System.out.println("The updated names are :" + names);

        //deleting names
        names.remove(3);
        System.out.println("You now have 7 names :" + names);

        //Accessing the Elements
        String firstName = names.getFirst();
        String lastName = names.getLast();
        String nameAtIndex = names.get(3);

        System.out.println("First name : " + firstName);
        System.out.println("Last name : " + lastName);
        System.out.println("Name at Index : " + nameAtIndex);

        //Iterating names
        ListIterator<String> iterator = names.listIterator();

        while(iterator.hasNext()){

            System.out.println(iterator.next());
        }
        System.out.println("The iterator wordes");
    }
}