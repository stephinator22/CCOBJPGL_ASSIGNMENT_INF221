public class App {
    public static void main(String[] args) throws Exception {

        // Create object from pet class
        CatPet myPet = new CatPet();

        myPet.purr();
        System.out.println(myPet.eyecolor);
        System.out.println(myPet.face);
        System.out.println(myPet.ears);
        System.out.println(myPet.head);
    }
}