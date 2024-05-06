abstract class Student {
    abstract void start();
}

public class AnonymousClass {
    public static void main(String[] args) {
        Student s1 = new Student() {
            void start() {
                System.out.println("Hello Rahul");
            }
        };
        s1.start();
    }
}
