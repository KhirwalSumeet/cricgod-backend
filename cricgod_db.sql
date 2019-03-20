DROP DATABASE IF EXISTS cricgod;
CREATE DATABASE IF NOT EXISTS cricgod;

USE cricgod;

drop table if exists team;
create table if not exists team(
	id int unsigned auto_increment unique not null,
    name varchar(255) not null,
	nick_name varchar(255) not null,
    primary key (id),
    index tid(id)
);

INSERT INTO team VALUES (1, "Chennai Super Kings", "CSK");
INSERT INTO team VALUES (2, "Mumbai Indians", "MI");
INSERT INTO team VALUES (3, "Royal Challengers Bangalore", "RCB");
INSERT INTO team VALUES (4, "Kings XI Punjab", "KXIP");
INSERT INTO team VALUES (5, "Delhi Capitals", "DC");
INSERT INTO team VALUES (6, "Rajasthan Royals", "RR");
INSERT INTO team VALUES (7, "Kolkata Knight Riders", "KKR");
INSERT INTO team VALUES (8, "Sunrisers Hyderabad", "SRH");


drop table if exists stadium_boundary_length;
create table if not exists stadium_boundary_length(
	id int unsigned auto_increment unique not null,
    sector1 int,
    sector2 int,
    sector3 int,
    sector4 int,
    sector5 int,
    sector6 int,
    primary key(id),
    index sblid(id)
);

INSERT INTO stadium_boundary_length VALUES (1, 56, 68, 78, 65, 61, 58);
INSERT INTO stadium_boundary_length VALUES (2, 66, 68, 78, 65, 61, 58);
INSERT INTO stadium_boundary_length VALUES (3, 56, 68, 78, 65, 61, 58);
INSERT INTO stadium_boundary_length VALUES (4, 56, 68, 78, 65, 61, 58);
INSERT INTO stadium_boundary_length VALUES (5, 56, 68, 78, 65, 61, 58);
INSERT INTO stadium_boundary_length VALUES (6, 56, 68, 78, 65, 61, 58);
INSERT INTO stadium_boundary_length VALUES (7, 56, 68, 78, 65, 61, 58);
INSERT INTO stadium_boundary_length VALUES (8, 56, 68, 78, 65, 61, 58);
INSERT INTO stadium_boundary_length VALUES (9, 56, 68, 78, 65, 61, 58);
INSERT INTO stadium_boundary_length VALUES (10, 56, 68, 78, 65, 61, 58);


drop table if exists stadium;
create table if not exists stadium(
	id int unsigned auto_increment unique not null,
    name varchar(255) not null,
    city varchar(255) not null,
    country varchar(255) not null,
    capacity int not null,
    stadium_boundary_length_id int unsigned not null,
    primary key (id),
    foreign key (stadium_boundary_length_id) references stadium_boundary_length(id),
    index sid(id)
);

INSERT INTO stadium VALUES (1, "M.A. Chidambaram Stadium", "Chennai", "India", 30000, 1);
INSERT INTO stadium VALUES (2, "Wankhede Stadium", "Chennai", "Mumbai", 35000, 2);
INSERT INTO stadium VALUES (3, "M. Chinnaswamy Stadium", "Bangalore", "India", 25000, 3);
INSERT INTO stadium VALUES (4, "IS Bindra Stadium", "Punjab", "India", 30500, 4);
INSERT INTO stadium VALUES (5, "Feroz Shah Kotla Ground", "Delhi", "India", 29456, 5);
INSERT INTO stadium VALUES (6, "Swami Mansingh Stadium", "Rajasthan", "India", 24500, 6);
INSERT INTO stadium VALUES (7, "Eden Gardens", "Chennai", "Kolkata", 31500, 7);
INSERT INTO stadium VALUES (8, "Rajiv Gandhi Intl. Cricket Stadium", "Hyderabad", "India", 28650, 8);
INSERT INTO stadium VALUES (9, "Pune Stadium", "Pune", "India", 26880, 9);
INSERT INTO stadium VALUES (10, "Holkar Cricket Stadium", "Indore", "India", 30000, 10);


