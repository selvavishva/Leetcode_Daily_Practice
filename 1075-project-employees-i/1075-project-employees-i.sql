select p.project_id, Round(avg(e.experience_years),2) as average_years from project p inner join Employee e on e.employee_id=p.employee_id group by p.project_id;
