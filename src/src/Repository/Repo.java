package Repository;

import Entities.Medikamente;
import Entities.Patienten;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Repo<T> implements IRepository<T> {
    private final AtomicInteger idcount = new AtomicInteger(0);
    private Map<Integer, T> map = new HashMap<Integer, T>();


    @Override
    public void create(T obj) {
        int id = idcount.incrementAndGet();
        if (obj instanceof Medikamente) {
            ((Medikamente) obj).setId(id);
        } else if (obj instanceof Patienten){
            ((Patienten) obj).setId(id);
        }
        map.putIfAbsent(id, obj);
    }

    @Override
    public void update(int id, T newObj) {
        map.replace(id, newObj);
    }

    @Override
    public void delete(int id) {
        map.remove(id);
    }

    @Override
    public T get(int id) {
        return map.get(id);
    }

    @Override
    public List<T> getAll() {
        return new ArrayList<>(map.values());
    }
}