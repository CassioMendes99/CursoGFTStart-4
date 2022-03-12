package one.digitalinnovation.gof.Singleton;

/**
 *  Single "Lazy Holder"
 *
 * @see
 * @author Cássio
 */
public class SingletonLazyHolder {

    private class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia(){
        return InstanceHolder.instancia;
    }

}
