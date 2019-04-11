import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SimpleCalculatorServlet",urlPatterns = "/calculate")
public class SimpleCalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float firstOperand = Float.parseFloat(request.getParameter("FirstOperand"));
        float secondOperand = Float.parseFloat(request.getParameter("SecondOperand"));
        String operator = request.getParameter("Operator");

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<br/>");
        writer.println("First Operand: "+firstOperand);
        writer.println("<br/>");
        writer.println("Second Operand: "+secondOperand);
        writer.println("<br/>");
        switch (operator){
            case "ADDITION":
                writer.println("Operator: "+operator);
                writer.println("<br/>");
                writer.println("Result: "+ (firstOperand + secondOperand));
                break;
            case "SUBTRACTION":
                writer.println("Operator: "+operator);
                writer.println("<br/>");
                writer.println("Result: "+ (firstOperand - secondOperand));
                break;
            case "MULTIPLICATION":
                writer.println("Operator: " + operator);
                writer.println("<br/>");
                writer.println("Result: "+ (firstOperand * secondOperand));
                break;
            case "DIVISION":
                writer.println("Operator: " + operator);
                writer.println("<br/>");
                writer.println("Result: "+ (firstOperand / secondOperand));
                break;
        }
        writer.println("<html/>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
