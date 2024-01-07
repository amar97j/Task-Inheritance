public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Fursa");

        String[] skill = { "computer skills", "communication skills" };

        Employee Amar = new Employee("Amar", "IT", 2000.0);
        Director Yara = new Director("Yara", "HR", 4000, 1000);
        Engineer Ali = new Engineer("Ali", "HR", 10000, skill);
        Manager Hussain = new Manager("Hussain", "IT", 3000, 40);
        SalesPerson Abdullah = new SalesPerson("Abduallah", "HR", 2000, 100);

        System.out.println(Amar);
        System.out.println(Yara);
        System.out.println(Ali);
        System.out.println(Hussain);
        System.out.println(Abdullah);

    }
}
