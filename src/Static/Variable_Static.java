package Static;

public class Variable_Static {
    public static class Student9 {
        int rollno;
        String name;
        static String college = "FPT University";

        static void change() {
            // Thay đổi thuộc tính static (thuộc tính chung của tất cả các đối tượng)
            college = "Đại Học Công Nghệ";
        }

        Student9(int r, String n) {
            rollno = r;
            name = n;
        }

        void display() {
            System.out.println(rollno + " - " + name + " - " + college);
        }

        public static void main(String args[]) {
            Student9.change();

            Student9 s1 = new Student9(111, "Thông");
            Student9 s2 = new Student9(222, "Minh");
            Student9 s3 = new Student9(333, "Anh");

            s1.display();
            s2.display();
            s3.display();
        }
    }
}
