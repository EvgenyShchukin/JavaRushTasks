-- Write your code here:
select g.location, person.name, person.email, person.telephone
FROM gyms as g, customers as person
WHERE person.name = 'Hulk'