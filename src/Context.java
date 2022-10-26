package src;

public class Context {

    private Strategy strategy;

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public double executeStrategy(double x, double y){
        return this.strategy.executar(x,y);
    }

}
