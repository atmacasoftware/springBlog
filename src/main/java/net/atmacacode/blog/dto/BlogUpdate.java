package net.atmacacode.blog.dto;

import net.atmacacode.blog.entities.Blog;

import java.time.LocalDateTime;

public class BlogUpdate {
    private String title;
    private String content;
    private String author;
    private boolean isPublished;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isPublished() {
        return isPublished;
    }

    public void setPublished(boolean published) {
        isPublished = published;
    }
}
