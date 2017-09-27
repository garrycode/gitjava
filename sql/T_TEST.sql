-- Create table
create table T_TEST
(
  test_name   VARCHAR2(60) not null,
  test_module  VARCHAR2(200) not null,
  test_code   VARCHAR2(20) not null,
  test_status    CHAR(2) default '00' not null,
  create_time DATE default SYSDATE not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
-- Add comments to the table 
comment on table T_TEST
  is 'T_TEST';
-- Add comments to the columns 
comment on column T_TEST.test_name
  is '测试名称';
comment on column T_TEST.test_module
  is '测试模块';
comment on column T_TEST.test_code
  is '测试编码';
comment on column T_TEST.test_status
  is '测试状态00：正常，01：不正常';
comment on column T_TEST.create_time
  is '创建时间';
