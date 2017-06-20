-- Create table
create table SYS_USER_T
(
  user_id      NUMBER(10) not null,
  user_account VARCHAR2(120 CHAR),
  email        VARCHAR2(50 CHAR),
  password     VARCHAR2(120 CHAR),
  user_name    VARCHAR2(120 CHAR)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255;
-- Create/Recreate primary, unique and foreign key constraints 
alter table SYS_USER_T
  add primary key (USER_ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255;
