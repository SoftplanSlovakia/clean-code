package formatting_comments;

import java.util.Date;

public class BadComments {

	private Object dbDriver;
	private Object sqlDriver;
	private Object mongoDbDriver;

	public void loadDatabaseDriver(String driverType) {

		// ...

		if (driverType == "sql") {
			// Connect to the SQL Driver, if "driverType" is set to SQL
			this.dbDriver = sqlDriver;
		} else {
			// Otherwise, connect to MongoDB
			this.dbDriver = mongoDbDriver;
		}
	}

	private DatabaseEngine dbEngine;

	// ...

	public void insertData(Data data) {
		this.dbEngine.insert(data); // update a user
	}

	// ...

	// public void updateData(Data data) {
	// this.dbEngine.update(data);
	// }

	// ...

	///////////////////////////////////
	// Class
	///////////////////////////////////
	public static class Data {
		////////////////////////////////////
		// Variables
		////////////////////////////////////
		private String name;
		private Date birthday;

		////////////////////////////////////
		// Constructors
		////////////////////////////////////
		public Data() {
		}

		public Data(String name, Date birthday) {
			this.name = name;
			this.birthday = birthday;
		}

		// ...

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Date getBirthday() {
			return birthday;
		}

		public void setBirthday(Date birthday) {
			this.birthday = birthday;
		}

	}

	public static class DatabaseEngine {
		void insert(Object obj) {
			System.out.println("Object " + obj + " was inserted...");
		}

		void update(Object obj) {
			System.out.println("Object " + obj + " was updated...");
		}
	}
}
