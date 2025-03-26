-- Write your code here:
select *
FROM gyms, customers
WHERE gyms.location = 'London' AND customers.location = 'London'