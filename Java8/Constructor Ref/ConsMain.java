
public class ConsMain {
    public static void main(String[] args) {
        System.out.println("Learning const reference");
        Provider pro = () -> {
            return new Student();
        };

        Student s = pro.getStudent();
        s.display();
    }
}
