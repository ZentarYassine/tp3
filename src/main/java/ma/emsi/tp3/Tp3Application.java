package ma.emsi.tp3;

import com.example.new_hospital.entities.Patient;
import ma.emsi.tp3.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class Tp3Application implements CommandLineRunner {
	@Autowired
	private PatientRepository patientRepository;
	public static void main(String[] args) {
		SpringApplication.run(Tp3Application.class, args);



	}
	@Override
	public void run(String... args) throws Exception {
		//sol 1 pour creer un objet
    /*Patient patient=new Patient();
    patient.setId(null);
    patient.setNom("Hicham");
    patient.setDateNaissance(new Date());
    patient.setMalade(false);
    patient.setScore(100);*/

		//2eme sol
		//Patient patient1=new Patient(null,"Amine",new Date(),false,52);
		//3eme sol
		//Patient patient2=Patient.builder().id(null).nom("Imane").dateNaissance(new Date()).malade(false).score(96).build();
		patientRepository.save(new Patient(null,"Amine",new Date(),false,52));
		patientRepository.save(new Patient(null,"yassine",new Date(),false,70));
		patientRepository.save(new Patient(null,"Imane",new Date(),true,85));
	}

}
