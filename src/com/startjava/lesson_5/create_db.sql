CREATE DATABASE jaegers;
\c jaegers;
CREATE TABLE Robots(
    id SERIAL PRIMARY KEY,
    modelName TEXT,
    mark TEXT,
    height FLOAT(8),
    weight FLOAT(8),
    status TEXT,
    origin TEXT,
    launch DATE,
    kaijuKill INTEGER
);