import java.awt.geom.FlatteningPathIterator;

public class doctor {
    boolean wroksAtHospital;

    void treatPatient() {
        System.out.println("treatDoctorPatient");
    }



    public static void main(String[] args) {
//        Surgeon surgeon = new Surgeon();
//        surgeon.wroksAtHospital= false;
//        FamilyDoctor familyDoctor = new FamilyDoctor();
//        familyDoctor.wroksAtHospital = true;
//        familyDoctor.makesHouseCalls = true;
//        surgeon.makeIncision();
//        surgeon.treatPatient();
//        familyDoctor.giveAdvice();
//        familyDoctor.treatPatient();
        doctor doctor = new Surgeon();
        doctor.treatPatient();
    }
}

class FamilyDoctor extends doctor {
    boolean makesHouseCalls;

    void giveAdvice() {
        System.out.println("giveadvice");

    }
}

class Surgeon extends doctor {
    void treatPatient() {
        System.out.println("treatSurgeonPatient");
    }

    void makeIncision() {
        System.out.println("makeIncision");
    }
}
