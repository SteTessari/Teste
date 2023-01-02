import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI extends JFrame implements ActionListener {
    public UI() {
        //definindo configurações da tela
        setTitle("Teste");
        setVisible(true);
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);

        JLabel Usuario1 = new JLabel("Usuário 1:");
        setVisible(true);
        Usuario1.setFont(new Font("Arial", Font.PLAIN, 15));
        Usuario1.setBounds(100, 50, 150, 50);
        add(Usuario1);

        JLabel Usuario2 = new JLabel("Usuário 2:");
        setVisible(true);
        Usuario2.setFont(new Font("Arial", Font.PLAIN, 15));
        Usuario2.setBounds(100, 150, 150, 50);
        add(Usuario2);

        JTextField JTUsuario1 = new JTextField();
        setVisible(true);
        JTUsuario1.setVisible(true);
        JTUsuario1.setBounds(200, 63, 150, 30);
        add(JTUsuario1);

        JTextField JTUsuario2 = new JTextField();
        setVisible(true);
        JTUsuario2.setVisible(true);
        JTUsuario2.setBounds(200, 163, 150, 30);
        add(JTUsuario2);

        //criando botões

        JButton continuar = new JButton("continuar");
        setVisible(true);
        continuar.setBounds(250, 230, 100, 30);
        continuar.addActionListener(actionSim);
        add(continuar);

//        JButton sim = new JButton("sim");
//        sim.setBounds(250, 300, 100, 50);
//        sim.addActionListener(actionSim);
//        add(sim);
//
//        JButton nao = new JButton("não");
//        nao.setBounds(450, 300, 100, 50);
//        nao.addActionListener(actionNao);
//        add(nao);


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
            for (int i = 0; i < 10; i++) {
                JOptionPane.showMessageDialog(null, "QUE TISTREZA");
            }
        }
    };

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
