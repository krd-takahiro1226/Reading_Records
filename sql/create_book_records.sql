CREATE TABLE IF NOT EXISTS book_records (
    ISBN VARCHAR(13) PRIMARY KEY,
    book_name VARCHAR(30) NOT NULL,
    author VARCHAR(30) NOT NULL,
    genre VARCHAR(20),
    publication_year DATE,
    publisher VARCHAR(100)
);
