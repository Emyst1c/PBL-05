public class Conta {
    public float saldo;

    public Conta(float saldo)
    {
        this.saldo = saldo;
    }

    public void depositar(float valor)
    {
        saldo += valor;
    }

    public void mostrarSaldo()
    {
        System.out.println("Saldo: " + saldo);
    }
}
