package game;

public class Outdoor {
    String gameName;
    int numPlayers;
    
    // Default constructor
    public Outdoor() {
        this.gameName = "Cricket";
        this.numPlayers = 11;
    }
    
    // Parameterized constructor
    public Outdoor(String gameName, int numPlayers) {
        this.gameName = gameName;
        this.numPlayers = numPlayers;
    }
    
    public void display() {
        System.out.println("\n*** Outdoor Game Details ***");
        System.out.println("Game Name: " + gameName);
        System.out.println("Number of Players: " + numPlayers);
        System.out.println("List of Players:");
        for(int i = 1; i <= numPlayers; i++) {
            System.out.println("  Player " + i);
        }
    }
}