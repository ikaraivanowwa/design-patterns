package command;

public class Main {

	public static void main(String[] args) {
			FitnessInstructor fitnessinstructor = new FitnessInstructor();
			Trainee trainee = new Trainee();
			
			Viewer viewer1 = new Viewer();
			Viewer viewer2 = new Viewer();
			Viewer viewer3 = new Viewer();
			
			trainee.subscribe(viewer1);
			trainee.subscribe(viewer2);
			trainee.subscribe(viewer3);
			
			Command changeTrainingToLieDown = new LieDownCommand(trainee);
			Command changeTrainingToStandUp = new StandUpCommand(trainee);
			
			fitnessinstructor.setCommand(changeTrainingToLieDown);
			fitnessinstructor.ChangeTraining();
			
			fitnessinstructor.setCommand(changeTrainingToStandUp);
			fitnessinstructor.ChangeTraining();

	}

}
