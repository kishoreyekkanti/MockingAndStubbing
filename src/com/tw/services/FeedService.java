package com.tw.services;


import com.tw.dao.FeedDao;
import com.tw.models.*;

import java.util.List;


public class FeedService {
    FeedDao feedDao = new FeedDao();
    public List<Feed> fetchFeeds(User user){
        List<Feed> feeds = feedDao.getFeeds(user);//some resource Intesive Operation returning Feed.
        return feeds;
    }



    //fetch tags starting with name ruby
}
