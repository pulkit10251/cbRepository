package com.company.GameDevelopment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends JFrame implements ActionListener {
    public static int Board_SIZE=3;

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton=(JButton)e.getSource();
        makeMove(clickedButton);
        GameStatus gs=this.getGameStatus();
        if(gs==GameStatus.Incomplete){
            return;
        }
        declareWinner(gs);
    }
    private void declareWinner(GameStatus gs){
        if(gs==GameStatus.XWins){
            JOptionPane.showMessageDialog(this,"X wins");
        }else if(gs==GameStatus.Zwins){
            JOptionPane.showMessageDialog(this, "Y wins");
        }else{
            JOptionPane.showMessageDialog(this, "Tie");
        }
    }
    private void makeMove(JButton clickedButton){
        String btntext=clickedButton.getText();
        if(btntext.length()>0){
            JOptionPane.showMessageDialog(this,"Invalid Move");
        }else{
            if(crossTurn){
                clickedButton.setText("X");
            }else{
                clickedButton.setText("0");
            }
            crossTurn=!crossTurn;
        }
    }
    private GameStatus getGameStatus(){
        String text1="",text2="";
        int row=0,col=0;

        row=0;
        while(row<Board_SIZE){
            col=0;
            while (col<Board_SIZE-1){
                text1=buttons[row][col].getText();
                text2=buttons[row][col+1].getText();
                if(!text1.equals(text2) || text1.length()==0){
                    break;
                }
                col++;
            }
            if(col==Board_SIZE-1){
                if(text1.equals("X")){
                    return GameStatus.XWins;
                }else{
                    return GameStatus.Zwins;
                }
            }
            row++;
        }

        col=0;
        while(col<Board_SIZE){
            row=0;
            while (row<Board_SIZE-1){
                text1=buttons[row][col].getText();
                text2=buttons[row+1][col].getText();
                if(!text1.equals(text2) || text1.length()==0){
                    break;
                }
                row++;
            }
            if(row==Board_SIZE-1){
                if(text1.equals("X")){
                    return GameStatus.XWins;
                }else{
                    return GameStatus.Zwins;
                }
            }
            col++;
        }

        row=0;
        col=0;
        while(row<Board_SIZE-1){
            text1=buttons[row][col].getText();
            text2=buttons[row+1][col+1].getText();
            if(!text1.equals(text2) || text1.length()==0){
                break;
            }
            row++;
            col++;

        }
        if(row==Board_SIZE-1){
            if(text1.equals("X")){
                return GameStatus.XWins;
            }else{
                return GameStatus.Zwins;
            }
        }


        row=Board_SIZE-1;
        col=0;
        while(row>0){
            text1=buttons[row][col].getText();
            text2=buttons[row-1][col+1].getText();
            if(!text1.equals(text2) || text1.length()==0){
                break;
            }
            row--;
            col++;

        }
        if(row==0){
            if(text1.equals("X")){
                return GameStatus.XWins;
            }else{
                return GameStatus.Zwins;
            }
        }

        String txt="";
        for(row=0;row<Board_SIZE;row++){
            for(col=0;col<Board_SIZE;col++){
                txt=buttons[row][col].getText();

                if(txt.length()==0){
                    return GameStatus.Incomplete;
                }
            }
        }

        return GameStatus.Tie;
    }

    public static enum GameStatus{
        Incomplete,XWins,Zwins,Tie
    }

    private JButton[][] buttons=new JButton[Board_SIZE][Board_SIZE];

    boolean crossTurn=true;


    public TicTacToe(){
       super.setTitle("TicTacToe");
       super.setSize(800,800);
       GridLayout grid=new GridLayout(Board_SIZE,Board_SIZE);
       super.setLayout(grid);
       Font font=new Font("Comic Sans",1,150);
       for(int row =0;row<Board_SIZE;row++){
           for(int col=0;col<Board_SIZE;col++){
               JButton button=new JButton("");
               buttons[row][col]=button;
               button.setFont(font);
               button.addActionListener(this);
               super.add(button);
           }
       }
       super.setResizable(false);
       super.setVisible(true);

    }
}