package atmXMLConfigWithDB.Strategy;

import atmXMLConfigWithDB.Model.Customer;

import java.io.IOException;
import java.util.Map;

public interface ReadDataSource {
    public Map<Integer, Customer> readCustomers() throws IOException;
}
