package sit.int202.simple.repositories;

import sit.int202.simple.entities.Subject;

import java.util.ArrayList;
import java.util.List;

public class SubjectRepository {
    private static List<Subject> subjects;
    public List<Subject> findAll(){
        return subjects;

    }
    public SubjectRepository(){
        initialize();
    }

    private void initialize(){
        subjects = new ArrayList<>(20);
        subjects.add(new Subject("INT 100","IT Fundamentals",3));
        subjects.add(new Subject("INT 101","Programming",3));
        subjects.add(new Subject("INT 102","Ux/UI",3));
        subjects.add(new Subject("INT 105","Database",3));
        subjects.add(new Subject("INT 207","Network",3));
    }
}
