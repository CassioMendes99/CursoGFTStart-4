package one.digitalinnovation.gof.Singleton;

public class Test {

    public static void main(String[] args) {
        SingletonLazy lazy=new SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy=new SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager=new SingletonEager.getInstancia();
        System.out.println(eager);
        eager=new SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder=new SingletonLazyHolder().getInstancia();
        System.out.println(lazyHolder);
        lazyHolder=new SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

    }
}
