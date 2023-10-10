public class Main {
    public static void main(String[] args) {
        Land deutschland = new EU("Deutschland", "Berlin", "Mitglied");
        Land china = new Asia("China", "Peking", 1400);

        System.out.println("Informationen über Deutschland:");
        deutschland.beschreiben();

        System.out.println("\nInformationen über China:");
        china.beschreiben();
    }
}