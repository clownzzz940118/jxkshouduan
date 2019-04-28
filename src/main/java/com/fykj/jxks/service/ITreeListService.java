package com.fykj.jxks.service;

import com.fykj.jxks.entity.User;

import java.util.List;
import java.util.Map;


public interface ITreeListService {

    Map getTreeList(String project);

    List getChapterList(String project);

    List getSectionList(String project, String chapter);

    List getCourseList(String project, String chapter, String section);
}
