package designPatterns.chainOfResponsibility.ATM;

public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);
    void dispense(Currency curr);
}