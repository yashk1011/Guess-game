package Game;

public class Player {
    String name;
    int guess;

    public Player(String name) {
        this.name = name;
    }
    void makeGuess(){
        this.guess=(int)(Math.random()*9)+1;
        System.out.println(this.name+" guessed "+this.guess);
    }

}
