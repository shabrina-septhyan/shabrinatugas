public class Student {
    public class student extends person {

        private String major;
        private int studentNumber;
        private String score;
    
        public student(String name, int age, String gender, String major, int studentNumber, String score) {
            super(name , age, gender);
            this.major = major;
            this.studentNumber = studentNumber;
            this.score = score;
        }
    
        public String getMajor() {
            return major;
        }
    
        public void setMajor(String major) {
            this.major = major;
        }
    
        public int getStudentNumber() {
            return studentNumber;
        }
    
        public void setStudentNumber(int studentNumber) {
            this.studentNumber = studentNumber;
        }
    
        public String getScore() {
            return score;
        }
    
        public void setScore(String score) {
            this.score = score;
        }
    
        public void print() {
            System.out.println("Major : " + major);
            System.out.println("Student Number : " + studentNumber);
            System.out.println("Score : " + score);
        }
    }
}
