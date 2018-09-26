USE `recipeproject`;

INSERT INTO `User`(`Id`,`Username`,`Password`) VALUES
('1','Michael', 'xddddd'),
('2','Lasse', '1337360'),
('3','Christian', 'narh');

INSERT INTO `Recipe`(`Id`,`Name`,`Description`,`To_do`,`Cookingtime`, `Image`, `User_Id`) VALUES
('1', 'Kage', 'Quick and easy guide to our amazing pokemon cake!', '1. Put the cake in the oven. 2. Done', '120', 'images/kage.jpg', '1'),
('2', 'Milkshake', 'Quick and easy guide to our amazing pokemon milkshake!', '1. Mix the milkshake powder with milk. 2. Done', '2', 'images/milkshake.jpg', '2');

INSERT INTO `Ingredient`(`Id`, `Name`) VALUES
('1', 'Cakemix'),
('2', 'Milkshake powder');

INSERT INTO `Recipe_has_ingredient`(`Recipe_Id`,`Ingredient_Id`,`Amount`,`Measure`) VALUES
('1', '1', '1', 'Packet'),
('2','2','1','Packet');