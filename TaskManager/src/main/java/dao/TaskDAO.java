package dao;

import dto.TaskDTO;
import util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TaskDAO {

	public List<TaskDTO> getAllTasks() {
	    List<TaskDTO> list = new ArrayList<>();
	    String sql = "SELECT * FROM tasks";
	    
	    System.out.println("Tentando conectar ao banco...");
	    
	    try (Connection conn = DBConnection.getConnection();
	         Statement stmt = conn.createStatement();
	         ResultSet rs = stmt.executeQuery(sql)) {

	        System.out.println("Conexão estabelecida com sucesso!");
	        
	        while (rs.next()) {
	            TaskDTO task = new TaskDTO();
	            task.setId(rs.getInt("id"));
	            task.setTitulo(rs.getString("titulo"));
	            task.setDescricao(rs.getString("descricao"));
	            list.add(task);
	            
	            System.out.println("Tarefa encontrada: " + task.getTitulo());
	        }

	    } catch (SQLException e) {
	        System.err.println("Erro ao buscar tarefas:");
	        e.printStackTrace();
	    }

	    System.out.println("Total de tarefas encontradas: " + list.size());
	    return list;
	}
    public void addTask(TaskDTO task) {
        String sql = "INSERT INTO tasks (titulo, descricao) VALUES (?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, task.getTitulo());
            stmt.setString(2, task.getDescricao());
            int rows = stmt.executeUpdate();
            System.out.println("Tarefa adicionada! Linhas afetadas: " + rows);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public TaskDTO getTaskById(int id) {
        String sql = "SELECT * FROM tasks WHERE id = ?";
        TaskDTO task = null;

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                task = new TaskDTO();
                task.setId(rs.getInt("id"));
                task.setTitulo(rs.getString("titulo"));
                task.setDescricao(rs.getString("descricao"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return task;
    }

    public void updateTask(TaskDTO task) {
        String sql = "UPDATE tasks SET titulo = ?, descricao = ? WHERE id = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, task.getTitulo());
            stmt.setString(2, task.getDescricao());
            stmt.setInt(3, task.getId());
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteTask(int id) {
        String sql = "DELETE FROM tasks WHERE id = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
