import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TicTacToe extends JFrame implements ActionListener {
    JButton[][] buttons = new JButton[3][3];
    boolean xTurn = true;

    public TicTacToe() {
        setTitle("Tic Tac Toe");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 3));

        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].setFont(new Font("Arial", Font.PLAIN, 50));
                buttons[i][j].addActionListener(this);
                add(buttons[i][j]);
            }
        }
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        if (button.getText().isEmpty()) {
            button.setText(xTurn ? "X" : "O");
            if (checkWin()) {
                JOptionPane.showMessageDialog(this, "Player " + (xTurn ? "X" : "O") + " Wins!");
                resetBoard();
            } else if (checkDraw()) {
                JOptionPane.showMessageDialog(this, "It's a Draw");
                resetBoard();
            } else {
                xTurn = !xTurn;
            }
        }
    }

    boolean checkWin() {
        String symbol = (xTurn ? "X" : "O");
        for (int i = 0; i < buttons.length; i++) {
            if (buttons[i][0].getText().equals(symbol) && buttons[i][1].getText().equals(symbol)
                    && buttons[i][2].getText().equals(symbol) ||
                    buttons[0][i].getText().equals(symbol) && buttons[1][i].getText().equals(symbol)
                            && buttons[2][i].getText().equals(symbol)) {
                return true;
            }
        }
        return buttons[0][0].getText().equals(symbol) && buttons[1][1].getText().equals(symbol)
                && buttons[2][2].getText().equals(symbol) ||
                buttons[0][2].getText().equals(symbol) && buttons[1][1].getText().equals(symbol)
                        && buttons[2][0].getText().equals(symbol);
    }

    boolean checkDraw() {
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                if (buttons[i][j].getText().isEmpty())
                    return false;
            }
        }
        return true;
    }

    void resetBoard() {
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                buttons[i][j].setText("");
            }
        }
        xTurn = true;
    }

    public static void main(String[] args) {
        new TicTacToe();
    }
}