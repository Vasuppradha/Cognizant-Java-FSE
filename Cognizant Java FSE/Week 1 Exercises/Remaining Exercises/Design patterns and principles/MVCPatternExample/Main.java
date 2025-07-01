public class Main {
    public static void main(String[] args) {
        Student student = new Student("Divya", "S101", "A");

        StudentView view = new StudentView();

        StudentController controller = new StudentController(student, view);

        controller.updateView();

        controller.setStudentName("Vasu");
        controller.setStudentGrade("A+");

        System.out.println("\n After Update:");
        controller.updateView();
    }
}
