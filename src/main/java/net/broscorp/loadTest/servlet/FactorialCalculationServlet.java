package net.broscorp.loadTest.servlet;

import java.io.IOException;
import java.math.BigInteger;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculate")
public class FactorialCalculationServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws IOException {
    BigInteger argument = BigInteger.valueOf(Long.parseLong(request.getParameter("argument")));

    BigInteger result = BigInteger.ONE;

    while (!argument.equals(BigInteger.ZERO)) {
      result = result.multiply(argument);
      argument = argument.subtract(BigInteger.ONE);
    }
    response.getWriter().write(String.valueOf(result));
  }
}
