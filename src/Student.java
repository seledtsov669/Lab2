import java.util.*;

public class Student {
    int number;
    String name;
    String lastName;
    int age;
    double averageScore;
    public Student(int number, String name, String lastName, int age, double averageScore){
        this.number = number;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.averageScore = averageScore;
    }
    public int getNumber(){
        return number;
    }
    public void printInfo(Student student){
        System.out.println("Студент: " + name + " " + lastName + "\n"+  "Возраст: " + age + " лет." + "\n" + "Номер зачетки: "
                + number + "\n" + "Средний балл: " + averageScore + ".");
    }

    @Override
    public String toString() {
        return "Студент: " + name + " " + lastName + "\n"+  "Возраст: " + age + " лет." + "\n" + "Номер зачетки: "
                + number + "\n" + "Средний балл: " + averageScore + "." + "\n \n";
    }
}

class Group {
    String groupNumber;
    ArrayList<Student> group = new ArrayList<>();
    public Group(String groupNumber) {
        this.groupNumber = groupNumber;
    }
    public void addStudent(Student newStudent) {
        group.add(newStudent);
    }
    public Student getByNumber(int serialNumber) {
        for (Student i : group) {
            if (i.number == serialNumber) {
                i.printInfo(i);
            }
        }
        return null;
    }
    public void deleteStudent(Student student) {
        group.remove(student);
    }
    public List<Student> getAll() {
        return group;
    }
    public Map<Integer, Integer> getCountByAge() {
        HashMap<Integer, Integer> ageCount = new HashMap<>();
        for (Student i : group) {
            if (!ageCount.containsKey(i.age)) {
                ageCount.put(i.age, 0);
            }
            if (ageCount.containsKey(i.age)) {
                ageCount.put(i.age, ageCount.get(i.age) + 1);
            }
        }
        return ageCount;
    }
    public List<String> getByMinScore(double score) {
        List<String> getByMinScore_students = new ArrayList<>();
        for (Student i : group) {
            if (i.averageScore >= score) {
                getByMinScore_students.add(i.name);
            }
        }
        return getByMinScore_students;
    }
    public void printInfo() {
        System.out.println("Группа номер " + groupNumber + "." + " Количество студентов " + group.size() + ".");
    }
}

class Work{
    public static void main(String[] args) {
        Student Aleksandr = new Student(202636, "Aleksandr", "Seledtsov", 20, 4.9);
        Student Andrey = new Student(2, "Andrey", "Kharla", 19, 4.0);
        Student Tatyana = new Student(3, "Tatyana", "Zub", 20, 4.9);
        Student Oleg = new Student(4, "Oleg", "Mar", 21, 5.0);
        Group first = new Group("20704");
        first.addStudent(Aleksandr);
        first.addStudent(Andrey);
        first.addStudent(Tatyana);
        first.addStudent(Oleg);
        first.getByNumber(1);
        System.out.println(first.getAll());
        first.deleteStudent(Aleksandr);
        System.out.println(first.getAll());
        first.addStudent(Aleksandr);
        System.out.println(first.getCountByAge());
        System.out.println(first.getByMinScore(4.8));
        first.printInfo();
        Aleksandr.printInfo(Aleksandr);

    }
}