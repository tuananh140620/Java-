package Constructor;

public class Main {
    public static void main(String[] args) {
        Student student1= new Student("Nguyen Tuan Anh", 22);
        System.out.println(student1.getName()+student1.getAge());
        Student student2= new Student("Ivan Tony", 28);
        System.out.println(student2.getName()+student1.getAge());
    }
}
