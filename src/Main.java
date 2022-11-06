import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "O seu extrato está sendo impresso! ");

        Cliente michael = new Cliente();
        michael.setNome("Michael");

        Conta cc = new ContaCorrente(michael);
        Conta cp = new ContaPoupanca(michael);

        cc.depositar(1000);
        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
        JOptionPane.showMessageDialog(null, "Seu extrato foi impresso com sucesso");
    }
}




