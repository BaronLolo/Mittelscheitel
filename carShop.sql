DROP TABLE auto CASCADE CONSTRAINTs;
drop sequence seqAuto;

create sequence seqAuto increment by 1 start with 1;

create table auto (
    idAuto integer,
    marke varchar(20),
    nameAuto varchar(30),
    preis integer, 
    ps integer, 
    hubraum integer, 
    gewicht integer, 
    treibstoff varchar(20),
    antrieb varchar(20),
    color varchar(20),
    ytVideo varchar(200)
);

Insert into auto values(seqAuto.nextval, 'Nissan', 'S15', 30000, 300, 3000, 1400, 'Benzin', 'Heckantrieb', 'schwarz', 'https://www.youtube.com/watch?v=9YqwMjm6xP4');