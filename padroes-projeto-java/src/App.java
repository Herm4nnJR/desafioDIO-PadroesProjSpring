import one.dio.gof.Singleton.SingletonEager;
import one.dio.gof.Singleton.SingletonLazy;
import one.dio.gof.Singleton.SingletonLazyHolder;
import one.dio.gof.facade.Facade;
import one.dio.gof.strategy.Comportamento;
import one.dio.gof.strategy.ComportamentoAgressivo;
import one.dio.gof.strategy.ComportamentoDefensivo;
import one.dio.gof.strategy.ComportamentoNormal;
import one.dio.gof.strategy.Robo;

public class App {
    public static void main(String[] args) throws Exception {

        //Singleton---------------------------------------------------

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);

        //Strategy-----------------------------------------------------

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();

        //Facade--------------------------------------------------------

        Facade facade = new Facade();
        facade.migrarCliente("Lucas", "80650310");
    }
}