drop table if exists sty_mapping;
create table if not exists sty_mapping(
	id int unsigned auto_increment unique not null,
    team_id int unsigned not null,
    stadium_id int unsigned not null,
	year int not null,
	primary key (id),
    foreign key (team_id) references team(id),
    foreign key (stadium_id) references stadium(id),
    index sty(team_id, stadium_id)
);

insert into sty_mapping values(1, 1, 1, 2019);
insert into sty_mapping values(2, 2, 2, 2019);
insert into sty_mapping values(3, 3, 3, 2019);
insert into sty_mapping values(4, 4, 4, 2019);
insert into sty_mapping values(5, 5, 5, 2019);
insert into sty_mapping values(6, 6, 6, 2019);
insert into sty_mapping values(7, 7, 7, 2019);
insert into sty_mapping values(8, 8, 8, 2019);
insert into sty_mapping values(9, 1, 9, 2018);
insert into sty_mapping values(10, 4, 10, 2018);

drop table if exists social_media;
create table if not exists social_media(
	id int unsigned auto_increment unique not null,
    platform enum('FACEBOOK','INSTAGRAM', 'TWITTER'),
    primary key (id),
    index smid(id)
);

INSERT INTO social_media VALUES(1, "FACEBOOK");
INSERT INTO social_media VALUES(2, "INSTAGRAM");
INSERT INTO social_media VALUES(3, "TWITTER");


drop table if exists smdt;
create table if not exists smdt(
	id int unsigned auto_increment unique not null,
    social_media_id int unsigned not null,
    team_id int unsigned not null,
    link varchar(255) not null,
    followers int unsigned not null,
    primary key (id),
    foreign key (team_id) references team(id),
    index smdtid(team_id)
);

INSERT INTO smdt VALUES(1, 1, 1, "https://www.facebook.com/csk/", 2345678);
INSERT INTO smdt VALUES(2, 2, 1, "https://www.instagram.com/csk/", 2345678);
INSERT INTO smdt VALUES(3, 3, 1, "https://www.twitter.com/csk/", 2345678);
INSERT INTO smdt VALUES(4, 1, 2, "https://www.facebook.com/mi/", 2345678);
INSERT INTO smdt VALUES(5, 2, 2, "https://www.instagram.com/mi/", 2345678);
INSERT INTO smdt VALUES(6, 3, 2, "https://www.twitter.com/mi/", 2345678);
INSERT INTO smdt VALUES(7, 1, 3, "https://www.facebook.com/rcb/", 2345678);
INSERT INTO smdt VALUES(8, 2, 3, "https://www.instagram.com/rcb/", 2345678);
INSERT INTO smdt VALUES(9, 3, 3, "https://www.twitter.com/rcb/", 2345678);
INSERT INTO smdt VALUES(10, 1, 4, "https://www.facebook.com/kxip/", 2345678);
INSERT INTO smdt VALUES(11, 2, 5, "https://www.instagram.com/dc/", 2345678);
INSERT INTO smdt VALUES(12, 3, 6, "https://www.twitter.com/rr/", 2345678);
INSERT INTO smdt VALUES(13, 1,7, "https://www.facebook.com/kkr/", 2345678);
INSERT INTO smdt VALUES(14, 2, 8, "https://www.instagram.com/srh/", 2345678);


drop table if exists player;
create table if not exists player(
	id int unsigned auto_increment unique not null,
    name varchar(255) not null,
    batting_style enum('LEFT','RIGHT'),
    bowling_style enum ('RIGHT_FAST', 'LEFT_FAST','RIGHT_MEDIUM', 'LEFT_MEDIUM', 'RIGHT_SPIN', 'LEFT_SPIN'),
    role enum('BATSMEN','BOWLER','BAT_ALLROUNDER', 'BOWL_ALLROUNDER', 'WICKETKEEPER', 'WK_BATSMEN'),
    dob date not null,
    nationality varchar(255) not null,
    primary key (id),
    index pid(id)
);

