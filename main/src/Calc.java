import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc {

    //Total
    private double T1 = 0;
    private double T2 = 0;

    //Operador Matemático
    private char mathOP;

    //Botões
    private JPanel Calculadora;
    private JTextField Display;
    private JButton N2;
    private JButton N4;
    private JButton N5;
    private JButton N7;
    private JButton N8;
    private JButton N1;
    private JButton Point;
    private JButton N0;
    private JButton N9;
    private JButton N6;
    private JButton N3;
    private JButton Multiply;
    private JButton Minus;
    private JButton Plus;
    private JButton Equal;
    private JButton CLEAR;
    private JButton Divide;

    // Operador
    private void getOP (String btnText){
        mathOP = btnText.charAt(0);
        T1 = T1 + Double.parseDouble(Display.getText());
        Display.setText("");
    }



    public Calc() {

        //Botões

        N0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String N0Text = Display.getText() + N0.getText();
                Display.setText(N0Text);
            }
        });
        N1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String N1Text = Display.getText() + N1.getText();
                Display.setText(N1Text);

            }
        });
        N2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String N2Text = Display.getText() + N2.getText();
                Display.setText(N2Text);
            }
        });
        N3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String N3Text = Display.getText() + N3.getText();
                Display.setText(N3Text);
            }
        });
        N4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String N4Text = Display.getText() + N4.getText();
                Display.setText(N4Text);
            }
        });
        N5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String N5Text = Display.getText() + N5.getText();
                Display.setText(N5Text);
            }
        });
        N6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String N6Text = Display.getText() + N6.getText();
                Display.setText(N6Text);
            }
        });
        N7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String N7Text = Display.getText() + N7.getText();
                Display.setText(N7Text);
            }
        });
        N8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String N8Text = Display.getText() + N8.getText();
                Display.setText(N8Text);
            }
        });
        N9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String N9Text = Display.getText() + N9.getText();
                Display.setText(N9Text);
            }
        });





        // +
        Plus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String btnText = Plus.getText();
                getOP(btnText);
            }
        });

        // -
        Minus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String btnText = Minus.getText();
                getOP(btnText);
            }
        });

        // *
        Multiply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String btnText = Multiply.getText();
                getOP(btnText);
            }
        });

        // /
        Divide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String btnText = Divide.getText();
                getOP(btnText);
            }
        });

        // =
        Equal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switch (mathOP){
                    case '+':
                        T2 = T1 + Double.parseDouble(Display.getText());
                        break;
                    case '-':
                        T2 = T1 - Double.parseDouble(Display.getText());
                        break;
                    case '*':
                        T2 = T1 * Double.parseDouble(Display.getText());
                        break;
                    case '/':
                        T2 = T1 / Double.parseDouble(Display.getText());
                        break;
                }
                Display.setText(Double.toString(T2));
                T1 = 0;
            }
        });

        // C
        CLEAR.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                T2 = 0;
                Display.setText("");
            }
        });

        // .
        Point.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Display.getText().isEmpty()) {
                    Display.setText("0.");
                }
                else if (Display.getText().contains(".")) {
                    Point.setEnabled(false);
                }
                else {
                    String PointText = Display.getText() + Point.getText();
                    Display.setText(PointText);
                }
            }
        });

    }



    public static void main(String[] args){
            JFrame frame = new JFrame("Calculadora");
            frame.setContentPane(new Calc().Calculadora);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
    }

}