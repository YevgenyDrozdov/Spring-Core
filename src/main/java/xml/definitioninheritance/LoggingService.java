package xml.definitioninheritance;

public class LoggingService extends AbstractService {

    @Override
    public void execute() {
        getRepository().create("00", "value");
        getRepository().read("00");
    }

}
