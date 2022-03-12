package one.digitalinnovation.gof.Singleton;
/**
 *  Single "Apressado"
 * @author Cássio
 */
    public class SingletonEager {

        private static SingletonEager instancia=new SingletonEager();

        private SingletonEager() {
            super();
        }

        public static SingletonEager getInstancia(){
            return instancia;
        }
}
