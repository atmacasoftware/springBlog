package net.atmacacode.blog.services;

import net.atmacacode.blog.dao.BlogRepository;
import net.atmacacode.blog.dto.BlogUpdate;
import net.atmacacode.blog.entities.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BlogService {

    @Autowired
    BlogRepository blogRepository;


    public void save(Blog blog) {
        blogRepository.save(blog);
    }

    public Blog getBlogById(long id) {
        return blogRepository.findById(id).orElseThrow();
    }

    public List<Blog> getAllBlogs() {
        return blogRepository.findAll();
    }

    public void update(Long id, BlogUpdate blogUpdate) {
        Blog inDb = this.getBlogById(id);
        inDb.setTitle(blogUpdate.getTitle());
        inDb.setContent(blogUpdate.getContent());
        inDb.setUpdatedDate(LocalDateTime.now());
        inDb.setAuthor(blogUpdate.getAuthor());
        inDb.setUpdatedDate(LocalDateTime.now());
        blogRepository.save(inDb);
    }

    public void delete(long id) {
        Blog inDb = this.getBlogById(id);
        blogRepository.delete(inDb);
    }

}
