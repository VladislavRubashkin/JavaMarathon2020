package day17.chess2;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] chessPieces = new ChessPiece[8];
        for (int i = 0; i < chessPieces.length; i++) {
            chessPieces[i] = ChessPiece.PAWN_WHITE;
            if (i >= 4){
                chessPieces[i] = ChessPiece.ROOK_BLACK;
            }
        }

        System.out.println(Arrays.toString(chessPieces));
    }
}
