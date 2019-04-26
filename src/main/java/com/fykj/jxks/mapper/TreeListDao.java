package com.fykj.jxks.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TreeListDao {

    List getChapterByProjectNum(@Param("project")String project);

    List getSectionsByChapter(@Param("project")String project,@Param("chapter") String chapter);

    List getCourseByChapter(@Param("project")String project, @Param("chapter")Object chapter,@Param("section") String section);

    List getSectionList(@Param("project")String project,@Param("chapter") String chapter);

    List getCourseList(@Param("project")String project,@Param("chapter") String chapter,@Param("section") String section);
}
