package unnamed;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        List<Person> personList = new ArrayList<Person>();
        while(true) {
//        	enter and validate name
            System.out.println("Input Person name");
            String inputName = scanner.nextLine();
            while(inputName == null || inputName.length()<3) {
            	System.out.println("incorrect name, your name should be more than 3 symbols");
            	 inputName = scanner.nextLine();
            }
//            enter and validate age
            System.out.println("Input Person age");
            int inputAge;
            while (true)
                try {
                    inputAge = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException nfe) {
                    System.out.print("Try again: ");
                }
            
            System.out.println("Input Person email");
            String inputEmail = scanner.nextLine();
            personList.add(new Person(inputName,inputAge,inputEmail));
            for (Person person : personList) {
              System.out.println(person);
          }
//            if (inputLine == "9") 
//                break;
//            String[] personFields = inputLine.split(";");
//            Person person;
//            if (3 == personFields.length) {
//                person = new Person(personFields[0], personFields[1], personFields[2]);
//                System.out.println("Tu wel chuvaka" + person);
//                chuvakList.add(person);
//            } else {
//                System.out.println("Wodi v zayavlennom formate");
//            }
        }
//        for (Person person : chuvakList) {
//            System.out.println(person);
//        }
    }

    

}
