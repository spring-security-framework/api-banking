package com.vn.repo;

import com.vn.model.Notice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoticeRepo extends JpaRepository<Notice, Integer> {
    @Query(value = """
        SELECT n
        FROM Notice n 
        WHERE CURDATE() BETWEEN n.noticBegDt AND n.noticEndDt
    """)
    List<Notice> findAllActiveNotices();
}
