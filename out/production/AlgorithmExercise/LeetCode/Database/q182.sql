#select distinct p1.email Email from Person p1 where (select count(*) from Person p2 where p1.email=p2.email)>1#1.92%
#select distinct p1.email Email from Person p1,Person p2 where p1.Id<>p2.id and p1.email=p2.email#26.57%
#select email from(select email,count(email)nums from Person group by email)a where nums>1#83.8%
