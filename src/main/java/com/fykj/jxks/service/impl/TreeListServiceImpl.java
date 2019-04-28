package com.fykj.jxks.service.impl;

import com.fykj.jxks.entity.User;
import com.fykj.jxks.mapper.TreeListDao;
import com.fykj.jxks.service.ITreeListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TreeListServiceImpl implements ITreeListService {

    @Autowired
    private TreeListDao treeListDao ;

    @Override
    public Map getTreeList(String project) {
        //获取科目下有多少章
        if("".equals(project) || null==project){
            project ="1";
        }
        List chapterList = treeListDao.getChapterByProjectNum(project);
        Map chapterMap = new HashMap();
        //获取总的章数
        chapterMap.put("chapterSum",chapterList.size());
        for(int i=0;i<chapterList.size();i++){
            //获取该章下的所有节的信息
            List sectionList = treeListDao.getSectionsByChapter(project,chapterList.get(i).toString());
            Map sectionMap = new HashMap();
            //根据节获取所有的课
            for(int j=0;j<sectionList.size();j++){
                List courseList = treeListDao.getCourseByChapter(project,chapterList.get(i).toString(),sectionList.get(j).toString());
                sectionMap.put("section_"+sectionList.get(j).toString(),courseList);
                sectionMap.put("sectionSum",sectionList.size());
            }
            chapterMap.put("chapter_"+chapterList.get(i),sectionMap);
        }
       return chapterMap;
    }

    @Override
    public List getChapterList(String project) {
        //获取科目下有多少章
        if("".equals(project) || null==project){
            project ="1";
        }
        return treeListDao.getChapterByProjectNum(project);
    }

    @Override
    public List getSectionList(String project, String chapter) {
        if("".equals(project) || null==project){
            project ="1";
        }
        if("".equals(chapter) || null==chapter){
            chapter ="1";
        }
        return treeListDao.getSectionList(project,chapter);
    }

    @Override
    public List getCourseList(String project, String chapter, String section) {
        if("".equals(project) || null==project){
            project ="1";
        }
        if("".equals(chapter) || null==chapter){
            chapter ="1";
        }
        if("".equals(section) || null==section){
            section ="1";
        }
        return treeListDao.getCourseList(project,chapter,section);
    }

}
