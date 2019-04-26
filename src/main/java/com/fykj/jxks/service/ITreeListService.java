package com.fykj.jxks.service;

import java.util.List;
import java.util.Map;

public interface ITreeListService {

    Map getTreeList(String project);

    List getChapterList(String project);

    List getSectionList(String project, String chapter);

    List getCourseList(String project, String chapter, String section);
}
