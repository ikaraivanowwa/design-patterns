package observer;

public class FitnessInstructor {
	
		Trainee trainee;
	
		public FitnessInstructor (Trainee trainee) { 
			
		 this.trainee = trainee;
		 
	 }
		public void ChangeTraining(String newTraining) {
			
		 this.trainee.setTraining(newTraining);
		 
	 }

}
