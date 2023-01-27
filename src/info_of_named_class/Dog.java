package info_of_named_class;

 class Dog {
     static class DogModifier {
     }
    public String name = "Fluffy";
    private int age = 10;
    short ears = 2;

    public Dog (){
    }

    private Dog(int age) {
        this.age = age;
    }

    public Dog(String name, int age, short ears) {
        this.name = name;
        this.age = age;
        this.ears = ears;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public short getEars() {
        return ears;
    }

    public void setEars(short ears) {
        this.ears = ears;
    }
}
