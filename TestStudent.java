public class TestStudent {
    public static void main(String[] args) {
        Student students = new Student("Lucas Henrique", "Rua Ipanema", "Sintetic Data", 1996, 100);
        System.out.println(students.toString());

        students.setAddress("Rua White Fluff");
        students.setProgram("Sinestesy Human");
        students.setYear(2002);
        students.setFee(500);

        System.out.println("Name: "+students.getName());
        System.out.println("Address: "+students.getAddress());
        System.out.println("Program: "+students.getProgram());
        System.out.println("Year: "+students.getYear());
        System.out.println("Fee: "+students.getFee());
    }
}