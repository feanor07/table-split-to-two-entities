DROP TABLE IF EXISTS book;

CREATE TABLE book (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  author VARCHAR(250) NOT NULL,
  name VARCHAR(250) NOT NULL,
  publish_year SMALLINT NOT NULL,
  version int NOT NULL
);

INSERT INTO book(id, author, name, publish_year, version) values(1, 'Aylak Adam', 'Yusuf Atilgan', 1959, 0);
INSERT INTO book(id, author, name, publish_year, version) values(2, 'Tutunamayanlar', 'Oguz Atay', 1972, 0);
INSERT INTO book(id, author, name, publish_year, version) values(3, 'Puslu Kitalar Atlasi', 'Ihsan Oktay Anar', 1995, 0);
INSERT INTO book(id, author, name, publish_year, version) values(4, 'Kara Kitap', 'Orhan Pamuk', 1994, 0);
INSERT INTO book(id, author, name, publish_year, version) values(5, 'Yaban', 'Yakup Kadri Karaosmanoglu', 1932, 0);
INSERT INTO book(id, author, name, publish_year, version) values(6, 'Kurtlar Kanunu', 'Kemal Tahir', 1972, 0);
INSERT INTO book(id, author, name, publish_year, version) values(7, 'Gun Olur Asra Bedel', 'Cengiz Aytmatov', 1981, 0);