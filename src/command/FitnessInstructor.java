package command;

public class FitnessInstructor {
	
	 private Command command;
	 
	 public void setCommand(Command command) {
		 this.command = command;
	 }
	 
	 public void ChangeTraining() {
		 System.out.println("Fitness instructor changed training");
		 this.command.execute();
	 }

}
