package net.atmacacode.blog.controller;

import net.atmacacode.blog.core.RequestMessage;
import net.atmacacode.blog.dto.BlogDTO;
import net.atmacacode.blog.dto.BlogUpdate;
import net.atmacacode.blog.entities.Blog;
import net.atmacacode.blog.services.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/blogs")
public class BlogController {

    @Autowired
    BlogService blogService;

    @PostMapping()
    RequestMessage createBlog(@RequestBody BlogDTO blogDTO) {
        blogService.save(blogDTO.toBlog());
        return new RequestMessage("Blog Oluşturuldu");
    }

    @GetMapping("/{id}")
    BlogDTO getBlogById(@PathVariable long id) {
        return new BlogDTO(blogService.getBlogById(id));
    }

    @GetMapping()
    List<Blog> getBlogs() {
        return blogService.getAllBlogs();
    }

    @PutMapping()
    RequestMessage updateBlog(@PathVariable long id, @RequestBody BlogUpdate blogUpdate) {
        blogService.update(id, blogUpdate);
        return new RequestMessage("Blog Güncellendi");
    }

    @DeleteMapping()
    RequestMessage deleteBlog(@PathVariable long id) {
        blogService.delete(id);
        return new RequestMessage("Blog Silindi");
    }

}
