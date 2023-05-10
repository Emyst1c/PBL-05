public class ContaPoupanca extends Conta {
    public ContaPoupanca(float saldo)
    {
        super(saldo);
    }

    @Override
    public void mostrarSaldo()
    {
        System.out.println("Saldo: " + saldo);
        System.out.println("Rendimento de 0.5%: " + saldo*0.5);
        System.out.println("Saldo com o Rendimento: " + saldo + (saldo*0.5));
    }
}
