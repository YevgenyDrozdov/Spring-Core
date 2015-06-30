package javaconfig.aspects;

public class DatabaseServiceImpl implements DatabaseService {

    @Override
    @Transactional
    public void storeUser(User user) {
        System.out.println("Storing the user " + user.getName() + "...");
    }

}
