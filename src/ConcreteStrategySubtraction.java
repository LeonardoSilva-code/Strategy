package src;

public class ConcreteStrategySubtraction implements Strategy{
    @Override
    public double executar(double x, double y) {
        return x - y;
    }
}
