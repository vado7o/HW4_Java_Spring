package pudov.vadim.homeWork4;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Component
public class UserRepository {
    private AtomicLong counter = new AtomicLong();
    private Map<Long, User> users = new ConcurrentHashMap<>(){{
        put(counter.incrementAndGet(), new User(counter.get(),"Vasiliy Ivanov", 22, "vas91@mail.ru"));
        put(counter.incrementAndGet(), new User(counter.get(),"Ivan Petrov", 33, "ivy84@yandex.ru"));
        put(counter.incrementAndGet(), new User(counter.get(),"Liza Skatova", 17, "liz00@mail.ru"));}};

    public List<User> getUsers() {
        return new ArrayList<>(users.values());
    }
    public User findById(Long id) {
        return users.get(id);
    }
    public User addUser(User user) {
        users.put(counter.incrementAndGet(), user);
        return user;
    }
}
