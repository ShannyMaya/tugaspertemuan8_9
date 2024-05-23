public class Uji {
    public static void main(String[] args) {
        Person person = new Person("Ari", "Jl. Merdeka 123", "08123456789", "ari@gmail.com");
        Student student = new Student("Aria", "Jl. Merdeka 124", "08123456788", "aria@gmail.com", Student.SENIOR);
        Employee employee = new Employee("Bayu", "Jl. Merdeka 125", "08123456787", "bayu@gmail.com", 
                "Kantor 101", 5000000, new MyDate(2020, 5, 15));
        Faculty faculty = new Faculty("Cici", "Jl. Merdeka 126", "08123456786", "cici@gmail.com", "Kantor 102", 
                6000000, new MyDate(2018, 3, 10), "9-5", "Profesor");
        Staff staff = new Staff("Dani", "Jl. Merdeka 127", "08123456785", "dani@gmail.com", "Kantor 103", 
                4500000, new MyDate(2021, 7, 20), "Manajer");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
