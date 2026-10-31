select stock_name,sum(case when operation='sell' then price
                       when operation='Buy' then -price END) as capital_gain_loss from stocks group by stock_name;
