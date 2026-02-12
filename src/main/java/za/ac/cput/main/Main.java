package za.ac.cput.main;

import za.ac.cput.domain.*;

public class Main {

    public static void main(String[] args) {

        // Undergraduate Student - Naruto Uzumaki
        UndergraduateStudent naruto = new UndergraduateStudent.Builder()
                .setStudentId("U001")
                .setName("Naruto Uzumaki")
                .setEmail("naruto@hiddenleaf.ac.jp")
                .setDepartment("Ninja Studies")
                .setCreditHours(18)
                .setScholarshipAmount(3000)
                .build();

        // Graduate Student - Ichigo Kurosaki
        GraduateStudent ichigo = new GraduateStudent.Builder()
                .setStudentId("G001")
                .setName("Ichigo Kurosaki")
                .setEmail("ichigo@soulreaper.edu")
                .setDepartment("Spiritual Sciences")
                .setResearchAssistant(true)
                .setStipend(6000)
                .build();

        // Part-Time Student - Monkey D. Luffy
        PartTimeStudent luffy = new PartTimeStudent.Builder()
                .setStudentId("P001")
                .setName("Monkey D. Luffy")
                .setEmail("luffy@grandline.edu")
                .setDepartment("Pirate Leadership")
                .setNumberOfModules(4)
                .setFeePerModule(2500)
                .build();

        // Display Details
        naruto.displayStudentDetails();
        ichigo.displayStudentDetails();
        luffy.displayStudentDetails();
    }
}
