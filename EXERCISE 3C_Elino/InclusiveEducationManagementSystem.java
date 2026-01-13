public class InclusiveEducationManagementSystem {

    // Student
    static class Student {
        private int studentId;
        private String name;
        private String disability;

        public Student(int studentId, String name, String disability) {
            this.studentId = studentId;
            this.name = name;
            this.disability = disability;
        }

        public int getStudentId() {
            return studentId;
        }
        public void setStudentId(int studentId) {
            this.studentId = studentId;
        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public String getDisability() {
            return disability;
        }
        public void setDisability(String disability) {
            this.disability = disability;
        }

        public void showStudent() {
            System.out.println("Student ID   : " + studentId);
            System.out.println("Name         : " + name);
            System.out.println("Disability   : " + disability);
        }
    }

    // Teacher
    static class Teacher {
        private int teacherId;
        private String name;
        private String specialization;

        public Teacher(int teacherId, String name, String specialization) {
            this.teacherId = teacherId;
            this.name = name;
            this.specialization = specialization;
        }

        public int getTeacherId() {
            return teacherId;
        }
        public void setTeacherId(int teacherId) {
            this.teacherId = teacherId;
        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public String getSpecialization() {
            return specialization;
        }
        public void setSpecialization(String specialization) {
            this.specialization = specialization;
        }

        public void showTeacher() {
            System.out.println("Teacher ID   : " + teacherId);
            System.out.println("Name         : " + name);
            System.out.println("Specialty    : " + specialization);
        }
    }

    // Support Service
    static class SupportService {
        private int serviceId;
        private String serviceName;
        private String description;

        public SupportService(int serviceId, String serviceName, String description) {
            this.serviceId = serviceId;
            this.serviceName = serviceName;
            this.description = description;
        }

        public int getServiceId() {
            return serviceId;
        }
        public void setServiceId(int serviceId) {
            this.serviceId = serviceId;
        }

        public String getServiceName() {
            return serviceName;
        }
        public void setServiceName(String serviceName) {
            this.serviceName = serviceName;
        }

        public String getDescription() {
            return description;
        }
        public void setDescription(String description) {
            this.description = description;
        }

        public void showService() {
            System.out.println("Service ID   : " + serviceId);
            System.out.println("Service Name : " + serviceName);
            System.out.println("Description  : " + description);
        }
    }

    // Main Method
    public static void main(String[] args) {

        Student student = new Student(1, "Juan Dela Cruz", "Visual Impairment");
        Teacher teacher = new Teacher(101, "Maria Santos", "Special Education");
        SupportService service = new SupportService(201, "Learning Support", "Provides learning assistance for students with special needs");

        student.showStudent();
        System.out.println();

        teacher.showTeacher();
        System.out.println();

        service.showService();
    }
}
