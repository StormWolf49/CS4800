public class Test {
    public static void main(String[] args) {
        Instructor ND = new Instructor("Nima", "Davarpanah", "3-2636");
        Textbook CC = new Textbook("Clean Code", "Robert C. Martin", "Pearson");
        Course SE = new Course("CS 4800", ND, CC);
        Instructor JM = new Instructor("Joe", "Mama", "7-420");
        Textbook UC = new Textbook("Ugly Code", "Bob Ross", "McGraw Hill");
        Course CT = new Course("CS 1400", JM, UC);
        Instructor MH = new Instructor("Mike", "Hawk", "6-969");
        Textbook SC = new Textbook("Stupid Code", "Hugh Janus", "Wiley");
        Course PU = new Course("CS 3600", MH, SC);
        SE.print();
        CT.print();
        PU.print();
    }
}
