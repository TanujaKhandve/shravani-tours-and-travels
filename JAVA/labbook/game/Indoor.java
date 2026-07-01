package game;

public class Indoor {
    String gameName;
    int numPlayers;
    
    // Default constructor
    public Indoor() {
        this.gameName = "Chess";
        this.numPlayers = 2;
    }
    
    // Parameterized constructor
    public Indoor(String gameName, int numPlayers) {
        this.gameName = gameName;
        this.numPlayers = numPlayers;
    }
    
    public void display() {
        System.out.println("\n*** Indoor Game Details ***");
        System.out.println("Game Name: " + gameName);
        System.out.println("Number of Players: " + numPlayers);
        System.out.println("List of Players:");
        for(int i = 1; i <= numPlayers; i++) {
            System.out.println("  Player " + i);
        }
    }
}