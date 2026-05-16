# Write your MySQL query statement below
select Person.firstName,Person.lastname,Address.city,Address.state from Person 
left outer join Address on Person.personId=Address.PersonId;
