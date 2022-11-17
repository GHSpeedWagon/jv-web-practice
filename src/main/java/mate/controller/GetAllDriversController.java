package mate.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mate.lib.Injector;
import mate.model.Driver;
import mate.service.DriverService;

@WebServlet(urlPatterns = "/drivers")
public class GetAllDriversController extends HttpServlet {
    private static final Injector injector = Injector.getInstance("mate");

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        DriverService driverService = (DriverService) injector.getInstance(DriverService.class);
        List<Driver> allDrivers = driverService.getAll();
        req.setAttribute("drivers", allDrivers);
        req.getRequestDispatcher("/WEB-INF/views/drivers/getAllDrivers.jsp").forward(req, resp);
    }
}
