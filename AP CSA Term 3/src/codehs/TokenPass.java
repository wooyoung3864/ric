package codehs;

public class TokenPass {
    private int[] board;
    private int currentPlayer;

    public TokenPass(int playerCount) {
        board = new int[playerCount];
        currentPlayer = (int) (Math.random() * playerCount) ;
        for(int i = 0; i < board.length; ++i) {
            board[i] = (int) (Math.random() * 10) +1;
        }
    }

    public void distributeCurrentPlayerTokens() {
        int tokens = board[currentPlayer];
        board[currentPlayer] = 0;
        int index = currentPlayer + 1;
        while(tokens > 0) {
            if(index == board.length)
                index = 0;
            board[index]++;
            tokens--;
            index++;
        }

    }

    public static void main(String[] args) {
        TokenPass test = new TokenPass(4);
        test.distributeCurrentPlayerTokens();
    }
}
