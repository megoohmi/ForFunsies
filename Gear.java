public class Gear {
    
    String name;
    int defense;
    float weight;
    String description;
    String rarity;
    Boolean hasElementalResistance;

    public void showGearDescription() {
        System.out.println("description: " + description);
    }
    public void sayMyDefense() {
        System.out.println("My boot's defense is " + defense);
    }
}
