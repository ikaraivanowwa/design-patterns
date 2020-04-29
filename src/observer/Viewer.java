package observer;

public class Viewer implements Observer {
	
		private String training;
		private Observable trainee;

	public Viewer() {
		
	}

	@Override
	public void update() {
		if(trainee == null) {
			System.out.println("No trainee");
			return;
		}

		training = trainee.getUpdate();
		System.out.println("Changed tringing to " + this.training);
	}

	@Override
	public void setTrainee(Observable trainee) {
		this.trainee = trainee;

	}
	
	 public String getTraining() {
		 return this.training;
	 }
	 
	 
	  public void setTraining(String training) {
		  
		  this.training = training;
	  }


}
