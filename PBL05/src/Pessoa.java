import java.util.ArrayList;

public class Pessoa {
    public ArrayList<Conta> pConta = new ArrayList<>();
    private String conta;
    private float saldo;

    public Pessoa(String conta, float saldo)
    {
        this.conta = conta;
        this.saldo = saldo;
        if(conta == "Corrente")
        {
            this.pConta.add(new ContaCorrente(saldo));
        }
        else if(conta == "Poupanca")
        {
            this.pConta.add(new ContaPoupanca(saldo));
        }
    }

    public void depositar(int id, float valor)
    {
        pConta.get(id).saldo += valor;
    }

    public float getSaldo(int id)
    {
        return pConta.get(id).saldo;
    }
}
