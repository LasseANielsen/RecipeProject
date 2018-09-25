USE `recipeproject`;

INSERT INTO `Image`(`id`, `url`) VALUES
('1', 'url'),
('2', 'url');

INSERT INTO `Recipe`(`id`,`name`,`ingredients`,`instructions`,`image_id`,`rating`) VALUES
('1','Kage', 'Kagedej','Læg kagedejen i et fad og så i ovnen til den ser god ud!','1','5'),
('2','Milkshake', 'Mælk, Milkshake pulver','Blandet de to ting og bum!','2','4');

INSERT INTO `User`(`id`,`name`,`password`,`recipe_id`) VALUES
('1','Michael', 'xddddd','1'),
('2','Lasse', '1337360','2'),
('3','Christian', 'narh', NULL);