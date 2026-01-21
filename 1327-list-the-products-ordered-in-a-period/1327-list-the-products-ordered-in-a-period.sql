# Write your MySQL query statement below
select p.product_name , sum(unit) as unit from Orders o
join Products p on o.product_id=p.product_id
WHERE o.order_date BETWEEN '2020-02-01' AND '2020-02-29'
group by product_name
having sum(o.unit) >=100