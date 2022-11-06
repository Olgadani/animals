public class Main {
    public static void main(String[] args) {
       Herbivores gazelle = new Herbivores(2,"gazelle", "prairie", 90,"grass");
       Herbivores giraffe = new Herbivores(3,"giraffe", "Africa", 50,"trees");
       Herbivores horse = new Herbivores(2,"horse", "all over", 40,"grass");
       Predator hyena = new Predator(2, "hyena", "Africa", 40, "meat");
       Predator tiger = new Predator(3, "tiger", "Asia", 40, "meat");
       Predator bear = new Predator(4, "bear", "forest", 30, "all");
        Amphibians frog = new Amphibians(1, "frog", "swamp");
        Notflying peacock = new Notflying(3, "peacock", "Asia", "notflying");
        Notflying penguin = new Notflying(4, "penguin", "Antarktida", "notflying");
        Notflying dodoBird = new Notflying(3, "dodo bird", "nowhere", "notflying");
        Flying seagull = new Flying(3, "seagull", "", "flying");
        Flying albatross = new Flying(5, "albatross", "", "flying");
        Flying falcon = new Flying(4, "falcon", "", "flying");

        System.out.println(gazelle);
        gazelle.graze();
        gazelle.move();
        System.out.println(giraffe);
        System.out.println(horse);
        System.out.println(hyena);
        System.out.println(tiger);
        System.out.println(bear);
        System.out.println(frog);
        System.out.println(peacock);
        System.out.println(penguin);
        System.out.println(dodoBird);
        System.out.println(seagull);
        System.out.println(albatross);
        System.out.println(falcon);
    }
}