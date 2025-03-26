-- Write your code here:
select gym.location, person.location
from gyms as gym, customers as person
WHERE person.location = 'London'
GROUP BY gym.location, person.location