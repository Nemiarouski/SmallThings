package project.patterns.abstractfactory.entity;

public interface AbstractFactory {
    Librarian getLibrarian();
    Teacher getTeacher();
    Manager getManager();
}