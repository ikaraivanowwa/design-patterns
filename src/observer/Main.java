package observer;

public class Main {

	public static void main(String[] args) {
		
		Trainee trainee = new Trainee();
		FitnessInstructor fitnessinstructor = new FitnessInstructor(trainee);
		Observer viewer1 = new Viewer();
		Observer viewer2 = new Viewer();
		Observer viewer3 = new Viewer();
		
		trainee.subscribe(viewer1);
		trainee.subscribe(viewer2);
		trainee.subscribe(viewer3);
		
		fitnessinstructor.ChangeTraining("Stand up" );
		System.out.println();
		fitnessinstructor.ChangeTraining("Lie down");
	}

}
