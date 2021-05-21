package controller;

import service.EmployeeService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ListEmployee extends HttpServlet {
    private EmployeeService employeeService = new EmployeeService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("listEmployee", employeeService.getList());
        req.getRequestDispatcher("/employee/list.jsp").forward(req, resp);
    }
}
