select es.unique_id,E.name from Employees E left join EmployeeUNI es on 
E.id=es.id;
