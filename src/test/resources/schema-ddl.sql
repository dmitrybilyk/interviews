create table ledger.ledger (
   id int AUTO_INCREMENT not null,
   rcv_dt date,
   mbr_nm VARCHAR(100) not null,
   chk_nbr VARCHAR(10) not null,
   chk_dt date,
   pymt_typ VARCHAR(50) not null,
   dpst_amt double,
   pymt_amt double,
   comments VARCHAR(100),
   constraint PID primary key (id)  
 );