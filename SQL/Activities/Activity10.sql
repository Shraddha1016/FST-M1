select * from orders
where salesman_id=(select distict  salesman_id from orders where customer_id=3007);
select * from orders
where salesman_id IN (select salesman_id from salesman where city='New York');
select grade, count(*) from customers
group by grade HAVING grade>(select AVG(grade) from customers where city='New York');
select order_no, purchase_amount, order_date, salesman_id from orders
where salesman_id IN( select salesman_id from salesman
where commission=( select max(commission) from salesman));
select * from orders
where salesman_id=(select distict  salesman_id from orders where customer_id=3007);
select * from orders
where salesman_id IN (select salesman_id from salesman where city='New York');
select grade, count(*) from customers
group by grade HAVING grade>(select AVG(grade) from customers where city='New York');
select order_no, purchase_amount, order_date, salesman_id from orders
where salesman_id IN( select salesman_id from salesman
where commission=( select max(commission) from salesman));