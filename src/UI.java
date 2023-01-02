import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI extends JFrame implements ActionListener{
    public UI(){
        //definindo configurações da tela
        setTitle("Teste");
        setVisible(true);
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);

        JLabel text = new JLabel("Deseja continuar?");
        text.setFont(new Font("Arial", Font.BOLD, 15));
        text.setBounds(350, 50, 150, 50);
        add(text);

        //criando botões
        JButton sim = new JButton("sim");
        sim.setBounds(250, 200, 100, 50);
        sim.addActionListener(actionSim);
        add(sim);

        JButton nao = new JButton("não");
        nao.setBounds(450, 200, 100, 50);
        nao.addActionListener(actionNao);
        add(nao);


    }

    ActionListener actionSim = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "OK");
        }
    };

    ActionListener actionNao = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Que tistreza");
        }
    };

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
