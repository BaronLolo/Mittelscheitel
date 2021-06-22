DROP TABLE auto CASCADE CONSTRAINTs;
set define off;

 

create table auto (
    idAuto number(4) generated always as identity,
    marke varchar(20),
    nameAuto varchar(100),
    preis integer, 
    ps integer, 
    hubraum integer, 
    gewicht integer, 
    treibstoff varchar(20),
    antrieb varchar(25),
    color varchar(20),
    ytVideo varchar(200)
);

 

Insert into auto (marke, nameAuto, preis, ps, hubraum, gewicht, treibstoff, antrieb, color, ytVideo) 
values('Nissan', 'Silvia S15', 30000, 250, 1998, 1260, 'Benzin', 'Hinterradantrieb', 'silber', 'https://www.youtube.com/watch?v=uah0le4pVnA');

 

Insert into auto (marke, nameAuto, preis, ps, hubraum, gewicht, treibstoff, antrieb, color, ytVideo) 
values('Alfa Romeo', 'Giulia Quadrifoglio 2.9 V6 BiTurbo', 120000, 510, 2891, 1620, 'Benzin', 'Hinterradantrieb', 'grün', 'https://www.youtube.com/watch?v=GNrESEz3i2g');

 

Insert into auto (marke, nameAuto, preis, ps, hubraum, gewicht, treibstoff, antrieb, color, ytVideo) 
values('Cupra', 'TCR 2.0 TSI SEQ', 50000, 350, 1984, 1150, 'Benzin', 'Vorderradantrieb', 'weiß', 'https://www.youtube.com/watch?v=oBVz7Iri8YQ');

 

Insert into auto (marke, nameAuto, preis, ps, hubraum, gewicht, treibstoff, antrieb, color, ytVideo) 
values('Dodge', 'Viper SR II Convertible 8.0 V 10', 80000, 450, 7990, 1560, 'Benzin', 'Hinterradantrieb', 'schwarz', 'https://www.youtube.com/watch?v=CUZq8dsq21U');

 

Insert into auto (marke, nameAuto, preis, ps, hubraum, gewicht, treibstoff, antrieb, color, ytVideo) 
values('Honda', 'Integra Coupe (DC5) 2.0 16V Type R', 15000, 220, 1998, 1170, 'Benzin', 'Vorderradantrieb', 'weiß', 'https://www.youtube.com/watch?v=r2luXAUadys');

 

Insert into auto (marke, nameAuto, preis, ps, hubraum, gewicht, treibstoff, antrieb, color, ytVideo) 
values('Hyundai', 'Tiburon 2.0 i 16V', 7000, 139, 1975, 1250, 'Benzin', 'Vorderradantrieb', 'blau', 'https://www.youtube.com/watch?v=Wt2eBYivZJQ');

 

Insert into auto (marke, nameAuto, preis, ps, hubraum, gewicht, treibstoff, antrieb, color, ytVideo) 
values('Mazda', 'MX-5 I (NA) 1.6', 4000, 90, 1598, 981, 'Benzin', 'Hinterradantrieb', 'rot', 'https://www.youtube.com/watch?v=2y8NTjXr-xU');

 

Insert into auto (marke, nameAuto, preis, ps, hubraum, gewicht, treibstoff, antrieb, color, ytVideo) 
values('Alfa Romeo', '6 2.5 i.e.', 8000, 158, 2492, 1470, 'Benzin', 'Hinterradantrieb', 'braun', 'https://www.youtube.com/watch?v=2fQ18caVS6U');

 

Insert into auto (marke, nameAuto, preis, ps, hubraum, gewicht, treibstoff, antrieb, color, ytVideo) 
values('Dodge', 'Charger VII (LD; facelift 2019) SRT Hellcat Daytona 6.2 HEMI V8', 79000, 717, 6166, 2080, 'Benzin', 'Hinterradantrieb', 'orange', 'https://www.youtube.com/watch?v=yActxH4alb8');

 

Insert into auto (marke, nameAuto, preis, ps, hubraum, gewicht, treibstoff, antrieb, color, ytVideo) 
values('Honda', 'Inspire (UA4) 3.2 i V6 24V', 10000, 260, 3210, 1575, 'Benzin', 'Vorderradantrieb', 'grau', 'https://www.youtube.com/watch?v=wMl-VbpiXyk');

 

Insert into auto (marke, nameAuto, preis, ps, hubraum, gewicht, treibstoff, antrieb, color, ytVideo) 
values('Mazda', 'RX 7 IV Wankel 1.3', 41000, 280, 1308, 1240, 'Benzin', 'Hinterradantrieb', 'lila', 'https://www.youtube.com/watch?v=W8aqZH83X9I');

 

Insert into auto (marke, nameAuto, preis, ps, hubraum, gewicht, treibstoff, antrieb, color, ytVideo) 
values('Mitsubishi', 'FTO (E-DE3A) 3.0 i V6 24V', 6000, 225, 2972, 1670, 'Benzin', 'Vorderradantrieb', 'rot', 'https://www.youtube.com/watch?v=E6q6ltoxw3g');

 

Insert into auto (marke, nameAuto, preis, ps, hubraum, gewicht, treibstoff, antrieb, color, ytVideo) 
values('Mitsubishi', 'Lancer Evolution IV 2.0', 40000, 280, 1997, 1260, 'Benzin', 'Allradantrieb', 'rot', 'https://www.youtube.com/watch?v=L_LUpnjgPso&t=2773s');

 

Insert into auto (marke, nameAuto, preis, ps, hubraum, gewicht, treibstoff, antrieb, color, ytVideo) 
values('Mitsubishi', 'Starion (A18_A) 2.6 Turbo ECi (A187A)', 5500, 155, 2555, 1380, 'Benzin', 'Hinterradantrieb', 'gelb', 'https://www.youtube.com/watch?v=L_LUpnjgPso&t=2773s');

 

Insert into auto (marke, nameAuto, preis, ps, hubraum, gewicht, treibstoff, antrieb, color, ytVideo) 
values('Nissan', '370Z NISMO (facelift 2014) 3.7 V6', 42000, 344, 3696, 1421, 'Benzin', 'Hinterradantrieb', 'orange', 'https://www.youtube.com/watch?v=L_LUpnjgPso&t=2773s');

 

Insert into auto (marke, nameAuto, preis, ps, hubraum, gewicht, treibstoff, antrieb, color, ytVideo) 
values('Nissan', 'Skyline GT-R X (R34) 2.6 i 24V Turbo 4WD', 65000, 280, 2568, 1531, 'Benzin', 'Allradantrieb', 'schwarz', 'https://www.youtube.com/watch?v=L_LUpnjgPso&t=2773s');

 

Insert into auto (marke, nameAuto, preis, ps, hubraum, gewicht, treibstoff, antrieb, color, ytVideo) 
values('Toyota', 'Soarer III (facelift 2005) 4.0 i V8 32V GT', 17000, 265, 3969, 1750, 'Benzin', 'Hinterradantrieb', 'grün', 'https://www.youtube.com/watch?v=L_LUpnjgPso&t=2773s');

 

Insert into auto (marke, nameAuto, preis, ps, hubraum, gewicht, treibstoff, antrieb, color, ytVideo) 
values('Volkswagen', 'Golf VII Sportsvan (facelift 2017) 1.6 TDI SCR', 10000, 116, 1598, 1445, 'Diesel', 'Vorderradantrieb', 'silber', 'https://www.youtube.com/watch?v=L_LUpnjgPso&t=2773s');

 