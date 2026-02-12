package za.ac.cput.domain;

public class PartTimeStudent extends Student {

    private int numberOfModules;
    private double feePerModule;

    private PartTimeStudent(Builder builder) {
        super(builder.studentId, builder.name, builder.email, builder.department);
        this.numberOfModules = builder.numberOfModules;
        this.feePerModule = builder.feePerModule;
    }

    @Override
    public double calculateTuition() {
        return numberOfModules * feePerModule;
    }

    @Override
    public String getStudentType() {
        return "Part-Time Student";
    }

    @Override
    public void displayStudentDetails() {
        System.out.println("Student Type: " + getStudentType());
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Department: " + department);
        System.out.println("Number of Modules: " + numberOfModules);
        System.out.println("Fee Per Module: " + feePerModule);
        System.out.println("Tuition: " + calculateTuition());
        System.out.println("----------------------------");
    }

    // Builder
    public static class Builder {
        private String studentId;
        private String name;
        private String email;
        private String department;
        private int numberOfModules;
        private double feePerModule;

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

        public Builder setNumberOfModules(int numberOfModules) {
            this.numberOfModules = numberOfModules;
            return this;
        }

        public Builder setFeePerModule(double feePerModule) {
            this.feePerModule = feePerModule;
            return this;
        }

        public PartTimeStudent build() {
            return new PartTimeStudent(this);
        }
    }
}
