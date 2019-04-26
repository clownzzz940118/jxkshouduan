package com.fykj.jxks.controller;

import com.alibaba.fastjson.JSON;
import com.fykj.jxks.service.ITreeListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@ResponseBody
public class TreeListController {

    @Autowired
    private ITreeListService treeListService;
    @PostMapping("/getTreeList")
    public String getTreeList(String project){
       return JSON.toJSONString(treeListService.getTreeList(project)) ;
    }

    @PostMapping("/getChapterList")
    public String getChapterList(String project){
        return JSON.toJSONString(treeListService.getChapterList(project)) ;
    }

    @PostMapping("/getSectionList")
    public String getSectionList(String project,String chapter){
        return JSON.toJSONString(treeListService.getSectionList(project,chapter)) ;
    }


    @PostMapping("/getCourseList")
    public String getCourseList(String project,String chapter,String section){
        return JSON.toJSONString(treeListService.getCourseList(project,chapter,section)) ;
    }


}
