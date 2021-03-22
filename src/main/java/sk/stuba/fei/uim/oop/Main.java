package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.awt.*;

public class Main implements GameLostListener {

    private JLabel lost;
    private JPanel board;

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        var okno = new JFrame();
        okno.setVisible(true);
        okno.setSize(300, 300);
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        okno.setLayout(new BorderLayout());

        this.board = new JPanel();
        this.board.setLayout(new GridLayout(9, 9));

        okno.add(board, BorderLayout.CENTER);

        for (int i = 0; i < 81; i++) {
            var tile = new Tile();
            tile.addGameLostListener(this);
            this.board.add(tile);
        }

        this.lost = new JLabel("You lost!");
        this.lost.setVisible(false);
        okno.add(lost, BorderLayout.PAGE_START);
    }

    @Override
    public void gameLost() {
        this.lost.setVisible(true);
    }
}