INSERT INTO player VALUES (1, "Mahendra Singh Dhoni", 'RIGHT', 'RIGHT_SPIN', 'WK_BATSMEN', '1982-01-24', 'India');
INSERT INTO player VALUES (2, "Virat Kolhi", 'RIGHT', 'RIGHT_SPIN', 'BATSMEN', '1989-03-04', 'India');
INSERT INTO player VALUES (3, "Rohit Sharma", 'RIGHT', NULL, 'BATSMEN', '1985-07-21', 'India');
INSERT INTO player VALUES (4, "Bhuvneswar Kumar", 'RIGHT', 'RIGHT_FAST', 'BOWLER', '1988-02-17', 'India');
INSERT INTO player VALUES (5, "Kuldeep Yadav", 'RIGHT', 'RIGHT_SPIN', 'BOWLER', '1990-03-12', 'India');
INSERT INTO player VALUES (6, "Jasprit Bumrah", 'RIGHT', 'RIGHT_FAST', 'BOWLER', '1985-04-07', 'India');
INSERT INTO player VALUES (7, "Glenn Maxwell", 'RIGHT', 'RIGHT_SPIN', 'BAT_ALLROUNDER', '1984-05-03', 'Australia');
INSERT INTO player VALUES (8, "Imran Tahir", 'LEFT', 'LEFT_SPIN', 'BOWLER', '1980-06-18', 'South Africa');
INSERT INTO player VALUES (9, "Dinesh Karthik", 'RIGHT', NULL, 'WK_BATSMEN', '1990-07-11', 'India');
INSERT INTO player VALUES (10, "Jos Butler", 'LEFT', NULL, 'WK_BATSMEN', '1986-08-19', 'England');
INSERT INTO player VALUES (11, "Shikhar Dhawan", 'LEFT', NULL, 'BATSMEN', '1987-09-30', 'India');
INSERT INTO player VALUES (12, "Kane Williamson", 'RIGHT', 'RIGHT_SPIN', 'BATSMEN', '1984-10-31', 'New Zealand');
INSERT INTO player VALUES (13, "Lungi Ngidi", 'LEFT', 'LEFT_FAST', 'BOWLER', '1991-11-29', 'South Africa');
INSERT INTO player VALUES (14, "Andrew Tye", 'LEFT', 'RIGHT_FAST', 'BOWLER', '1982-12-14', 'England');
INSERT INTO player VALUES (15, "Sunil Narine", 'LEFT', 'LEFT_SPIN', 'BOWL_ALLROUNDER', '1986-01-09', 'Srilanka');
INSERT INTO player VALUES (16, "Hardik Pandya", 'RIGHT', 'RIGHT_MEDIUM', 'BAT_ALLROUNDER', '1990-02-05', 'India');
INSERT INTO player VALUES (17, "Rishabh Pant", 'RIGHT', NULL, 'WK_BATSMEN', '1996-03-15', 'India');
INSERT INTO player VALUES (18, "Ajinkya Rahane", 'RIGHT', 'RIGHT_SPIN', 'BAT_ALLROUNDER', '1989-06-05', 'India');
INSERT INTO player VALUES (19, "Rashid Khan", 'RIGHT', 'LEFT_SPIN', 'BOWL_ALLROUNDER', '1993-02-05', 'Bangladesh');
INSERT INTO player VALUES (20, "Chris Gayle", 'RIGHT', 'RIGHT_SPIN', 'BATSMEN', '1985-10-01', 'West Indies');
INSERT INTO player VALUES (21, "AB de Villiers", 'RIGHT', 'RIGHT_SPIN', 'BATSMEN', '1979-10-01', 'South Africa');


drop table if exists ptm;
create table if not exists ptm(
	id int unsigned auto_increment unique not null,
    player_id int unsigned not null,
    team_id int unsigned not null,
    year int unsigned not null,
    auction_value int unsigned not null,
    primary key (id),
    foreign key (team_id) references team(id),
    foreign key (player_id) references player(id),
    index ptmid(team_id, player_id)
);

