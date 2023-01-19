public class DogClass {
    String name;
    int age;
    String sex;
    String breed;
    String color;
    boolean hungry;

    public DogClass(String name, int age, String sex, String breed, String color, boolean hungry) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.breed = breed;
        this.color = color;
        this.hungry = hungry;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getBreed() {
        return breed;
    }
    public String getSex() {
        return sex;
    }
    public String getColor() {
        return color;
    }
    public boolean getHungry() {
        return hungry;
    }

    public String toString() {
        String h;
        if(this.hungry == false)
            h = "not hungry";
        else
            h = "hungry";

        return "Dog: " + name + "\n" +
                sex + "\n" +
                age + " year/s old" + "\n" +
                color + " " + breed + "\n" +
                h;
    }
    public void bDay() {
        age = age + 1;
    }
    public void HungerChange() {
        if (hungry == false)
            hungry = true;
        else
            hungry = false;
    }
}

