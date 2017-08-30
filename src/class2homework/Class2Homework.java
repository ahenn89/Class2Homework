package class2homework;

/**
 *
 * @author Ashlee
 */
public class Class2Homework {
    private String firstName;
    private String lastName;
    private int age;
    
    //Get
    public String getfirstName() {
        return firstName;
    }
    
    public String getlastName() {
        return lastName;
    }
    
    public int getAge() {
        return age;
    }
    //set
    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
   public void johnObject() {
        firstName = "John";
        lastName = "Object";
        age = 25;
   }
   
   public void maryObject() {
       firstName = "Mary";
       lastName = "Object";
       age = 26;
   }
   
    
}
