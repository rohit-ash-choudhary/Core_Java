For SQL Masking

select left(PostalCode,len(PostalCode)-2)+'XX'
FROM Customers;