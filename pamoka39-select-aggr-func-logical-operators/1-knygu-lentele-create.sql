-- sukuriama lentelė
create table knygos (
	id int unsigned not null auto_increment,
    pavadinimas varchar(100) not null,
    autorius varchar(50) not null,
    zanras varchar(50) not null,
    ivertinimas decimal(3,2) unsigned not null,
    psl_skaicius int unsigned not null,
    leidejas varchar(50) not null,
    isbn varchar(17) not null unique,
    metai year,
    primary key(id)
);

-- iš csv failo susigeneravau internete sql insertus
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (1,'Fundamentals of Wavelets','Jaideva Goswami','signal processing',4.61,514,'Wiley','978-3-8914-3252-5',2008);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (2,'Data Smart','John Foreman','data science',2.06,309,'Wiley','978-3-4529-8253-7',2010);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (3,'God Created the Integers','Stephen Hawking','mathematics',1.92,426,'Penguin','978-0-1348-5740-4',2010);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (4,'Superfreakonomics','Stephen Dubner','economics',2.18,470,'HarperCollins','978-6-6890-9909-2',2010);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (5,'Orientalism','Edward Said','history',1.77,547,'Penguin','978-6-5083-8438-5',2008);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (6,'Nature of Statistical Learning Theory The','Vladimir Vapnik','data science',3.18,552,'Springer','978-8-0959-4103-3',2011);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (7,'Integration of the Indian States','V P Menon','history',2.29,589,'Orient Blackswan','978-9-2957-3046-5',2008);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (8,'Drunkard''s Walk The','Leonard Mlodinow','science',2.13,447,'Penguin','978-5-2620-3030-9',2007);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (9,'Image Processing & Mathematical Morphology','Frank Shih','signal processing',2.77,298,'CRC','978-2-2345-0643-5',2011);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (10,'How to Think Like Sherlock Holmes','Maria Konnikova','psychology',1.68,261,'Penguin','978-2-8711-2078-0',2010);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (11,'Data Scientists at Work','Gutierre ebastian','data science',2.79,361,'Apress','978-6-6742-8806-7',2007);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (12,'Slaughterhouse Five','Kurt Vonnegut','fiction',1.81,102,'Random House','978-1-2099-3560-7',2011);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (13,'Birth of a Theorem','Cedric Villani','mathematics',1.05,365,'Bodley Head','978-4-6833-6034-7',2008);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (14,'Structure & Interpretation of Computer Programs','Gerald Sussman','computer science',2.69,215,'MIT Press','978-4-8746-5080-6',2009);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (15,'Age of Wrath The','Abraham Eraly','history',1.57,517,'Penguin','978-8-2848-3332-3',2009);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (16,'Trial The','Frank Kafka','fiction',2.95,444,'Random House','978-8-7714-0670-2',2009);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (17,'Statistical Decision Theory''','John Pratt','data science',3.97,579,'MIT Press','978-4-0761-8162-7',2009);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (18,'Data Mining Handbook','Robert Nisbet','data science',4.04,336,'Apress','978-4-4837-3729-5',2009);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (19,'New Machiavelli The','H. G. Wells','fiction',3.81,276,'Penguin','978-0-3462-1512-2',2007);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (20,'Physics & Philosophy','Werner Heisenberg','science',1.56,369,'Penguin','978-4-1038-6654-1',2008);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (21,'Making Software','Andy Oram','computer science',2.24,127,'O''Reilly','978-0-9380-2205-3',2008);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (22,'Analysis Vol I','Terence Tao','mathematics',2.82,334,'HBA','978-7-6011-9704-9',2010);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (23,'Machine Learning for Hackers','Drew Conway','data science',2.09,235,'O''Reilly','978-5-6793-1050-6',2010);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (24,'Signal and the Noise The','Nate Silver','data science',1.34,505,'Penguin','978-4-2521-5251-9',2011);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (25,'Python for Data Analysis','Wes McKinney','data science',3.32,363,'O''Reilly','978-3-3891-4163-2',2010);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (26,'Introduction to Algorithms','Thomas Cormen','computer science',2.09,391,'MIT Press','978-4-3302-3740-4',2010);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (27,'Beautiful and the Damned The','Siddhartha Deb','nonfiction',2.74,506,'Penguin','978-8-9788-8161-6',2010);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (28,'Outsider The','Albert Camus','fiction',3.66,436,'Penguin','978-3-5299-0991-7',2008);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (29,'Complete Sherlock Holmes The - Vol I','Arthur Conan Doyle','fiction',3.37,417,'Random House','978-1-7694-8747-9',2010);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (30,'Complete Sherlock Holmes The - Vol II','Arthur Conan Doyle','fiction',1.82,136,'Random House','978-1-6016-6412-9',2008);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (31,'Wealth of Nations The','Adam Smith','economics',3.66,353,'Random House','978-8-5419-7243-7',2008);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (32,'Pillars of the Earth The','Ken Follett','fiction',1.6,336,'Random House','978-2-7944-4691-2',2007);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (33,'Mein Kampf','Adolf Hitler','nonfiction',3.73,118,'Rupa','978-6-3123-5913-5',2008);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (34,'Tao of Physics The','Fritjof Capra','science',3.72,522,'Penguin','978-3-9576-8299-4',2010);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (35,'Surely You''re Joking Mr Feynman','Richard Feynman','science',1.08,524,'Random House','978-8-3222-9241-9',2011);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (36,'Farewell to Arms A','Ernest Hemingway','fiction',2.12,303,'Rupa','978-7-6416-1921-1',2009);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (37,'Veteran The','Frederick Forsyth','fiction',3.43,343,'Transworld','978-0-9228-5630-5',2007);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (38,'False Impressions','Jeffery Archer','fiction',4.68,467,'Pan','978-6-1484-2070-2',2008);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (39,'Last Lecture The','Randy Pausch','nonfiction',4.11,159,'Hyperion','978-7-6824-4665-4',2011);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (40,'Return of the Primitive','Ayn Rand','philosophy',3.79,477,'Penguin','978-3-8309-5307-4',2011);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (41,'Jurassic Park','Michael Crichton','fiction',4.12,422,'Random House','978-5-4288-2213-7',2007);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (42,'Russian Journal A','John Steinbeck','nonfiction',3.5,320,'Penguin','978-6-5683-4674-3',2011);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (43,'Tales of Mystery and Imagination','Edgar Allen Poe','fiction',4.71,519,'HarperCollins','978-6-9016-8476-1',2008);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (44,'Freakonomics','Stephen Dubner','economics',3.42,349,'Penguin','978-8-8907-3733-6',2011);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (45,'Hidden Connections The','Fritjof Capra','science',4.7,150,'HarperCollins','978-4-8080-6038-1',2008);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (46,'Story of Philosophy The','Will Durant','philosophy',2.59,228,'Pocket','978-8-4064-1295-5',2008);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (47,'Asami Asami','P L Deshpande','fiction',1.78,377,'Mauj','978-8-7472-0766-1',2008);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (48,'Journal of a Novel','John Steinbeck','fiction',1.16,345,'Penguin','978-6-8676-6369-5',2008);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (49,'Once There Was a War','John Steinbeck','nonfiction',4.89,349,'Penguin','978-6-3164-1973-6',2009);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (50,'Moon is Down The','John Steinbeck','fiction',3.66,261,'Penguin','978-4-4527-1693-1',2010);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (51,'Brethren The','John Grisham','fiction',4.57,258,'Random House','978-5-4554-7100-1',2010);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (52,'In a Free State','V. S. Naipaul','fiction',4.45,155,'Rupa','978-3-4594-3759-7',2007);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (53,'Catch 22','Joseph Heller','fiction',4.56,358,'Random House','978-3-0333-5269-8',2010);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (54,'Complete Mastermind The','BC','nonfiction',1.88,298,'BBC','978-3-6784-0850-7',2010);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (55,'Dylan on Dylan','Bob Dylan','nonfiction',3.3,393,'Random House','978-9-1159-2977-2',2007);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (56,'Soft Computing & Intelligent Systems','Madan Gupta','data science',3.49,479,'Elsevier','978-0-0034-5545-8',2010);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (57,'Textbook of Economic Theory','Alfred Stonier','economics',2.81,454,'Pearson','978-5-1180-7849-3',2010);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (58,'Econometric Analysis','W. H. Greene','economics',3.74,373,'Pearson','978-8-4490-8825-4',2011);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (59,'Learning OpenCV','Gary Bradsky','data science',3.92,289,'O''Reilly','978-2-1695-9792-8',2009);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (60,'Data Structures Using C & C++','Andrew Tanenbaum','computer science',4,135,'Prentice Hall','978-4-8454-0005-8',2010);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (61,'Computer Vision A Modern Approach','David Forsyth','data science',2.2,575,'Pearson','978-3-1886-7747-9',2008);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (62,'Principles of Communication Systems','Schilling Taub','computer science',2.79,447,'TMH','978-2-0408-8926-5',2009);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (63,'Let Us C','Yashwant Kanetkar','computer science',3.94,579,'Prentice Hall','978-9-2316-1082-0',2007);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (64,'Amulet of Samarkand The','Jonathan Stroud','fiction',1.15,545,'Random House','978-1-9970-3712-5',2010);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (65,'Crime and Punishment','Fyodor Dostoevsky','fiction',2.29,160,'Penguin','978-9-1127-8247-9',2011);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (66,'Angels & Demons','Dan Brown','fiction',4.53,174,'Random House','978-2-1168-5460-9',2011);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (67,'Argumentative Indian The','Amartya Sen','nonfiction',1.14,596,'Picador','978-6-9398-2601-0',2009);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (68,'Sea of Poppies','Amitav Ghosh','fiction',3.16,524,'Penguin','978-5-4164-1106-0',2008);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (69,'Idea of Justice The','Amartya Sen','nonfiction',3.38,540,'Penguin','978-7-0030-8470-1',2008);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (70,'Raisin in the Sun A','Lorraine Hansberry','fiction',4.49,163,'Penguin','978-1-5149-8402-4',2007);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (71,'All the President''s Men','Bob Woodward','history',2.6,224,'Random House','978-5-3696-1973-5',2010);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (72,'Prisoner of Birth A','Jeffery Archer','fiction',4.97,503,'Pan','978-0-8072-0511-2',2011);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (73,'Scoop!','Kuldip Nayar','history',4.15,330,'HarperCollins','978-7-9755-4404-3',2007);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (74,'Ahe Manohar Tari','Sunita Deshpande','nonfiction',3.85,454,'Mauj','978-9-2441-8931-3',2009);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (75,'Last Mughal The','William Dalrymple','history',4.65,390,'Penguin','978-6-0510-2376-2',2011);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (76,'Social Choice & Welfareariou Vol 39 No. 1','Ra adreh','economics',4.15,471,'Springer','978-1-9830-4614-8',2008);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (77,'Radiowaril Bhashane & Shrutika','P L Deshpande','nonfiction',2.28,388,'Mauj','978-9-5083-9896-3',2009);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (78,'Gun Gayin Awadi','P L Deshpande','nonfiction',1.19,571,'Mauj','978-8-0233-2571-3',2010);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (79,'Aghal Paghal','P L Deshpande','nonfiction',2.74,276,'Mauj','978-1-0629-1318-7',2011);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (80,'Maqta-e-Ghalib','Sanjay Garg','fiction',4.93,488,'Mauj','978-2-9563-8009-2',2011);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (81,'Beyond Degrees','Joh ayne','nonfiction',3.21,328,'HarperCollins','978-5-5419-3661-2',2009);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (82,'Manasa','V P Kale','nonfiction',2.85,139,'Mauj','978-3-1999-8077-3',2008);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (83,'India from Midnight to Milennium','Shashi Tharoor','history',4.84,255,'Penguin','978-1-4024-0291-3',2008);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (84,'World''s Greatest Trials The','Ra adreh','history',4.87,299,'Penguin','978-0-3710-1469-1',2007);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (85,'Great Indian Novel The','Shashi Tharoor','fiction',1.35,213,'Penguin','978-2-6192-5970-3',2010);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (86,'O Jerusalem!','Dominique Lapierre','history',1.23,590,'vikas','978-4-5548-0194-8',2011);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (87,'City of Joy The','Dominique Lapierre','fiction',2.8,368,'vikas','978-7-6080-8665-0',2007);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (88,'Freedom at Midnight','Dominique Lapierre','history',4.04,567,'vikas','978-5-5185-4536-6',2009);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (89,'Winter of Our Discontent The','John Steinbeck','fiction',4.43,402,'Penguin','978-6-7992-5532-6',2011);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (90,'On Education','Bertrand Russell','philosophy',3.82,188,'Routledge','978-6-9357-5885-8',2008);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (91,'Free Will','Sam Harris','philosophy',1.04,196,'FreePress','978-5-5545-8047-5',2009);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (92,'Bookless in Baghdad','Shashi Tharoor','nonfiction',1.05,578,'Penguin','978-2-8297-9968-6',2010);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (93,'Case of the Lame Canary The','Earle Stanley Gardner','fiction',1.18,371,'Random House','978-5-0913-9213-5',2011);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (94,'Theory of Everything The','Stephen Hawking','science',3.69,208,'Jaico','978-6-6062-7443-4',2009);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (95,'New Markets & Other Essays','Peter Drucker','economics',2.91,505,'Penguin','978-2-5490-7310-3',2010);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (96,'Electric Universe','David Bodanis','science',4.44,146,'Penguin','978-1-6687-9124-0',2008);
INSERT INTO knygos(id,pavadinimas,autorius,zanras,ivertinimas,psl_skaicius,leidejas,isbn,metai) VALUES (97,'Hunchback of Notre Dame The','Victor Hugo','fiction',4.91,557,'Random House','978-5-5579-8965-7',2009);