import com.salary.FunctionsOfMysql;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet(name = "AddOneStaffServlet")
public class AddOneStaffServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html");
        String id=request.getParameter("sid");
        String name=request.getParameter("sname");
        String password=request.getParameter("spassword");
        String sex=request.getParameter("ssex");
        String age=request.getParameter("sage");
        String phone =request.getParameter("sphone");
        String dep=request.getParameter("dname");
        ArrayList info=new ArrayList();
        info.add(id);
        info.add(name);
        info.add(password);
        info.add(sex);
        info.add(age);
        info.add(phone);
        info.add(dep);
        FunctionsOfMysql func=new FunctionsOfMysql();
        int flag=0;
        try {
            flag=func.AddOneStaff(info);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if(flag==1)request.getRequestDispatcher("/servlet/StaffChartServlet").forward(request,response);
        else
            ;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
