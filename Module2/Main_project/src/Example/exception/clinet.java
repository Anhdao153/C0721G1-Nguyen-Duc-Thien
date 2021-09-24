package Example.exception;

public class clinet {
    private int age;
    private String name;
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public clinet(int age) throws UserException{
    //    if (age)
        this.age = age;
    }

    @Override
    public String toString() {
        return "clinet{" +
                "age=" + age +
                '}';
    }
}
