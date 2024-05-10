# School-Service Project README

---

## Description
This project, "school-class", facilitates student data management within an educational environment. It relies on a PostgreSQL database. Ensure the local PostgreSQL server is operational with a database named `technologies_db` or customize it to match your local database setup.

---

## Setup Instructions
1. Ensure the PostgreSQL server is running locally.
2. Create a database named `technologies_db` or adjust configurations to match your local setup.
3. Execute the SQL scripts provided in the `main/resources` folder to initialize the database schema.

---

## Testing
1. Utilize the provided SQL scripts in `main/resources` for querying the database.
2. Find a Postman collection for API testing in the same directory for convenient testing and validation.
3. To test the UI, access the following URLs:
   - [http://localhost:8100/serverside/classes/ui](http://localhost:8100/serverside/classes/ui)
   - [http://localhost:8100/serverside/schools/ui](http://localhost:8100/serverside/schools/ui)

---

## Note
- Update database configurations in the project settings to match your local setup.
- HTML templates can be found in the `main/resources/template` directory.
- For any issues or queries, feel free to contact me.
