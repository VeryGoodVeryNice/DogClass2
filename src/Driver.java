public class Driver {
    public static void main(String[] args) {
        DogClass dog1 = new DogClass("Lucy",7,"female", "border collie", "black and white", false);
        DogClass dog2 = new DogClass("Max",1,"male", "golden retriever", "caramel", true);

        Owner own1 = new Owner("Walter White","308 Negra Arroyo Lane",51, "male", "(505) 117-8987");
        Owner own2 = new Owner("Bing Chilling", "96 Xue Hue Street", 10, "female", "123-321 9669");
        own1.dog = dog1;

        dog1.HungerChange();
        dog1.bDay();

        //
        System.out.println(" ");
        //
        own1.addressChange();
        System.out.println(own1);
    }
}
