package com.accapstone.capstoneback.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "blogpost")
public class BlogPost {
     
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private long id;
     
     @Column(name = "user_name")
     private String user;

     @Column(name = "content")
     private String content;

     public BlogPost() {

     }

     public BlogPost(String user, String content) {
          super();
          this.user = user;
          this.content = content;
     }

     public long getId() {
          return id;
     }
     public void setId(long id) {
          this.id = id;
     }
     public String getUser() {
          return user;
     }
     public void setUser(String User) {
          this.user = user;
     }
     public String getContent() {
          return content;
     }
     public void setContent() {
          this.content = content;
     }
}
