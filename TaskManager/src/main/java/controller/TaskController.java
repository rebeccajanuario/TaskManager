package controller;

import dao.TaskDAO;
import dto.TaskDTO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet("/TaskController")
public class TaskController extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TaskDAO dao;

    @Override
    public void init() {
        dao = new TaskDAO();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");

        if (action == null) {
            response.sendRedirect("listTasks.jsp");
            return;
        }

        switch (action) {
            case "add":
                String titulo = request.getParameter("titulo");
                String descricao = request.getParameter("descricao");

                TaskDTO newTask = new TaskDTO();
                newTask.setTitulo(titulo);
                newTask.setDescricao(descricao);
                dao.addTask(newTask);
                response.sendRedirect("listTasks.jsp");
                break;

            case "update":
                int id = Integer.parseInt(request.getParameter("id"));
                String tituloUpdate = request.getParameter("titulo");
                String descricaoUpdate = request.getParameter("descricao");

                TaskDTO updatedTask = new TaskDTO(id, tituloUpdate, descricaoUpdate);
                dao.updateTask(updatedTask);
                response.sendRedirect("listTasks.jsp");
                break;

            case "delete":
                int idDelete = Integer.parseInt(request.getParameter("id"));
                dao.deleteTask(idDelete);
                response.sendRedirect("listTasks.jsp");
                break;

            default:
                response.sendRedirect("listTasks.jsp");
        }
    }
}
