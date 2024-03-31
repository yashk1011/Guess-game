package Game;

public class Game {
    int botGuess;
    Player p1,p2,p3;

    public Game(String n1, String n2, String n3){
            p1=new Player(n1);
            p2=new Player(n2);
            p3=new Player(n3);
    }
    private boolean checkWinner(){
        if(p1.guess==this.botGuess){
            System.out.println(p1.name+" wins.");
            return true;
        }
        else if(p2.guess==this.botGuess){
            System.out.println(p2.name+" wins");
            return true;
        }
        else if(p3.guess==this.botGuess){
            System.out.println(p3.name+" wins");
            return true;
        }
        else return false;
    }
    void launch(){
        System.out.println("Welcome to the game");
        this.botGuess=(int)(Math.random()*9)+1;

        while(true){
            System.out.println("Computer guessed " + this.botGuess);
            p1.makeGuess();
            p2.makeGuess();
            p3.makeGuess();

            if(checkWinner()){
                System.out.println("Game Over");
                break;
            }
            else{
                this.botGuess=(int)(Math.random()*9)+1;
            }
        }
    }
}
