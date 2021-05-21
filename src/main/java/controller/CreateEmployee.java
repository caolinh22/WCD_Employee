package controller;

import entity.Employee;
import service.EmployeeService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

public class CreateEmployee extends HttpServlet {
    private Employee employee = new Employee();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/employee/employee.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // khắc phục lỗi utf8 ở view.
        req.setCharacterEncoding("UTF-8");
        String id = req.getParameter("id");
        String fullName = req.getParameter("fullName");
        String address = req.getParameter("address");
        String birthday = req.getParameter("birthday");
        String position = req.getParameter("position");
        String department = req.getParameter("department");
        Employee employee = new Employee(id, fullName, address,birthday,position, department );
        // validate
        if(!employee.isValid()){
            HashMap<String, String> errors = employee.getErrors();
            req.setAttribute("errors", errors);
            req.getRequestDispatcher("/employee/employee.jsp").forward(req, resp);
        }
        EmployeeService.create(employee);
        resp.sendRedirect("/employee/list.jsp");
    }
}
