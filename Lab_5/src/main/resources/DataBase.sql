CREATE TABLE Students (
    ID INT PRIMARY KEY,
    Lastname VARCHAR(50),
    Firstname VARCHAR(50),
    Patronymic VARCHAR(50),
    Birthdate DATE,
    StudentID VARCHAR(20)
);

INSERT INTO Students (ID, Lastname, Firstname, Patronymic, Birthdate, StudentID)
VALUES
    (1, 'Bespalova', 'Kateryna', 'Yuriivna', '2003-01-11', 'A12345678'),
    (2, 'Petrov', 'Petr', 'Petrovich', '1999-05-12', 'B98765432'),
    (3, 'Sidorov', 'Sidor', 'Sidorovich', '2001-08-23', 'C24681357'),
    (4, 'Smith', 'John', 'David', '1998-03-15', 'D98765432'),
    (5, 'Johnson', 'Michael', 'Robert', '2002-09-30', 'E54321678'),
    (6, 'Brown', 'Jennifer', 'Elizabeth', '1997-07-10', 'F13579246'),
    (7, 'Taylor', 'Emma', 'Grace', '2003-12-05', 'G65432187'),
    (8, 'Anderson', 'Daniel', 'James', '1999-04-20', 'H87654321'),
    (9, 'Martinez', 'Sophia', 'Isabella', '2001-11-18', 'I36985214'),
    (10, 'Harris', 'David', 'Andrew', '1998-02-28', 'J75395148'),
    (11, 'Clark', 'Olivia', 'Emily', '2002-03-25', 'K95175384'),
    (12, 'Lewis', 'Matthew', 'Joseph', '1997-09-08', 'L25814796'),
    (13, 'Lee', 'Jessica', 'Nicole', '2000-10-16', 'M74185296'),
    (14, 'Walker', 'Daniel', 'Thomas', '1999-03-24', 'N36987412'),
    (15, 'Allen', 'Sophia', 'Grace', '2001-05-09', 'O12345698'),
    (16, 'Baker', 'Christopher', 'William', '1998-08-13', 'P98765421'),
    (17, 'Garcia', 'Emily', 'Sofia', '2003-02-17', 'Q74185296'),
    (18, 'King', 'Alexander', 'Michael', '1997-12-03', 'R25836914'),
    (19, 'Adams', 'Isabella', 'Charlotte', '2000-04-29', 'S96385274'),
    (20, 'Wright', 'Daniel', 'Jacob', '1999-07-07', 'T45678912')
;
