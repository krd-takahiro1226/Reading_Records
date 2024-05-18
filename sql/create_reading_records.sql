CREATE TABLE reading_records (
    book_name VARCHAR(30) NOT NULL,
    author VARCHAR(30) NOT NULL,
    start_date DATE,
    end_date DATE,
    read_count INT,
    genre VARCHAR(20),
    priority INT,
    memo VARCHAR(100),
    PRIMARY KEY (book_name)
);
