package javaconfig.aspects;

public class UserServiceImpl implements UserService {

    private DatabaseService databaseService;

    @Override
    @Transactional
    public User createUser(String name) {
        User newUser = new User();
        newUser.setName(name);
        databaseService.storeUser(newUser);
        return newUser;
    }

    public void setDatabaseService(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }
}
