create database springcloud_api;
use springcloud_api;
create table dept(
    deptno BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    deptname VARCHAR(60),
    db_source VARCHAR(40)
);