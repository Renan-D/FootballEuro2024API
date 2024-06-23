-- Insert Tournament Groups
INSERT INTO tournament_group (id, name) VALUES (1, 'Group A');
INSERT INTO tournament_group (id, name) VALUES (2, 'Group B');
INSERT INTO tournament_group (id, name) VALUES (3, 'Group C');
INSERT INTO tournament_group (id, name) VALUES (4, 'Group D');
INSERT INTO tournament_group (id, name) VALUES (5, 'Group E');
INSERT INTO tournament_group (id, name) VALUES (6, 'Group F');

-- Insert Teams
INSERT INTO team (id, country, tournament_group_id) VALUES (1, 'Germany', 1);
INSERT INTO team (id, country, tournament_group_id) VALUES (2, 'Switzerland', 1);
INSERT INTO team (id, country, tournament_group_id) VALUES (3, 'Scotland', 1);
INSERT INTO team (id, country, tournament_group_id) VALUES (4, 'Hungary', 1);

INSERT INTO team (id, country, tournament_group_id) VALUES (5, 'Spain', 2);
INSERT INTO team (id, country, tournament_group_id) VALUES (6, 'Italy', 2);
INSERT INTO team (id, country, tournament_group_id) VALUES (7, 'Albania', 2);
INSERT INTO team (id, country, tournament_group_id) VALUES (8, 'Croatia', 2);

INSERT INTO team (id, country, tournament_group_id) VALUES (9, 'England', 3);
INSERT INTO team (id, country, tournament_group_id) VALUES (10, 'Denmark', 3);
INSERT INTO team (id, country, tournament_group_id) VALUES (11, 'Slovenia', 3);
INSERT INTO team (id, country, tournament_group_id) VALUES (12, 'Serbia', 3);

INSERT INTO team (id, country, tournament_group_id) VALUES (13, 'France', 4);
INSERT INTO team (id, country, tournament_group_id) VALUES (14, 'Netherlands', 4);
INSERT INTO team (id, country, tournament_group_id) VALUES (15, 'Poland', 4);
INSERT INTO team (id, country, tournament_group_id) VALUES (16, 'Austria', 4);

INSERT INTO team (id, country, tournament_group_id) VALUES (17, 'Belgium', 5);
INSERT INTO team (id, country, tournament_group_id) VALUES (18, 'Romania', 5);
INSERT INTO team (id, country, tournament_group_id) VALUES (19, 'Slovakia', 5);
INSERT INTO team (id, country, tournament_group_id) VALUES (20, 'Ukraine', 5);

INSERT INTO team (id, country, tournament_group_id) VALUES (21, 'Portugal', 6);
INSERT INTO team (id, country, tournament_group_id) VALUES (22, 'Turkey', 6);
INSERT INTO team (id, country, tournament_group_id) VALUES (23, 'Czech Republic', 6);
INSERT INTO team (id, country, tournament_group_id) VALUES (24, 'Georgia', 6);

-- Insert Stadiums
INSERT INTO stadium (id, name, city, capacity) VALUES (1, 'Olympiastadion', 'Berlin', 70033);
INSERT INTO stadium (id, name, city, capacity) VALUES (2, 'Allianz Arena', 'Munich', 66026);
INSERT INTO stadium (id, name, city, capacity) VALUES (3, 'BVB Stadion', 'Dortmund', 61524);
INSERT INTO stadium (id, name, city, capacity) VALUES (4, 'Arena Stuttgart', 'Stuttgart', 50998);
INSERT INTO stadium (id, name, city, capacity) VALUES (5, 'Arena AufSchalke', 'Gelsenkirchen', 49471);
INSERT INTO stadium (id, name, city, capacity) VALUES (6, 'Hamburg Arena', 'Hamburg', 50215);
INSERT INTO stadium (id, name, city, capacity) VALUES (7, 'Frankfurt Stadion', 'Frankfurt', 48057);
INSERT INTO stadium (id, name, city, capacity) VALUES (8, 'Dusseldorf Arena', 'Düsseldorf', 46264);
INSERT INTO stadium (id, name, city, capacity) VALUES (9, 'Stadion Koln', 'Cologne', 46922);
INSERT INTO stadium (id, name, city, capacity) VALUES (10, 'RB Arena', 'Leipzig', 46635);


-- Insert Knockout Stages
INSERT INTO knockout_stage (id, stage_name) VALUES (1, 'GROUP_STAGE');
INSERT INTO knockout_stage (id, stage_name) VALUES (2, 'ROUND_OF_16');
INSERT INTO knockout_stage (id, stage_name) VALUES (3, 'QUARTER_FINAL');
INSERT INTO knockout_stage (id, stage_name) VALUES (4, 'SEMI_FINAL');
INSERT INTO knockout_stage (id, stage_name) VALUES (5, 'FINAL');

-- Insert Players
INSERT INTO player (id, name, birth_date, position, team_id) VALUES (1, 'Kylian Mbappe', '1998-12-20', 'FORWARD', 13);

-- Insert Referees
INSERT INTO referee (id, name, birth_date) VALUES (1, 'Clément Turpin', '1982-05-16');

-- Insert Coaches
INSERT INTO coach (id, name, birth_date, nationality, team_id) VALUES (1, 'Didier Deschamps', '1968-10-15', 'French', 13);

-- Insert Games

-- Insert Events

-- Link Referees to Games