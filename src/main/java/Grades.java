import java.util.ArrayList;

public class Grades {

    protected ArrayList<String[]> student = new ArrayList<>();

    public void addSubject(String subject) {
        for (int i = 0; i < student.size(); i++){
            if (subject != student.get(i)[0]){
                String[] newsubject = new String[2];
                newsubject[0] = subject;
                newsubject[1] = "";
                student.add(newsubject);
            }
        }

    }

    public void dropSubject(String subject) {
        for (int i = 0; i < student.size(); i++){
            if (student.get(i)[0] == subject){
                student.remove(i);
            }
        }
    }

    public String getGrades() {
        return student.toString();
    }
}