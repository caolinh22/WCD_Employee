package service;

import entity.Employee;
import repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    private EmployeeRepository employeeRepository; // model

    public EmployeeService() {
        this.employeeRepository = new EmployeeRepository();
    }

    public static boolean create(Employee obj) {
        // mã hoá password
        return EmployeeRepository.save(obj);
    }

    public List<Employee> getList(){
        return new ArrayList<>();
    }
}
