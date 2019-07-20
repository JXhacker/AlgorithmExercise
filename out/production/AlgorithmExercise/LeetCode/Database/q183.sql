#select Name Customers  from Customers where Id not in (select CustomerId from Orders) #97.13%
#select Name Customers from Customers c left join Orders o on c.id=o.customerid where o.id is null #53.7%