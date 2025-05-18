package com.javarush.task.sql.task10.task1005;

import com.javarush.task.sql.task10.task1001.MySessionFactory;
import com.javarush.task.sql.task10.task1002.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;
import com.javarush.task.sql.task10.task1005.entities.Book;

import java.util.List;

/* 
task1005
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        List<Book> books = null;

        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            String hql = "from book where author.full_name = 'Mark Twain' and publisher.name = 'Фолио'";
            Query<Book> query = session.createQuery(hql, Book.class);
            books = query.list();
        }

        books.forEach(System.out::println);
    }
}