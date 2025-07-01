public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public String findCustomerById(String id) {
        if (id.equals("C101")) {
            return "Customer: Vasu, ID: C101, Email: Vasu@email.com";
        } else {
            return "Customer not found.";
        }
    }
}
