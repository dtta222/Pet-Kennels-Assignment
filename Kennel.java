public class Kennel {

    //private modifiers
    private final int iD;
    private Dog crateOne;
    private Dog crateTwo;
    private Dog crateThree;

    //constructor //assign iD variable
    Kennel(int iD) {
        this.iD = iD;
    }
    //check if the crate has been assigned
    public boolean addDog (Dog dog) {
        //check crate 1
        if (dog == null){
            return false;
        } if (crateOne == null) {
            crateOne = dog;
            return true;
        } else {
            if (crateOne.equals(dog)) {
                return false;
            }
        }
        //check crate 2
        if (crateTwo == null) {
            crateTwo = dog;
            return true;
        } else {
            if (crateTwo.equals(dog)) {
                return false;
            }
        }
        //check crate 3
        if (crateThree == null) {
            crateThree = dog;
            return true;
        }
        else {
            if (crateThree.equals(dog)) {
                return false;
            }
        }
        return false;
    }
    //creates a String and returns the string
    public String toString() {

        System.out.println("\nCrateOne-Name: "+ crateOne.getName());
        System.out.println("CrateOne-Age: "+ crateOne.getAge() + " YEARS");
        System.out.println("CrateOne-LicenseTag: "+ crateOne.getLicenseTagNumber());

        System.out.println("\nCrateTwo-Name: "+ crateTwo.getName());
        System.out.println("CrateTwo-Age: "+ crateTwo.getAge() + " YEARS");
        System.out.println("CrateTwo-LicenseTag: "+ crateTwo.getLicenseTagNumber());

        System.out.println("\nCrateThree-Name: "+ crateThree.getName());
        System.out.println("CrateThree-Age: "+ crateThree.getAge() + " YEARS");
        System.out.println("CrateThree-LicenseTag: "+ crateThree.getLicenseTagNumber());

        return null;
    }
    //return iD
    public String getID() {
        //System.out.println();
        return "Kennel iD: " + this.iD;
    }
    //return crate count
    public int getFilledCrateCnt() {
        int cntr = 0;
        if (crateOne != null) {
            cntr++;
        }
        if (crateTwo != null) {
            cntr++;
        }
        if (crateThree != null) {
            cntr++;
        }
        return cntr;
    }





}
