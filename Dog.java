public class Dog {

    //private modifiers
    private String name, licenseTagNumber;
    private int age;

    //constructors
    Dog(){}
    //
    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //return name
    public String getName() {
        return name;
    }
    //return age
    public String getAge() {
        return Integer.toString(age);
    }
    //return license tag number
    public String getLicenseTagNumber() {
        return licenseTagNumber;
    }
    //set name
    public void setName(String name) {
        this.name = name;
    }
    //set age
    public void setAge(int age) {
        this.age = age;
    }
    //set license tag number
    public void setLicenseTagNumber(String licenseTagNumber) {
        this.licenseTagNumber = licenseTagNumber;
    }
    //check to see if the dog has already been assigned to one of the crates of the kennel
    public boolean equals(Dog dog) {
        if (dog == null)
            return false;
        if (this.getLicenseTagNumber().equals(dog.getLicenseTagNumber())) {
            return true;
        }
        return false;
    }
    //creates a String and returns the string
    public String toString() {
        return getAge() + " YEARS";
    }
}
