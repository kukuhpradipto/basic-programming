public class ManipulasiField {
    public static void main(String[] args) {

        var person1 = new Field();
        person1.name = "Kukuh";
        person1.address = "Kendal";
        person1.sayHello("Alvi");
        person1.sayHello("Laila");


        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);


    }
}
