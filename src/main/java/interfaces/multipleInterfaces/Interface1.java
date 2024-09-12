package interfaces.multipleInterfaces;

public interface Interface1 {
    default void doSomething() {
        System.out.println("doSomething: interface1");
    }
    void doSomething1();

}
