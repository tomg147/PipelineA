/**
 *
 * @author tgord
 */


import java.util.List;
import java.util.ArrayList;

public class Module {
    private String moduleName;
    private int moduleId;
    private List<Student> students;
    private List<Course> listCourses;

    
    public Module(String name){
        this.moduleName = name;
        this.students = new ArrayList<Student>();
        this.listCourses = new ArrayList<Course>();
       
    }
    //getters and setters
    public String getName(){
            return moduleName;
    }
    
    public void setName(String n){
        moduleName = n;
    }
    
    public int getId(){
            return moduleId;
    }
    
    public void setId(int id){
        moduleId = id;
    }
    
    public List<Student> getListStudents(){
            return students;
    }
    
    public void addStudents(Student student1){
            students.add(student1);
    
    }

    public List<Course> getListCourse(){
            return listCourses;
    }
    
    public void addCourses(Course courses){
        listCourses.add(courses);
        
    }
    
    @Override
    public String toString(){
        String str = "Name: " + moduleName + "\n" + "ID:  " + getId();
        return str;
    }
}
