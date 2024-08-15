package studentmarksmanagement;

import java.util.*;

public class Task1 {
    static Scanner scanner = new Scanner(System.in);

    static List<Integer> marksList = new ArrayList<>();


    static void addStudentData() {
        System.out.println("Enter number of students: ");
        int number = scanner.nextInt();

        System.out.println("Enter marks of students (Press Enter after every data): ");
        while (number > 0) {
            int marks = scanner.nextInt();
            marksList.add(marks);
            number--;
        }
    }

    static void seeStudentData() {
        if(isListEmpty()) {
            return;
        }
        System.out.println(marksList);
    }

    static void calculateAverage() {
        if(isListEmpty()) {
            return;
        }

        int sum = 0;
        for(int data: marksList) {
            sum += data;
        }

        float average = (float) sum / marksList.size();
        System.out.println("Average score is: " + average);
    }

    static void calculateHighest() {
        if(isListEmpty()) {
            return;
        }

        int max = Collections.max(marksList);
        System.out.println("Highest score is: " + max);
    }

    static void calculateLowest() {
        if(isListEmpty()) {
            return;
        }

        int min = Collections.min(marksList);
        System.out.println("Lowest score is: " + min);
    }

    static boolean isListEmpty() {
        if(marksList.size() == 0) {
            System.out.println("No data!");
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int option = 0;

        System.out.println("************************");
        System.out.println("STUDENT MARKS MANAGEMENT");
        System.out.println("************************");

        while(option != 6) {
            System.out.println(
                    "\n1. Add Student Data\n" + "2. See Students' Data\n" + "3. Calculate Average\n" +
                            "4. Calculate Highest Score\n" + "5. Calculate Lowest Score\n" + "6. Exit\n"
            );
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1: addStudentData();
                        break;
                case 2: seeStudentData();
                        break;
                case 3: calculateAverage();
                        break;
                case 4: calculateHighest();
                        break;
                case 5: calculateLowest();
                        break;
                case 6: System.out.println("Goodbye!");
                        break;
                default: System.out.println("Invalid option!");
            }
        }
    }
}
