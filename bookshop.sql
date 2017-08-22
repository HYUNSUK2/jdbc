-- drop & create sequence
drop sequence seq_author;
create sequence seq_author
start with 1
increment by 1
maxvalue 9999999999;

drop sequence seq_book;
create sequence seq_book
start with 1
increment by 1
maxvalue 9999999999;

-- getList 
  select no, name, profile 
    from author
order by no;

-- insert
insert 
  into author
values ( seq_author.nextval, 'dqwd', 'dqwdwq');

rollback;
select * from author;    