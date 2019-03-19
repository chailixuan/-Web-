import com.salary.FunctionsOfMysql;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by ASUS on 2019/1/13.
 */
@WebServlet(name = "SearchSalaryInfoServlet")
public class SearchSalaryInfoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html");
        String str=request.getParameter("sss");//获取搜索框输入的内容
        ServletContext application=getServletContext();
        ArrayList info=(ArrayList) application.getAttribute("info");
        FunctionsOfMysql func=new FunctionsOfMysql();
        ArrayList SalaryInfo=new ArrayList();
        try{
            SalaryInfo=func.SearchSalaryByAdmin(str,info.get(6).toString());
        }catch (SQLException e){
            e.printStackTrace();
        }
        application.setAttribute("salaryinfo",SalaryInfo);
        request.getRequestDispatcher("/salarypageadmin.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
