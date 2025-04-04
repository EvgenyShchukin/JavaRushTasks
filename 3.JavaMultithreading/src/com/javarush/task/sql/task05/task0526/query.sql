-- Write your code here:
SELECT
    b.publication_year AS publication_year,
    b.isbn,
    b.title,
    a.full_name AS author,
    p.name AS publisher
FROM
    book b
        JOIN
    author a ON b.author_id = a.id
        JOIN
    publisher p ON b.publisher_id = p.id