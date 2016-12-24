package dinis.demidenko;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Face {
    int znak = 1;
    int rangeFirst = 5;
    int rangeEnd = 12;
    double a1 = Math.random() * (rangeEnd - rangeFirst) + rangeFirst;
    double b1 = Math.random() * (rangeEnd - rangeFirst) + rangeFirst;
    int a = (int) a1;
    int b = (int) b1;
    Logic logicObj = new Logic();
    JFrame frame = new JFrame("Game");
    JFrame frameDia = new JFrame("Вибір дії");
    JLabel priklad = new JLabel(a + " + " + b + " = ");
    JTextArea text = new JTextArea();
    JLabel status = new JLabel("Welcome");
    JLabel rangeOne = new JLabel(rangeFirst + "");
    JLabel rangeTwo = new JLabel(rangeEnd + "");
    JButton butDia = new JButton("Вибрати дію");
    JButton butDiaPlus = new JButton("Додавання");
    JButton butDiaMnog = new JButton("Множення");
    JButton butDiaMinus = new JButton("Віднімання");
    JButton butDiaDiv = new JButton("Ділення");
    JButton butROneMinus = new JButton("<<");
    JButton butROnePlus = new JButton(">>");
    JButton butRTwoMinus = new JButton("<<");
    JButton butRTwoPlus = new JButton(">>");
    JButton butOne = new JButton("1");
    JButton butTwo = new JButton("2");
    JButton butThree = new JButton("3");
    JButton butFour = new JButton("4");
    JButton butFive = new JButton("5");
    JButton butSix = new JButton("6");
    JButton butSeven = new JButton("7");
    JButton butEight = new JButton("8");
    JButton butNine = new JButton("9");
    JButton butNull = new JButton("0");
    JButton butResult = new JButton("Перевірка");
    void face(){
        frame.setSize(500, 600);
        frame.setLayout(null);
        frameDia.setSize(300, 500);
        frameDia.setLayout(null);
        butDiaPlus.setBounds(30, 30, 210, 50);
        butDiaPlus.setFont(new Font("�������", Font.PLAIN, 30));
        frameDia.add(butDiaPlus);
        butDiaMnog.setBounds(30, 90, 210, 50);
        butDiaMnog.setFont(new Font("�������", Font.PLAIN, 30));
        frameDia.add(butDiaMnog);
        butDiaMinus.setBounds(30, 150, 210, 50);
        butDiaMinus.setFont(new Font("�������", Font.PLAIN, 30));
        frameDia.add(butDiaMinus);
        butDiaDiv.setBounds(30, 210, 210, 50);
        butDiaDiv.setFont(new Font("�������", Font.PLAIN, 30));
        frameDia.add(butDiaDiv);
        butDia.setBounds(255, 490, 210, 50);
        butDia.setFont(new Font("�������", Font.PLAIN, 30));
        frame.add(butDia);
        priklad.setBounds(50, 50, 400, 110);
        priklad.setFont(new Font("�������", Font.PLAIN, 60));
        frame.add(priklad);
        status.setBounds(100, 10, 400, 80);
        status.setFont(new Font("�������", Font.PLAIN, 40));
        frame.add(status);

        if ( logicObj.a > 9 | logicObj.b > 9){
            text.setBounds(300, 65, 100, 80);
        }else{
            text.setBounds(260, 65, 100, 80);
        }
        text.setFont(new Font("�������", Font.PLAIN, 60));
        text.setBackground(new Color(220, 220, 220));
        text.setEditable(false);
        text.setVisible(false);
        frame.add(text);
        rangeOne.setBounds(325, 20, 20, 20);;
        rangeOne.setFont(new Font("�������", Font.PLAIN, 16));
        rangeOne.setBackground(new Color(220, 220, 220));
        frame.add(rangeOne);
        rangeTwo.setBounds(400, 20, 20, 20);;
        rangeTwo.setFont(new Font("�������", Font.PLAIN, 16));
        rangeTwo.setBackground(new Color(220, 220, 220));
        frame.add(rangeTwo);
        butDiaPlus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                znak = 1;
                a1 = Math.random() * (rangeEnd - rangeFirst) + rangeFirst;
                b1 = Math.random() * (rangeEnd - rangeFirst) + rangeFirst;
                a = (int)a1;
                b = (int)b1;
                priklad.setText(a + " + " + b + " = ");
                frameDia.setVisible(false);
                frameDia.setVisible(false);
            }
        });
        butDiaMnog.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                znak = 2;
                a1 = Math.random() * (rangeEnd - rangeFirst) + rangeFirst;
                b1 = Math.random() * (rangeEnd - rangeFirst) + rangeFirst;
                a = (int)a1;
                b = (int)b1;
                priklad.setText(a + " * " + b + " = ");
                frameDia.setVisible(false);
            }
        });
        butDiaMinus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                znak = 4;
                for(;true;){
                    a1 = Math.random() * (rangeEnd - rangeFirst) + rangeFirst;
                    b1 = Math.random() * (rangeEnd - rangeFirst) + rangeFirst;
                    a = (int)a1;
                    b = (int)b1;
                    if(a >= b){
                        priklad.setText(a + " - " + b + " = ");
                        frameDia.setVisible(false);
                        break;
                    }
                }
            }
        });
        butDiaDiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                znak = 3;
                for(;true;){
                    a1 = Math.random() * (rangeEnd - rangeFirst) + rangeFirst;
                    b1 = Math.random() * (rangeEnd - rangeFirst) + rangeFirst;
                    a = (int)a1;
                    b = (int)b1;
                    double a11 = a;
                    double b11 = b;
                    double temp = a11 / b11;
                    if( a11 > b11 & temp % 1 == 0){
                        priklad.setText(a + " // " + b + " = ");
                        frameDia.setVisible(false);
                        break;
                    }
                }
            }
        });
        butROneMinus.setBounds(310, 0, 50, 20);
        frame.add(butROneMinus);
        butROnePlus.setBounds(310, 40, 50, 20);
        frame.add(butROnePlus);
        butRTwoMinus.setBounds(385, 0, 50, 20);
        frame.add(butRTwoMinus);
        butRTwoPlus.setBounds(385, 40, 50, 20);
        frame.add(butRTwoPlus);
        createBut(butOne, 40, 180);
        createBut(butTwo, 150, 180);
        createBut(butThree, 260, 180);
        createBut(butFour, 40, 240);
        createBut(butFive, 150, 240);
        createBut(butSix, 260, 240);
        createBut(butSeven, 40, 300);
        createBut(butEight, 150, 300);
        createBut(butNine, 260, 300);
        createBut(butNull, 40, 360);
        butDia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frameDia.setVisible(true);
            }
        });
        butResult.setBounds(150, 360, 210, 50);
        butResult.setFont(new Font("�������", Font.PLAIN, 30));
        frame.add(butResult);
        butOne.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText() + "1");
                priklad.setText(priklad.getText() + "1");
            }

        });
        butTwo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText() + "2");
                priklad.setText(priklad.getText() + "2");
            }

        });
        butThree.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText() + "3");
                priklad.setText(priklad.getText() + "3");
            }
        });
        butFour.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText() + "4");
                priklad.setText(priklad.getText() + "4");
            }
        });
        butFive.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText() + "5");
                priklad.setText(priklad.getText() + "5");
            }
        });
        butSix.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText() + "6");
                priklad.setText(priklad.getText() + "6");
            }
        });
        butSeven.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText() + "7");
                priklad.setText(priklad.getText() + "7");
            }
        });
        butEight.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText() + "8");
                priklad.setText(priklad.getText() + "8");
            }
        });
        butNine.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText() + "9");
                priklad.setText(priklad.getText() + "9");
            }
        });
        butNull.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText() + "0");
                priklad.setText(priklad.getText() + "0");
            }
        });
        butROneMinus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                rangeFirst = rangeFirst - 1;
                metodRes(znak, 0);
                rangeOne.setText(rangeFirst + "");
            }
        });
        butROnePlus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                rangeFirst = rangeFirst + 1;
                metodRes(znak, 0);
                rangeOne.setText(rangeFirst + "");
            }
        });
        butRTwoMinus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                rangeEnd = rangeEnd - 1;
                metodRes(znak, 0);
                rangeTwo.setText(rangeEnd + "");
            }
        });
        butRTwoPlus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                rangeEnd = rangeEnd + 1;
                metodRes(znak, 0);
                rangeTwo.setText(rangeEnd + "");
            }
        });
        butResult.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String t = text.getText();
                if (t.equals("")){
                    status.setText("Пусто");
                }else{
                    int x = Integer.parseInt(t);

                    if(znak == 1){
                        if (x == a + b){
                            metodRes(znak, 1);
                            priklad.setText(a + " + " + b + " = ");
                        }else{
                            ex();
                            priklad.setText(a + " + " + b + " = ");
                        }
                    }else if(znak == 2){
                        if (x == a * b){
                            metodRes(znak, 1);
                            priklad.setText(a + " * " + b + " = ");
                        }else{
                            ex();
                            priklad.setText(a + " * " + b + " = ");
                        }
                    }else if(znak == 3){
                        if (x == a / b){
                            metodRes(znak, 1);
                        }else{
                            ex();
                            priklad.setText(a + " / " + b + " = ");
                        }
                    }else if(znak == 4){
                        if (x == a - b){
                            metodRes(znak, 1);
                        }else {
                            ex();
                            priklad.setText(a + " - " + b + " = ");
                        }
                    }
                }
            }
        });
        frame.setVisible(true);
    }
    void createBut(JButton but, int x, int y){
        but.setBounds(x, y, 100, 50);
        but.setFont(new Font("�������", Font.PLAIN, 50));
        frame.add(but);
    }
    void ex(){
        status.setText("Не вірно!");
        status.setForeground(new Color(205, 0, 0));
        text.setText("");
    }
    void metodRes(int z, int r){
        if(r == 1){
            status.setText("Вірно!");
            status.setForeground(new Color(34, 139, 34));
            text.setText("");
        }
        for(;true;){
            a1 = Math.random() * (rangeEnd - rangeFirst) + rangeFirst;
            b1 = Math.random() * (rangeEnd - rangeFirst) + rangeFirst;
            a = (int)a1;
            b = (int)b1;
            double a11 = a;
            double b11 = b;
            if ( a > 9 | b > 9){
                text.setBounds(300, 65, 100, 80);
            }else{
                text.setBounds(260, 65, 100, 80);
            }
            if(z == 1){
                priklad.setText(a + " + " + b + " = ");
                break;
            }else if(z == 2){
                priklad.setText(a + " * " + b + " = ");
                break;
            }else if(z == 3){
                double temp = a11 / b11;
                if(a > b & temp % 1 == 0){
                    priklad.setText(a + " / " + b + " = ");
                    break;
                }
            }else if(z == 4){
                if(a >= b){
                    priklad.setText(a + " - " + b + " = ");
                    break;
                }
            }
        }
    }
}
