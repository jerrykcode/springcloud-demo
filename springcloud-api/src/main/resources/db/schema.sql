create database springcloud_api;
use springcloud_api;
drop table if exists dept;
create table dept(
    deptno BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    deptname VARCHAR(60),
    db_source VARCHAR(40)
);

create database springcloud_api_02;
use springcloud_api_02;
drop table if exists dept;
create table dept(
    deptno BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    deptname VARCHAR(60),
    db_source VARCHAR(40)
);

create database springcloud_api_03;
use springcloud_api_03;
drop table if exists dept;
create table dept(
    deptno BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    deptname VARCHAR(60),
    db_source VARCHAR(40)
);