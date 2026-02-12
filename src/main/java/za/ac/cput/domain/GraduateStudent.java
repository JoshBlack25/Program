package za.ac.cput.domain;

public class GraduateStudent extends Student{
    private boolean researchAssistant;
    private double stipend;

    private GraduateStudent(Builder builder){
        super(builder.studentId, builder.name, builder.email, builder.department);
        this.researchAssistant = builder.researchAssistant;
        this.stipend = builder.stipend;
    }

    @Override
    public double calculateTuition(){
        double baseTuition = 2000;
        if (researchAssistant){
            return baseTuition - stipend;
        }
        return baseTuition;
    }

    @Override
    public String getStudentType(){
        return "Graduate Student";
    }

    @Override
    public void displayStudentDetails(){
        System.out.println("Student Type: "+getStudentType());
        System.out.println("ID: "+studentId);
        System.out.println("Name: "+name);
        System.out.println("Email: "+email);
        System.out.println("Department: "+department);
        System.out.println("Research Assistant: "+researchAssistant);
        System.out.println("Stipend: "+stipend);
        System.out.println("Tuition: "+calculateTuition());
        System.out.println("----------------------------");
    }

    //  Simple Builder
    public static class Builder{
        private String studentId;
        private String name;
        private String email;
        private String department;
        private boolean researchAssistant;
        private double stipend;

        public Builder setStudentId(String studentId) {
            this.studentId = studentId;
            return this;
        }
        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }
        public Builder setDepartment(String department) {
            this.department = department;
            return this;
        }
        public Builder setResearchAssistant(boolean researchAssistant){
            this.researchAssistant = researchAssistant;
            return this;
        }
        public Builder setStipend(double stipend){
            this.stipend = stipend;
            return this;
        }
        public GraduateStudent build(){
            return new GraduateStudent(this);
        }
    }
}
