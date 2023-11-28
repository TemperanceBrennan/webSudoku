package com.wsudoku.websudoku.models;

import lombok.Data;

@Data
public class BoardDTO {

    public char[][] boardCells = new char[9][9];


    public BoardDTO(Character[][] boardCells) {
        for (int i=0;i<9;i++)
            for (int j=0;j<9;j++)
                this.boardCells[i][j]=boardCells[i][j];
    }

    public BoardDTO() {
        for (int i=0;i<9;i++)
            for (int j=0;j<9;j++)
                this.boardCells[i][j]='.';
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n[\n");
        for (int i=0;i<9;i++) {
            sb.append('[');
            sb.append(this.boardCells[i][0]);
            for (int j = 1; j < 9; j++) {
                sb.append(' ');
                sb.append(this.boardCells[i][j]);
            }
            sb.append("]\n");
        }
        sb.append("]\n");
        return sb.toString();
    }
}
