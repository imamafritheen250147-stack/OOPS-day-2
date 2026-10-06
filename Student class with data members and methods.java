class Student {
    int rollNo;
    String name;
    int marks;

    void setData(int r, String n, int m) {
        rollNo = r;
        name = n;
        marks = m;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Student s = new Student();

        s.setData(101, "Imam", 85);
        s.display();
    }
}
