# Write your MySQL query statement below
select p.product_name , sum(unit) as unit from Products p
join Orders o on p.product_id=o.product_id
WHERE o.order_date BETWEEN '2020-02-01' AND '2020-02-29'
group by product_name
having sum(o.unit) >=100