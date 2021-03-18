use bookManagement
show tables

create table authorOneToOne(
authorId integer primary key auto_increment,
authorName varchar(50))


select * from authorOneToOne 

create table bookOneToOne(
bookId integer primary key auto_increment,
bookName varchar(50),
authorId integer,
foreign key (authorId) references authorOneToOne(authorId))

desc bookOneToOne
select * from bookOneToOne 


create table authorManyToMany(
authorId integer primary key auto_increment,
authorName varchar(50))

Desc authorManyToMany
select * from authorManyToMany
delete from authorManyToMany
drop table authorManyToMany

create table bookManyToMany(
bookId integer primary key auto_increment,
bookName varchar(50)
)

Desc  bookManyToMany
select * from  bookManyToMany
delete from bookManyToMany
drop table bookManyToMany

create table author_Book_ManyToMany(
author_Id integer,
book_Id integer,
foreign key (author_Id) references authorManyToMany(authorId),
foreign key (book_Id) references bookManyToMany(bookId)
)
drop table author_Book_ManyToMany

Desc author_Book_ManyToMany
select * from author_Book_ManyToMany
delete from author_Book_ManyToMany

