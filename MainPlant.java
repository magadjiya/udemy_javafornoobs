public class MainPlant {
    public static void main(String[] args) {
        Flower hibiscus = new Flower("Hibiscus", null, "Flower", 1);
        Tree citrus = new Tree("Lemon", "Citron", "Tree", 5);

        System.out.println(hibiscus.getName() + ", " + hibiscus.getSpecies() + ", " + hibiscus.getType() + ", " + hibiscus.getAge());
        System.out.println(citrus.getName() + ", " + citrus.getSpecies() + ", " + citrus.getType() + ", " + citrus.getAge());
    }
}
