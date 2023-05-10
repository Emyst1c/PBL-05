import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        Veiculo carro = new Carro();
        Veiculo moto = new Moto();
        carro.acelerar();
        moto.acelerar();

        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        cachorro.fazerBarulho();
        gato.fazerBarulho();

        Pessoa pessoa1 = new Pessoa("Corrente", 150.50f);
        Pessoa pessoa2 = new Pessoa("Poupanca", 210f);
        System.out.println(pessoa1.getSaldo(0));
        System.out.println(pessoa2.getSaldo(0));
        pessoa1.depositar(0, 96.20f);
        System.out.println(pessoa1.getSaldo(0));

        Calculadora calc = new Calculadora();
        System.out.println(calc.somar1(18, 32));
        List<Integer> list1 = new ArrayList<>();
        list1.add(17);
        list1.add(45);
        System.out.println(calc.somar2(list1));

        System.out.println(calc.subtrair1(74, 23));
        List<Integer> list2 = new ArrayList<>();
        list2.add(68);
        list2.add(45);
        System.out.println(calc.subtrair2(list2));

        System.out.println(calc.multiplicar1(2, 45));
        List<Integer> list3 = new ArrayList<>();
        list3.add(5);
        list3.add(13);
        System.out.println(calc.multiplicar2(list3));

        System.out.println(calc.dividir1(56, 4));
        List<Integer> list4 = new ArrayList<>();
        list4.add(86);
        list4.add(2);
        System.out.println(calc.dividir2(list4));
    }
}