import java.util.Scanner;
public class Owner {
    String name;
    String address;
    int age;
    String sex;
    String phone;
    DogClass dog;

    public Owner(String name, String address, int age, String sex, String phone) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.sex = sex;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getAddress() { return address; }

    public String getPhone() {
        return phone;
    }

    public String toString() {
        return "Owner: " + name + "\n" +
                sex + "\n" +
                age + " year/s old" + "\n" +
                address + "\n" +
                phone + "\n" +
                "\n" +
                dog.toString();
    }

    public void bDay() {
        age = age + 1;
    }

    public String phoneChange() {
        String Temp = phone;
        System.out.println("Enter new number");
        Scanner keyboard = new Scanner(System.in);
        String Text = keyboard.nextLine();
        phone = Text;
        return "Old phone number> " + Temp +
                "\n";
    }

    public String addressChange() {
        String temp = address;
        System.out.println("Enter new address");
        Scanner keyboard = new Scanner(System.in);
        String text = keyboard.nextLine();
        address = text;
        return "old address> " + temp +
                "\n";
    }

}
