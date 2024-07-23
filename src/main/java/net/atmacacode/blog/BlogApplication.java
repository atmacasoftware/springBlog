package net.atmacacode.blog;

import net.atmacacode.blog.dao.BlogRepository;
import net.atmacacode.blog.dao.UserRepository;
import net.atmacacode.blog.entities.Blog;
import net.atmacacode.blog.entities.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class BlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }



















    @Bean
    CommandLineRunner userCreator(UserRepository userRepository){
        return (args) -> {
            for(var i=1; i<=25;i++){
                User user = new User();
                user.setUsername("user"+i);
                user.setEmail("user"+i+"@gmail.com");
                user.setPassword("P1ssword");
                userRepository.save(user);
            }
        };
    }

    @Bean
    CommandLineRunner blogCreator(BlogRepository blogRepository){
        return (args) -> {
            for(var i=1; i<=25;i++){
                Blog blog = new Blog();
                blog.setTitle("Blog "+i);
                blog.setAuthor("Atmaca Code " + i);
                blog.setPublished(true);
                blog.setPublishedDate(LocalDateTime.now());
                blog.setContent("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
                blogRepository.save(blog);
            }
        };
    }


}
