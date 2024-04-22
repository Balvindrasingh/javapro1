package Assignment8;

import java.util.Random;

/**
 * This class is with main method
 */
public class CollegeCourseTestHarness
 {
    public static void main(String[] args)
     {
        // Create a two-dimensional array with 10 columns and 200 rows.
        CollegeCourse[][] coursesArray = new CollegeCourse[200][10];

        // Fill the first 100 rows with CollegeCourse objects with default values (0)
        for (int i = 0; i < 100; i++)
         {
            for (int j = 0; j < 10; j++)
             {
                coursesArray[i][j] = new CollegeCourse();
            }
        }

        // Fill the second 100 rows with CollegeCourse objects with custom default values (9999)
        for (int i = 100; i < 200; i++)
         {
            for (int j = 0; j < 10; j++)
            {
                coursesArray[i][j] = new CollegeCourse(9999, 9999);
            }
        }

        // Print out the state of each object in the array (before updating)
        printCourseData(coursesArray);

        // Set the state of each object in the array with unique values.
        setUniqueCourseData(coursesArray);

        // Print out the state of each object in the array 
        printCourseData(coursesArray);

        // Ask the user for a column and row number to print the state of the object.
        getUserInputAndPrintCourse(coursesArray);
    }

    /*
     *  Helper method to print the state of each object in the array
     */
    private static void printCourseData(CollegeCourse[][] coursesArray)
     {
        for (int i = 0; i < 200; i++) 
        {
            System.out.println("Data Set " + (i + 1));
            for (int j = 0; j < 10; j++)
             {
                System.out.println("Course [" + i + "][" + j + "]: " +
                        "Reference Number: " + coursesArray[i][j].getCourseReferenceNumber() +
                        ", Course Number: " + coursesArray[i][j].getCourseNumber());
            }
            System.out.println("------------------------------------------------");
        }
    }

    /*
     *  method to set unique data for each object in the array
     */
    private static void setUniqueCourseData(CollegeCourse[][] coursesArray)
     {
        Random random = new Random();
        for (int i = 0; i < 200; i++) {
            for (int j = 0; j < 10; j++)
             {
                // Set the course reference number to a unique 7-digit value.
                int uniqueReferenceNumber = 1000000 + (i * 10) + j;
                coursesArray[i][j].setCourseReferenceNumber(uniqueReferenceNumber);

                // Set the course number to one of four, 5-digit random course numbers.
                int[] courseNumbers = {10001, 10002, 10003, 10004};
                int randomIndex = random.nextInt(courseNumbers.length);
                coursesArray[i][j].setCourseNumber(courseNumbers[randomIndex]);
            }
        }
    }

    //  method to get user input and print the state of the corresponding object
    
    private static void getUserInputAndPrintCourse(CollegeCourse[][] coursesArray)
     {
        // Get user input for column and row number

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter the row number (0-199): ");
        int row = scanner.nextInt();
        System.out.print("Enter the column number (0-9): ");
        int column = scanner.nextInt();
        scanner.close();

        // Check if the input is within the array bounds

        if (row >= 0 && row < 200 && column >= 0 && column < 10)
         {
            System.out.println("Course [" + row + "][" + column + "]: " +
                    "Reference Number: " + coursesArray[row][column].getCourseReferenceNumber() +
                    ", Course Number: " + coursesArray[row][column].getCourseNumber());
        } 
        else 
        {
            System.out.println("Invalid row or column number. Please provide valid numbers.");
        }
    }
}