INSERT INTO ptm VALUES(1, 1, 1, 2019, 100000000);
INSERT INTO ptm VALUES(2, 2, 3, 2019, 200000000);
INSERT INTO ptm VALUES(3, 3, 2, 2019, 30000000);
INSERT INTO ptm VALUES(4, 4, 8, 2019, 70000000);
INSERT INTO ptm VALUES(5, 5, 7, 2019, 90000000);
INSERT INTO ptm VALUES(6, 6, 2, 2019, 10500000);
INSERT INTO ptm VALUES(7, 7, 4, 2019, 17000000);
INSERT INTO ptm VALUES(8, 8, 1, 2019, 10560000);
INSERT INTO ptm VALUES(9, 9, 7, 2019, 10027000);
INSERT INTO ptm VALUES(10, 10, 6, 2019, 19000000);
INSERT INTO ptm VALUES(11, 11, 5, 2019, 10690000);
INSERT INTO ptm VALUES(12, 12, 8, 2019, 45000000);
INSERT INTO ptm VALUES(13, 13, 1, 2019, 68000000);
INSERT INTO ptm VALUES(14, 14, 4, 2019, 35000000);
INSERT INTO ptm VALUES(15, 15, 7, 2019, 40000000);
INSERT INTO ptm VALUES(16, 16, 2, 2019, 92000000);
INSERT INTO ptm VALUES(17, 17, 5, 2019, 78000000);
INSERT INTO ptm VALUES(18, 18, 6, 2019, 57000000);
INSERT INTO ptm VALUES(19, 19, 8, 2019, 28000000);
INSERT INTO ptm VALUES(20, 20, 4, 2019, 64000000);


drop table if exists toss;
create table if not exists toss(
	id int unsigned auto_increment unique not null,
    caller_id int unsigned not null,
    winner_id int unsigned not null,
    decision enum('bat','field'),
    primary key (id),
    foreign key (caller_id) references team(id),
    foreign key (winner_id) references team(id),
    index tossid(caller_id, winner_id)
);

insert into toss values (1, 1, 2, 'bat');

drop table if exists weather;
create table if not exists weather(
	id int unsigned auto_increment unique not null,
    temperature int not null,
    humidity int not null,
    rainfall_chances int not null,
    primary key (id),
    index wid(id)
);

insert into weather values(1, 30, 32, 2);

drop table if exists innings;
create table if not exists innings (
	id int unsigned unique auto_increment not null,
    number enum('FIRST','SECOND'),
	batting_team_id int unsigned not null,
    bowling_team_id int unsigned not null,
    primary key (id),
    foreign key (batting_team_id) references team(id),
    foreign key (bowling_team_id) references team(id),
    index iid(batting_team_id, bowling_team_id)
);    

insert into innings values (1,'FIRST',2,1);
insert into innings values (2,'SECOND',1,2);

drop table if exists score;
create table if not exists score(
	id int unsigned auto_increment unique not null,
    runs int not null,
    wickets int not null,
    balls_played int not null,
    total_balls int not null,
    innings_id int unsigned not null,
    primary key (id),
    foreign key (innings_id) references innings(id),
    index scoreid(id)
);

insert into score values (1, 128, 8, 120, 120, 1);
insert into score values (2, 130, 4, 98, 120, 2);


drop table if exists outcome;
create table if not exists outcome(
	id int unsigned auto_increment unique not null,
    mom_id int unsigned not null,
    innings1_score_id int unsigned not null,
    innings2_score_id int unsigned not null,
    isDL boolean not null,
    type enum('runs','wickets','draw','cancelled'),
    win_margin int not null,
    target_runs int not null,
    target_balls int not null,
    primary key (id),
    foreign key (innings1_score_id) references score(id),
    foreign key (innings2_score_id) references score(id),
    foreign key (mom_id) references player(id),
    index oid(id, mom_id)
);

insert into outcome values (1, 1, 1, 2, false, 'wickets', 6, 129, 120);




drop table if exists mtm;
create table if not exists mtm(
	id int unsigned auto_increment unique not null,
    team1_id int unsigned not null,
    team2_id int unsigned not null,
    team1_captain_id int unsigned not null,
    team2_captain_id int unsigned not null,
    team1_vcaptain_id int unsigned not null,
    team2_vcaptain_id int unsigned not null,
    primary key (id),
    foreign key (team1_id) references team(id),
    foreign key (team2_id) references team(id),
    foreign key (team1_captain_id) references player(id),
    foreign key (team2_captain_id) references player(id),
    foreign key (team1_vcaptain_id) references player(id),
    foreign key (team2_vcaptain_id) references player(id),
    index mtmid(team1_id, team2_id, team2_captain_id, team1_captain_id)
);

