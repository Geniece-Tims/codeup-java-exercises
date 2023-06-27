import java.util.List;

public class ArraysExercises {
        // private static PersonE[] addPerson (PersonE[]  people, PersonE person) {
        // newArray[newArray.length - 1] = person;
        // return newArray;
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);
        // Arrays.toString() is important because it will return a string representation of the array.

        // Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.
        String[] persons = {"sam", "kayla", "brian"};
        for (int i = 0; i < persons.length; i += 1) {
            System.out.println(persons[i]);
        }
        // Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.
        String[] newPerson = new String[4];
        for (int i = 0; i < persons.length; i += 1) {
            newPerson[i] = persons[i];
        }
        newPerson[newPerson.length - 1] = "michelle";
        for (String person : newPerson) {
            System.out.println(person);
        }
        // PersonE[] people = new PersonE[3];
        // people[0] = new PersonE("Jim");
        // people[1] = new PersonE("Tim");
        // people[2] = new PersonE("Vim");

        // for (PersonE person : people) {
        //     System.out.println(person.getName());
        //    }
        // people = addPerson(people, new PersonE("Penelope"));

    }

}
