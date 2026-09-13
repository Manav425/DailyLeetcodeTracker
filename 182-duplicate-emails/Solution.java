# Write your MySQL query statement below
select distinct s1.Email from Person s1 
join Person s2
on s1.Email=s2.Email
where s1.id!=s2.id;