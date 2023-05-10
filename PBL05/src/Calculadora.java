import java.util.ArrayList;
import java.util.List;

public class Calculadora {
    public int somar1(int x, int y)
    {
        return x + y;
    }
    public int somar2(List<Integer> x)
    {
        int y = x.stream().mapToInt(Integer::intValue).sum();
        return y;
    }

    public int subtrair1(int x, int y)
    {
        return x - y;
    }
    public int subtrair2(List<Integer> x)
    {
        int y = x.get(0) - x.get(1);
        return y;
    }

    public float multiplicar1(int x, int y)
    {
        return x * y;
    }
    public float multiplicar2(List<Integer> x)
    {
        int y = x.get(0) * x.get(1);
        return y;
    }

    public float dividir1(int x, int y)
    {
        return x / y;
    }
    public float dividir2(List<Integer> x)
    {
        int y = x.get(0) / x.get(1);
        return y;
    }
}
