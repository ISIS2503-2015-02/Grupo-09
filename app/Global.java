import play.Application;
import play.GlobalSettings;

public class Global extends GlobalSettings {
    @Override
    public void onStart(Application app) {
        // Método vacio, usado únicamente para evitar problemas al configurar
        // el pool de threads.
    }
}