insert into mtm values (1, 1, 2, 1, 2, 4, 3);

drop table if exists match_details;
create table if not exists match_details(
	id int unsigned auto_increment unique not null,
    mtm_id int unsigned not null,
    toss_id int unsigned not null,
    stadium_id int unsigned not null,
    weather_id int unsigned not null,
    outcome_id int unsigned not null,
    date date not null,
    primary key (id),
    foreign key (mtm_id) references mtm(id),
    foreign key (toss_id) references toss(id),
    foreign key (stadium_id) references stadium(id),
    foreign key (weather_id) references weather(id),
    foreign key (outcome_id) references outcome(id),
    index mdid(id)
);

INSERT INTO match_details VALUES (1, 1, 1, 1, 1, 1, "2019-03-23 20:00:00");
INSERT INTO match_details VALUES (2, 1, 1, 1, 1, 1, "2019-03-23 20:00:00");
INSERT INTO match_details VALUES (3, 1, 1, 1, 1, 1, "2019-03-23 20:00:00");
INSERT INTO match_details VALUES (4, 1, 1, 1, 1, 1, "2019-03-23 20:00:00");
INSERT INTO match_details VALUES (5, 1, 1, 1, 1, 1, "2019-03-23 20:00:00");
INSERT INTO match_details VALUES (6, 1, 1, 1, 1, 1, "2019-03-23 20:00:00");
INSERT INTO match_details VALUES (7, 1, 1, 1, 1, 1, "2019-03-23 20:00:00");
INSERT INTO match_details VALUES (8, 1, 1, 1, 1, 1, "2019-03-23 20:00:00");
INSERT INTO match_details VALUES (9, 1, 1, 1, 1, 1, "2019-03-23 20:00:00");
INSERT INTO match_details VALUES (10, 1, 1, 1, 1, 1, "2019-03-23 20:00:00");



DROP TABLE IF EXISTS fixture;
CREATE TABLE IF NOT EXISTS fixture(
	id int unsigned auto_increment unique not null,
	year int unsigned not null,
	date_time datetime not null,
	stadium_id int unsigned not null,
	team1_id int unsigned not null,
	team2_id int unsigned not null,
	primary key (id),
	foreign key (stadium_id) references stadium(id),
	foreign key (team1_id) references team(id),
	foreign key (team2_id) references team(id),
	index fixture(date_time, team1_id, team2_id)
);

INSERT INTO fixture VALUES(1, 2019, "2019-03-23 20:00:00", 1, 1, 3);
INSERT INTO fixture VALUES(2, 2019, "2019-03-23 16:00:00", 7, 7, 8);
INSERT INTO fixture VALUES(3, 2019, "2019-03-24 20:00:00", 2, 2, 5);
INSERT INTO fixture VALUES(4, 2019, "2019-03-25 20:00:00", 6, 6, 4);
INSERT INTO fixture VALUES(5, 2019, "2019-03-26 20:00:00", 5, 5, 1);
INSERT INTO fixture VALUES(6, 2019, "2019-03-27 20:00:00", 7, 7, 4);
INSERT INTO fixture VALUES(7, 2019, "2019-03-28 20:00:00", 3, 3, 2);
INSERT INTO fixture VALUES(8, 2019, "2019-03-29 20:00:00", 8, 8, 6);
INSERT INTO fixture VALUES(9, 2019, "2019-03-30 16:00:00", 4, 4, 2);
INSERT INTO fixture VALUES(10, 2019, "2019-03-30 20:00:00", 5, 5, 7);


DROP TABLE IF EXISTS fmm;
CREATE TABLE IF NOT EXISTS fmm (
	id int unsigned auto_increment unique not null,
	fixture_id int unsigned unique not null,
	match_details_id int unsigned unique not null,
	primary key (id),
	foreign key (fixture_id) references fixture(id),
	foreign key (match_details_id) references match_details(id),
	index fmm(fixture_id, match_details_id)
);



