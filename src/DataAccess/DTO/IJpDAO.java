package DataAccess.DTO;

import java.util.List;

public interface IJpDAO<T> {

    public boolean jpCreate(T entity) throws Exception;

    public List<T> jpReadAll() throws Exception;

    public boolean jpUpdate(T entity) throws Exception;

    public boolean jpDelet(int id) throws Exception;

    public T jpReadBy(Integer id) throws Exception;
}
