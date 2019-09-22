package atmXMLConfigWithDB;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configDatabasePackage.xml");
        ATMSimulator atmSimulator = context.getBean("ATMSimulator", ATMSimulator.class);

        atmSimulator.run();

//        Map<Integer, Customer> c ;
//        ReadDataSource reader = new ReadFromDatabaseJDBC();
//        try {
//            c = reader.readCustomers();
//            System.out.println(c);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        ReadFromFile dataSource = new ReadFromFile("customers.txt");
//        Bank bank = new Bank(dataSource);
//        ATM atmNormalConfigWithDB = new ATM(bank);
//        ATMSimulator atmSimulator = new ATMSimulator(atmNormalConfigWithDB);

//        atmSimulator.run();

    }
}
