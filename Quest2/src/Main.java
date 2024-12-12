public class Main {
    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca(101, "Sávio");

        contaPoupanca.depositar(1000);
        System.out.println("Saldo depois do depósito:");
        contaPoupanca.exibirSaldo();

        contaPoupanca.reajustar(10);
        System.out.println("Saldo depois do reajuste de 10%:");
        contaPoupanca.exibirSaldo();
    }
}