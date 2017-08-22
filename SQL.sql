select * from author;

update author set name='도우넛' where no = 12;

insert into author values( seq_author.nextval, '', '');

rollback;