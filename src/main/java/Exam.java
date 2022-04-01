public class Exam extends Grades{

    public void registGradeToSubject(String subject, int grade) {
        String gradeToString = Integer.toString(grade);
        for (int i = 0; i < student.size();i++){
            if (student.get(i)[0] == subject && student.get(i)[1] != null){
                student.get(i)[1] = gradeToString;
            }
            else
            if (student.get(i)[0] == subject){
                student.get(i)[1] = gradeToString;
            }
        }
    }
}
