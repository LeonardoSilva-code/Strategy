package src;

public class ConcreteStrategyDivision implements Strategy{
    @Override
    public double executar(double x, double y) {
        if (x != 0 && y != 0)
            return x / y;
        return -1;
    }
}
