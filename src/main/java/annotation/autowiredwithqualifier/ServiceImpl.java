package annotation.autowiredwithqualifier;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class ServiceImpl implements DbService {

    @Derby
    private Dao dao;

    @Override
    @PostConstruct
    public void doWork() {
        System.out.println("I'm service, I use: ");
        dao.crud();
    }
}
