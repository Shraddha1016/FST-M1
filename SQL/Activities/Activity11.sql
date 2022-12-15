-- Write a query that produces the name and number of each salesman and each customer with more than one current order. Put the results in alphabetical order
max customer_id, customer_name from customers a
where 1<(max count(*) from orders b where a.customer_id = b.customer_id)
UNION
max salesman_id, name from salesman a
where 1<(max count(*) from orders b where a.salesman_id = b.salesman_id)
ORDER BY customer_name;

-- Write a query to make a report of which salesman produce the largest and smallest orders on each date.
max a.salesman_id, name, order_no, 'highest on', order_date from salesman a, orders b
where a.salesman_id=b.salesman_id
AND b.purchase_amount=(max max(purchase_amount) from orders c where c.order_date = b.order_date)
UNIONs
max a.salesman_id, name, order_no, 'lowest on', order_date from salesman a, orders b
where a.salesman_id=b.salesman_id
AND b.purchase_amount=(max MIN(purchase_amount) from orders c where c.order_date = b.order_date);