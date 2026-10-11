package com.TLP.joblisting.repository;

import com.TLP.joblisting.model.Post;
import java.util.List;

public interface SearchRepository {
    List<Post> findBytext(String text);
}
