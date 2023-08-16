public class TestStaff {
    public static void main(String[] args) {
        Staff s = new Staff("Moraes", "Rua Liberdade", "John Hopkins University", 5000);
        System.out.println(s.toString());

        s.setAddress("Avenida Paris");
        s.setSchool("Imperial College");
        s.setPay(10000);

         System.out.println("Name: "+s.getName());
         System.out.println("Address: "+s.getAddress());
         System.out.println("School: "+s.getSchool());
         System.out.println("Pay= "+s.getPay());
    }
}