drop table if exists review;
create table if not exists review (
	id int unsigned auto_increment unique not null,
    team_id int unsigned not null,
    match_details_id int unsigned not null,
    innings_id int unsigned not null,
    reviews_taken int not null,
    reviews_successful int not null,
    primary key (id),
    foreign key (team_id) references team(id),
    foreign key (match_details_id) references match_details(id),
    foreign key (innings_id) references innings(id),
    index rid(id)
);

insert into review values(1, 1, 1, 1, 2, 1);
insert into review values(2, 2, 1, 1, 1, 0);
insert into review values(3, 1, 1, 2, 1, 0);
insert into review values(4, 2, 1, 2, 1, 0);

drop table if exists wicket;
create table if not exists wicket(
	id int unsigned auto_increment unique not null,
	type enum('bwld', 'cght', 'run-out', 'hit-wic', 'lbw', 'stumps'),
	match_details_id int unsigned not null,
	bowler_id int unsigned not null,
	fielder_id int unsigned not null,
	player_out_id int unsigned not null,
	primary key (id),
	foreign key (match_details_id) references match_details(id),
	foreign key (bowler_id) references player(id),
	foreign key (fielder_id) references player(id),
	foreign key (player_out_id) references player(id),
	index wicketid(id, bowler_id, fielder_id, player_out_id)
);

insert into wicket values (1, 'bwld',1,4,4,2);
insert into wicket values (2, 'cght',1,3,2,1);

drop table if exists overs;
create table if not exists overs(
	id int unsigned auto_increment unique not null,
	match_details_id int unsigned not null,
	innings_id int unsigned not null,
	bowler_id int unsigned not null,
	runs int not null,
	wickets int not null,
    extras int not null,
    dots int not null,
    ones int not null,
	twos int not null,
	threes int not null,
	four int not null,
	fives int not null,
	sixes int not null,
	primary key (id),
	foreign key (match_details_id) references match_details(id),
	foreign key (innings_id) references innings(id),
	foreign key (bowler_id) references player(id),
	index oversid(id, bowler_id)
);

insert into overs values (1,1,1,4,11,1,2,3,1,0,0,2,0,0);
insert into overs values (2,1,2,3,15,0,1,3,0,0,0,2,0,1);

drop table if exists ball;
create table if not exists ball(
	id int unsigned auto_increment unique not null,
	match_details_id int unsigned not null,
	bowler_id int unsigned not null,
	striker_id int unsigned not null,
	non_striker_id int unsigned not null,
	overs_id int unsigned not null,
	innings_id int unsigned not null,
	wicket_id int unsigned not null,
    runs int unsigned not null,
    extras enum('wide', 'noball', 'bye','legbye','penalty','overthrow', 'none'),
    is_boundary_four boolean,
    is_boundary_six boolean,
	primary key (id),
	foreign key (match_details_id) references match_details(id),
	foreign key (bowler_id) references player(id),
	foreign key (striker_id) references player(id),
	foreign key (non_striker_id) references player(id),
	foreign key (overs_id) references overs(id),
	foreign key (innings_id) references innings(id),
	index bid(id, bowler_id, striker_id)
);

insert into ball values(1, 1, 4, 1, 4, 2, 2, 0, 6, 'none' , false, true);

drop table if exists BMD;
create table if not exists BMD(
	id int unsigned auto_increment unique not null,
	match_details_id int unsigned not null,
	innings_id int unsigned not null,
	wicket_id int unsigned not null,
	batsman_id int unsigned not null,
	balls int not null,
	runs int not null,
	dots int not null,
	ones int not null,
	twos int not null,
	threes int not null,
	fours int not null,
	fives int not null,
	sixes int not null,
	primary key (id),
	foreign key (match_details_id) references match_details(id),
	foreign key (batsman_id) references player(id),
	foreign key (innings_id) references innings(id),
	foreign key (wicket_id) references wicket(id),
	index BMDid(id)
);
insert into BMD values (1,1,1,1,1,16,27,5,5,2,0,3,0,1);
insert into BMD values (2,1,2,2,2,54,116,25,20,20,0,4,0,5);