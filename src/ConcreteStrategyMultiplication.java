package src;

public class ConcreteStrategyMultiplication implements Strategy {

    @Override
    public double executar(double x, double y) {
        return x * y;
    }
}
