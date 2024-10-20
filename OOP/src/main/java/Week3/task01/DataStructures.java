package Week3.task01;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DataStructures {
    private List<TaskItem> tasks;

    public DataStructures() {
        tasks = new ArrayList<>(Arrays.asList(
                new TaskItem(1, "Push lab code to the GitHub", Status.TO_DO),
                new TaskItem(2, "Prepare for the quiz", Status.IN_PROGRESS),
                new TaskItem(3, "Go over tasks from lab2", Status.COMPLETED)
        ));
    }

    public List<TaskItem> getAllTasks() {
        return tasks;
    }

    public List<TaskItem> getByStatus(Status status) {
        return tasks.stream()
                .filter(task -> task.getTaskStatus() == status)
                .collect(Collectors.toList());
    }

    public List<TaskItem> findTasksById(int id) {
        return tasks.stream()
                .filter(task -> task.getTaskId() >= id)
                .collect(Collectors.toList());
    }

    public void printTaskDescriptions() {
        tasks.forEach(task -> System.out.println(task.getTaskDescription()));
    }
}

