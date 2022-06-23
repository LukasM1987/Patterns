package com.patterns.observer.homework;

public class Mentor implements Observer {

    private final String name;
    private int count;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(TaskQueue taskQueue) {
        System.out.println(name + ": New task from student: " + taskQueue.getStudent() + "\n" +
                " (total: " + taskQueue.getTasks().size() + " tasks.)");
        count++;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }
}
