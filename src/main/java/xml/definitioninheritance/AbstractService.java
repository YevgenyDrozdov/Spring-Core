package xml.definitioninheritance;

public abstract class AbstractService implements Service {
    private Repository repository;

    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    public Repository getRepository() {
        return repository;
    }
}
