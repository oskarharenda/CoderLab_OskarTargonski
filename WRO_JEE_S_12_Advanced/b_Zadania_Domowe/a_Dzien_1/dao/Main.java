package b_Zadania_Domowe.a_Dzien_1.dao;

import java.util.List;

public class Main {

	public static void main(String[] args) {

		// create group
		GroupDao groupDao = new GroupDao();
		Group g = new Group("sample name");
		//save group to database
		groupDao.save(g);

		//get all groups
		List<Model> groups = groupDao.loadAll();
		for (Model model : groups) {
			Group group = (Group) model;
			System.out.println(group.getName());
		}




		//update group
		g.setName("other name");
		groupDao.save(g);

		for (Model model : groups) {
			Group group = (Group) model;
			System.out.println(group.getName());
		}

		//remove group
		Group firstElement = (Group) groupDao.loadById(1);
		if (firstElement != null) {
			groupDao.delete(firstElement);
		}


		// create group
		ExerciseDao exerciseDao = new ExerciseDao();
		Exercise e = new Exercise("ex1","desc1");
		//save group to database
		exerciseDao.save(e);

		//get all groups
		List<Model> exercises = exerciseDao.loadAll();
		for (Model model : exercises) {
			Exercise exercise = (Exercise) model;
			System.out.println(exercise.getTitle());
			System.out.println(exercise.getDescription());
		}
	}

}
