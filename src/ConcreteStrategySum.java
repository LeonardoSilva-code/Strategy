package src;

public class ConcreteStrategySum implements Strategy{

    @Override
    public double executar(double x, double y) {
        return x + y;
    }

}
