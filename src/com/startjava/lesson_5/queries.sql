SELECT * FROM Robots;
SELECT * FROM Robots WHERE status = 'Active';
SELECT * FROM Robots WHERE mark = 'Mark-1' OR mark = 'Mark-5';
SELECT * FROM Robots ORDER BY mark DESC;
SELECT * FROM Robots WHERE launch IN (SELECT MIN(launch) FROM Robots);
SELECT * FROM Robots WHERE kaijuKill IN (SELECT MIN(kaijuKill) FROM Robots);
SELECT * FROM Robots WHERE kaijuKill IN (SELECT MAX(kaijuKill) FROM Robots);
SELECT AVG(weight) FROM Robots;
UPDATE Robots SET kaijuKill = kaijuKill + 1 WHERE status = 'Active';
DELETE FROM Robots WHERE status = 'Destroyed';