package atmXMLConfigWithDB;

import java.util.List;

public interface CustomerDataAccessObject {
    void save(Customer customer);
    void update(int id, Customer customer);
    void deleteById(int id);
    Customer findById(int id);
    List<Customer> findAll();
}


