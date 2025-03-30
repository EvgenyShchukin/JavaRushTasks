-- Write your code here:
select name
from part
where (
          (name LIKE '%Slope%Slope%' AND NOT name LIKE '%Clip%') OR
          (name LIKE '%Clip%Clip%' AND NOT name LIKE '%Slope%')
          )