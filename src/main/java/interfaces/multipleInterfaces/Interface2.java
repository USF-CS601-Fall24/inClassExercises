package interfaces.multipleInterfaces;

public interface Interface2 {
    default void doSomething() {
        System.out.println("doSomething: interface2");
    }
    void doSomething2();

}
