public class Course {
    private String name;
    private Instructor instructor;
    private Textbook textbook;

    public Course(String name, Instructor instructor, Textbook textbook) {
        this.name = name;
        this.instructor = instructor;
        this.textbook = textbook;
    }

    public void print() {
        System.out.println(name + " Taught By: " + instructor.getFirstName() + " " + instructor.getLastName() + ", Office: " + instructor.getOfficeNumber() + ", Book: " + textbook.getTitle() + " By " + textbook.getAuthor());
    }
}
