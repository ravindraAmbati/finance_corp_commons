package corp.finance.commons.customer.service;

import corp.finance.commons.customer.model.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getAllCustomers();

    List<Customer> getCustomers(List<String> userIds);

    Customer getCustomer(String userId);
}
