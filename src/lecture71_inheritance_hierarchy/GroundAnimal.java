package lecture71_inheritance_hierarchy;

public class GroundAnimal extends Animal {
    public int legsNumber;
    public int handsNumber;
    public int noseNumber;

    public void showGroundAnimalInformation() {
        System.out.println(this.legsNumber);
        System.out.println(this.handsNumber);
        System.out.println(this.noseNumber);
    }
}
