package observer;

import java.util.ArrayList;
import java.util.List;

public class Trainee implements Observable {

		private List<Observer> observers = new ArrayList<Observer>();
		private String training;
		
		public void setTraining(String training) {
			this.training = training;
			this.notifyObservers();
		}
		

	@Override
	public void subscribe(Observer observer) {
		
		observer.setTrainee(this);
		this.observers.add(observer);

	}

	@Override
	public void unsubscribe(Observer observer) {
		this.observers.remove(observer);
		
	}

	@Override
	public void notifyObservers() {
		for(Observer observer: this.observers) {
			observer.update();
		}
		

	}

	@Override
	public String getUpdate() {
		return training;
	}

}
