package com.learn.web.servlets.async;

import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by dik81 on 23.01.18.
 */
@WebServlet(value = "/SubmitHandlerServlet")
public class SubmitHandlerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        try {
//            Thread.sleep(1000l);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        JSONArray array = new JSONArray();
        array.put(getJsonObject("Lena", 32));
        array.put(getJsonObject("Dima", 38));
        resp.setContentType("application/json");
        resp.getWriter().write(array.toString());
//        req.setAttribute("firstName", firstName);
//        req.setAttribute("lastName", lastName);
//        RequestDispatcher dispatcher = req.getRequestDispatcher("form.jsp");
//        dispatcher.forward(req, resp);
    }

    @NotNull
    private JSONObject getJsonObject(String firstName, int age) {
        JSONObject object = new JSONObject();
        object.put("name", firstName);
        object.put("age", age);
        return object;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        JSONArray array = new JSONArray();
        array.put(getJsonObject("Lena", 32));
        array.put(getJsonObject("Dima", 38));
        resp.setContentType("application/json");
        resp.getWriter().write(array.toString());
    }
}
