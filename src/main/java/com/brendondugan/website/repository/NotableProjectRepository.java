package com.brendondugan.website.repository;

import com.brendondugan.website.bean.NotableProject;
import org.springframework.data.repository.CrudRepository;

public interface NotableProjectRepository extends CrudRepository<NotableProject, Integer> {
}
