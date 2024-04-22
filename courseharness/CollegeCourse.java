package Assignment8;

/**
 * This class is without main method
 */
public class CollegeCourse
 {
    // State
    private int courseReferenceNumber;
    private int courseNumber;

    // Constructors
    public CollegeCourse()
     {
        // Default constructor sets both values to zero.
        this.courseReferenceNumber = 0;
        this.courseNumber = 0;
    }

    public CollegeCourse(int courseReferenceNumber, int courseNumber) 
    {
        // Constructor with two arguments.
        this.courseReferenceNumber = courseReferenceNumber;
        this.courseNumber = courseNumber;
    }

    // Getters and Setters
    public int getCourseReferenceNumber()
     {
        return courseReferenceNumber;
    }

    public void setCourseReferenceNumber(int courseReferenceNumber)
     {
        this.courseReferenceNumber = courseReferenceNumber;
    }

    public int getCourseNumber() 
    {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) 
    {
        this.courseNumber = courseNumber;
    }
}
