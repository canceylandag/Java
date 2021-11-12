package C_F_HW;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cfGui extends JFrame {
    float realResult=0;
    JButton bt1;
    JLabel jlb;
    JTextField tf;
    JTextField tf2;


    JRadioButton [] teams= new JRadioButton[2];

    class myclickEventListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
        float num1,num2;

        if(teams[0].isSelected()){

            num1=Float.parseFloat(tf.getText());
            realResult=(num1*9.0f/5.0f)+32.0f;
            tf2.setText("Result is "+String.valueOf(realResult)+" F degree.");

        }else if(teams[1].isSelected()){
            num2=Float.parseFloat(tf.getText());
            realResult=(5.0f/9.0f)*(num2-32.0f);
            tf2.setText("Result is "+String.valueOf(realResult)+" C degree.");
        }

        }


    }

    public cfGui(){

        init();

    }
    private void addComponent(){
        JPanel panel= new JPanel();
        teams[0]= new JRadioButton("From C to F",true);
        teams[1]=new JRadioButton("From F to C");
        jlb=new JLabel("Enter the number in order to convert.");
        tf=new JTextField(15);
        bt1=new JButton("Convert");
        bt1.addActionListener(new myclickEventListener());
        ButtonGroup gg=new ButtonGroup();
        for(int i=0;i<2;i++){
            gg.add(teams[i]);
            panel.add(teams[i]);
        }
        tf2=new JTextField(50);
        add(jlb);
        add(tf);
        add(panel);
        add(bt1);
        add(tf2);
    }

    private void init(){
        this.setTitle("Hello World.");
        this.setSize(300,300);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        addComponent();


    }

    public static void main(String[]args){


        cfGui mygui=new cfGui();



    }
}
