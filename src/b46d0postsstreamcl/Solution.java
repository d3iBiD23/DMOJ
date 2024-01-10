package b46d0postsstreamcl;

import java.util.Scanner;

class Author {
    String name;
    String photoURL;
}

class Post {
    Author author;
    String content;
}

class Stream {
    Post[] posts;
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nPosts = scanner.nextInt();
        scanner.nextLine(); // Consumir la línea en blanco después del número de posts

        Stream stream = new Stream();
        stream.posts = new Post[nPosts];

        for (int i = 0; i < nPosts; i++) {
            stream.posts[i] = new Post(); // Inicializar el objeto Post antes de usarlo

            String authorInfo = scanner.nextLine();
            String[] authorData = authorInfo.split(" ", 3);

            stream.posts[i].author = new Author();
            stream.posts[i].author.name = authorData[0];
            stream.posts[i].author.photoURL = (authorData[1].equals("null")) ? null : authorData[1];
            stream.posts[i].content = authorData[2];
        }

        for (int i = 0; i < nPosts; i++) {
            System.out.println(stream.posts[i].author.name);
            System.out.println(stream.posts[i].content);
            System.out.println("------------------------------");
        }
    }
}