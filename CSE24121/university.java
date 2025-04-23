public class university {
    String name;

    class Department {
        String departmentName;
        int numberOfCourses;

        public Department(String departmentName, int numberOfCourses) {
            this.departmentName = departmentName;
            this.numberOfCourses = numberOfCourses;
        }

        void display() {
            System.out.println("Department: " + departmentName + ", Courses: " + numberOfCourses);
        }
    }

    class Student {
        String studentName;
        int studentId;

        public Student(String studentName, int studentId) {
            this.studentName = studentName;
            this.studentId = studentId;
        }

        void display() {
            System.out.println("Student Name: " + studentName + ", Student ID: " + studentId);
        }
    }

    public static void main(String[] args) {
        university uni = new university();

        Department cs = uni.new Department("Computer Science", 10);
        cs.display();

        Student s1 = uni.new Student("MAXXXXXX", 201234);
        s1.display();

        Student s2 = uni.new Student("lewis", 201252);
        s2.display();
        Student s3 = uni.new Student("Sainz", 23488);
        s3.display();
    }
}
