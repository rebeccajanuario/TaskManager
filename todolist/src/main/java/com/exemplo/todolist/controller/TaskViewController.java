// Crie este novo arquivo: src/main/java/com/exemplo/todolist/controller/TaskViewController.java

package com.exemplo.todolist.controller;

import com.exemplo.todolist.model.Task;
import com.exemplo.todolist.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/") // Este controller responderá pela raiz da aplicação
public class TaskViewController {

    @Autowired
    private TaskService taskService;

    // Exibe a página principal com todas as tarefas
    @GetMapping
    public String showTaskList(Model model) {
        model.addAttribute("tasks", taskService.getAllTasks());
        return "index"; // Retorna o nome do arquivo: index.html
    }

    // Exibe o formulário para criar uma nova tarefa
    @GetMapping("/tasks/new")
    public String showNewTaskForm(Model model) {
        model.addAttribute("task", new Task());
        return "new_task"; // Retorna o nome do arquivo: new_task.html
    }

    // Processa a criação da nova tarefa
    @PostMapping("/tasks")
    public String addTask(@ModelAttribute Task task) {
        taskService.createTask(task);
        return "redirect:/"; // Redireciona para a página principal
    }

    // Exibe os detalhes de uma tarefa
    @GetMapping("/tasks/{id}")
    public String showTaskDetails(@PathVariable Long id, Model model) {
        Task task = taskService.getTaskById(id)
                .orElseThrow(() -> new IllegalArgumentException("Tarefa inválida Id:" + id));
        model.addAttribute("task", task);
        return "task_detail"; // Retorna o nome do arquivo: task_detail.html
    }

    // Exibe o formulário para editar uma tarefa
    @GetMapping("/tasks/edit/{id}")
    public String showEditTaskForm(@PathVariable Long id, Model model) {
        Task task = taskService.getTaskById(id)
                .orElseThrow(() -> new IllegalArgumentException("Tarefa inválida Id:" + id));
        model.addAttribute("task", task);
        return "edit_task"; // Retorna o nome do arquivo: edit_task.html
    }

    // Processa a atualização da tarefa
    @PostMapping("/tasks/update/{id}")
    public String updateTask(@PathVariable Long id, @ModelAttribute Task task) {
        task.setId(id); // Garante que o ID correto seja usado na atualização
        taskService.updateTask(task);
        return "redirect:/"; // Redireciona para a página principal
    }

    // Processa a exclusão da tarefa
    @PostMapping("/tasks/{id}")
    public String deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return "redirect:/"; // Redireciona para a página principal
    }
}